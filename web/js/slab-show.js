//时间格式化处理
function dateFtt(fmt, date) { //author: meizz
    var date = date ? new Date(date) : new Date();
    var o = {
        "M+": date.getMonth() + 1,                 //月份
        "d+": date.getDate(),                    //日
        "H+": date.getHours(),                   //小时
        "m+": date.getMinutes(),                 //分
        "s+": date.getSeconds(),                 //秒
        "q+": Math.floor((date.getMonth() + 3) / 3), //季度
        "S": date.getMilliseconds()             //毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

function getStringByDate(dateParameter) {
    var translateDate = dateParameter.replace("-", "/").replace("-", "/");
    return new Date(translateDate);
}

//返回两个时间的分钟差
function getMsecDateDifference(dateBegin, dateEnd) {
    return (getStringByDate(dateEnd).getTime() - getStringByDate(dateBegin).getTime());
}

function msecToTime(value) {
    var hours = parseInt(parseInt(parseInt(value / 1000) / 60) / 60) % 60;
    hours = hours > 10 ? hours.toString() : '0' + hours;
    var minutes = parseInt(parseInt(value / 1000) / 60) % 60;
    minutes = minutes > 10 ? minutes.toString() : '0' + minutes;
    var seconds = parseInt(value / 1000) % 60;
    seconds = seconds > 10 ? seconds.toString() : '0' + seconds;
    return hours + ':' + minutes + ':' + seconds;
}

var allMeetingMessage = []; //当前会议室所有会议信息
var atPresentMeeting = null;  //正在开的会议对象
//加载更新数据
function updateDate(dataArr) {
    $('.meeting-message-data').parent().stop(); //停止滑动条
    $('.add-table-tr').remove();
    for (var o in dataArr) {
        var trObj = $('<tr><td>' + dataArr[o]['meetingTheme'] + '</td><td>' + dataArr[o]['meetingBeginDate'].split(' ')[1] + ' - ' + dataArr[o]['meetingEndDate'].split(' ')[1] +
            '</td><td>' + dataArr[o]['meetingEndDate'].split(' ')[0] + '</td><td>' + dataArr[o]['sponsorTrueName'] + '</td></tr>');
        trObj.addClass('add-table-tr');
        $('.meeting-root-data').append(trObj);
    }
}

function meetingFlag(flag) {
    if (flag) {
        if (atPresentMeeting != null) {
            $('.wrapper').css('color', 'red');
            $('.meeting-name').text(atPresentMeeting['meetingTheme']);
            $('.meeting-compere').text(atPresentMeeting['sponsorTrueName']);
            $('.meeting-date').text(atPresentMeeting['meetingBeginDate'].split(' ')[1] + ' - ' + atPresentMeeting['meetingEndDate'].split(' ')[1]);
            $('.meeting-count-down').text('倒计时：');
            $('.meeting-count-down').removeClass('layui-btn-disabled');
            $('.meeting-sign-in').text('签到');
            $('.meeting-sign-in').removeClass('layui-btn-disabled').addClass('layui-btn-danger');
        }
    } else {
        $('.wrapper').css('color', '#FFFFFF');
        $('.meeting-name').text('暂无会议');
        $('.meeting-compere').text('无');
        $('.meeting-date').text('无');
        $('.meeting-count-down').text('未开始');
        $('.meeting-count-down').addClass('layui-btn-disabled');
        $('.meeting-sign-in').text('未开始');
        $('.meeting-sign-in').addClass('layui-btn-disabled');
    }
}

//定时任务
function timeTask() {
    var weekday = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
    setInterval(function () {
        var date = new Date();
        var dateFt = dateFtt("yyyy-MM-dd HH:mm:ss");
        $('.date-show-div').text('当前日期为：' + dateFt + '   ' + weekday[date.getDay()]);
        if (atPresentMeeting == null) {
            for (var o in allMeetingMessage) {
                 if ((getMsecDateDifference(allMeetingMessage[o]['meetingBeginDate'], dateFt) >= 0) &&
                    (getMsecDateDifference(allMeetingMessage[o]['meetingEndDate'], dateFt) <= 0)) {
                    atPresentMeeting = allMeetingMessage[o];
                    meetingFlag(true);
                    break;
                }
            }
        } else {
            if (getMsecDateDifference(dateFt, atPresentMeeting['meetingEndDate']) <= 0) {
                meetingFlag(false);
                atPresentMeeting = null;
            } else {
                $('.meeting-count-down').text('倒计时：' + msecToTime(getMsecDateDifference(dateFt, atPresentMeeting['meetingEndDate'])));
            }
        }
    }, 900);

    //更新会议数据
    setInterval(function () {
        selectData();
    }, 20000);

    //服务器端设备在线访问
    setInterval(function () {
        onLine();
    }, 60000);
}

function onLine(){
    $.get('equipment/on-line', {uuid: GetQueryString('uuid')}, function () {

    }, 'json')
}

function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}

//向服务器申请数据
function selectData() {
    $.get('meeting/slab-all',{uuid: GetQueryString('uuid')}, function (result) {
        if (result.code == 200) {
            if (result.data != null) {
                for (var o in result.data) {
                    result.data[o]['meetingBeginDate'] = dateFtt('yyyy-MM-dd HH:mm:ss', result.data[o]['meetingBeginDate']);
                    result.data[o]['meetingEndDate'] = dateFtt('yyyy-MM-dd HH:mm:ss', result.data[o]['meetingEndDate']);
                }
                updateDate(result.data);
                allMeetingMessage = result.data;
                if ($('.meeting-root-data').parent().height() >= $('.meeting-root-data').parent().parent().height()) {
                    scrollRun($('.meeting-root-data').parent().parent(), $('.meeting-root-data').parent(), true);
                }
            }
        }
    }, 'json');

}

function scrollRun(obj, obj1, flag) {
    if (flag) {
        obj.animate({scrollTop: obj1.height() - obj.height()}, (obj1.height() - obj.height()) * 40, function () {
            scrollRun(obj, obj1, false);
        });
    } else {
        obj.animate({scrollTop: 0}, 1000, function () {
            scrollRun(obj, obj1, true);
        });
    }
}

layui.use('layer', function() { //独立版的layer无需执行这一句
    var layer = layui.layer;
});

$(function () {
    selectData();
    meetingFlag();
    timeTask();
    $.bounceDate({
        el: '#zzsc'
        , radius: 2
        , width: 300
        , u: 0.9
        , color: '#FFFFFF'
        , flag: false
    });

    // 鼠标移入移出事件
    $('.meeting-message-data').hover(function() {
        // 鼠标移入时添加hover类
        $(this).parent().stop();
    }, function() {
        // 鼠标移出时移出hover类
        if ($('.meeting-root-data').parent().height() >= $('.meeting-root-data').parent().parent().height()) {
            scrollRun($('.meeting-root-data').parent().parent(), $('.meeting-root-data').parent(), true);
        }
    });

    $('.meeting-sign-in').click(function () {
        var myThis = $(this);
        if(myThis.text() === '签到'){
            $('.meeting-sign-in').addClass('layui-btn-disabled');
            $.get('meeting/update-sign-in-state', {meetingId: atPresentMeeting.meetingId, signInState: 1}, function (result) {
                if(result.code == 200){
                    myThis.text('已签到');
                    layer.msg('签到成功', {icon: 6});
                }else {
                    $('.meeting-sign-in').removeClass('layui-btn-disabled');
                    layer.msg('签到失败,请重试', {icon: 5});
                    $(this).text() === '签到';
                }
            }, 'json').error(function () {
                $('.meeting-sign-in').removeClass('layui-btn-disabled');
                layer.msg('签到失败，请重试', {icon: 5});
                $(this).text() === '签到';
            });
        }
    });
    onLine();
    $('.the-reverse-side').css('border-top-width', $('body').height() + 'px');
    window.onresize = function () {
        $('.the-reverse-side').css('border-top-width', $('body').height() + 'px');
        console.log('窗口大小改变');
    }
})