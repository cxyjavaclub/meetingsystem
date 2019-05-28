//时间格式化处理
function dateFtt(fmt, value) { //author: meizz
    var date = value ? new Date(value) : new Date();
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
//返回两个时间的分钟差
function getMsecDateDifference(dateBegin, dateEnd) {
    return (getStringByDate(dateEnd).getTime() - getStringByDate(dateBegin).getTime());
}

function getStringByDate(dateParameter) {
    var translateDate = dateParameter.replace("-", "/").replace("-", "/");
    return new Date(translateDate);
}

//返回两个时间的分钟差
function getMinuteDateDifference(dateBegin, dateEnd) {
    return (getStringByDate(dateEnd).getTime() - getStringByDate(dateBegin).getTime()) / 1000 / 60;
}

function addByTransDate(dateParameter, num) {
    var translateDate = "", dateString = "", monthString = "", dayString = "";
    var newDate = getStringByDate(dateParameter);
    newDate = newDate.valueOf();
    newDate = newDate + num * 24 * 60 * 60 * 1000;
    newDate = new Date(newDate);
    //如果月份长度少于2，则前加 0 补位
    if ((newDate.getMonth() + 1).toString().length == 1) {
        monthString = 0 + "" + (newDate.getMonth() + 1).toString();
    } else {
        monthString = (newDate.getMonth() + 1).toString();
    }
    //如果天数长度少于2，则前加 0 补位
    if (newDate.getDate().toString().length == 1) {
        dayString = 0 + "" + newDate.getDate().toString();
    } else {
        dayString = newDate.getDate().toString();
    }
    dateString = newDate.getFullYear() + "-" + monthString + "-" + dayString;
    return dateString;
}

function reduceByTransDate(dateParameter, num) {
    var translateDate = "", dateString = "", monthString = "", dayString = "";
    var newDate = getStringByDate(dateParameter);
    newDate = newDate.valueOf();
    newDate = newDate - num * 24 * 60 * 60 * 1000;
    newDate = new Date(newDate);
    //如果月份长度少于2，则前加 0 补位
    if ((newDate.getMonth() + 1).toString().length == 1) {
        monthString = 0 + "" + (newDate.getMonth() + 1).toString();
    } else {
        monthString = (newDate.getMonth() + 1).toString();
    }
    //如果天数长度少于2，则前加 0 补位
    if (newDate.getDate().toString().length == 1) {
        dayString = 0 + "" + newDate.getDate().toString();
    } else {
        dayString = newDate.getDate().toString();
    }
    dateString = newDate.getFullYear() + "-" + monthString + "-" + dayString;
    return dateString;
}

//得到日期  主方法
function showTime(pdVal, text) {
    var trans_day = "";
    var cur_date = text ? new Date(text) : new Date();/* 如果日期框内为空的话就获取系统的时间为输入框初始化赋值，如果有值（用户自己选择的时间），那就获取用户自己选择的时间 */
    var cur_year = cur_date.getFullYear();
    var cur_month = cur_date.getMonth() + 1;
    var real_date = cur_date.getDate();
    cur_month = cur_month > 9 ? cur_month : ("0" + cur_month);
    real_date = real_date > 9 ? real_date : ("0" + real_date);
    eT = cur_year + "-" + cur_month + "-" + real_date;
    if (pdVal == 1) {
        trans_day = addByTransDate(eT, 1);
    } else if (pdVal == -1) {
        trans_day = reduceByTransDate(eT, 1);
    } else {
        trans_day = eT;
    }
    //处理
    return trans_day;
}
