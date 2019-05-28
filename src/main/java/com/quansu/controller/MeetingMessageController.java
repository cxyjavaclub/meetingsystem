package com.quansu.controller;

import com.github.pagehelper.PageInfo;
import com.quansu.pojo.MeetingEquipment;
import com.quansu.pojo.MeetingMessgae;
import com.quansu.service.EquipmentService;
import com.quansu.service.MeetingMessageService;
import com.quansu.utils.DateUtils;
import com.quansu.utils.JsonResponseUtils;
import com.quansu.utils.ObjectIfNullUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 * 会议操作
 */
@Controller
@RequestMapping("/meeting")
public class MeetingMessageController {

    @Autowired
    MeetingMessageService meetingMessageService;

    @Autowired
    EquipmentService equipmentService;

    /**
     * 通过userName获取会议
     *
     * @param userName
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public JsonResponseUtils getUserNameMeeting(String userName, HttpSession session, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "24") Integer pageSize) {
        if(userName == null){
            Object object = session.getAttribute("userName");
            userName = object == null ? "" : (String)object;
        }
        PageInfo pageInfo = meetingMessageService.findUserNameMeeting(userName, pageNum, pageSize);
        return JsonResponseUtils.layUiOk(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 获取待审核会议
     * @return
     */
    @RequestMapping("/check-pending")
    @ResponseBody
    public JsonResponseUtils getCheckPendingMeeting(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "24") Integer pageSize) {
        PageInfo pageInfo = meetingMessageService.getCheckPendingMeeting(pageNum, pageSize);
        return JsonResponseUtils.layUiOk(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 通过id更新会议审核状态
     *
     * @param meetingId
     * @return
     */
    @RequestMapping("/update-audit-state")
    @ResponseBody
    public JsonResponseUtils passIdUpdateCheckPendingState(Long meetingId, @RequestParam(defaultValue = "0") Byte auditState) {
        meetingMessageService.passIdUpdateCheckPendingState(meetingId, auditState);
        return JsonResponseUtils.ok();
    }

    /**
     * 通过id更新会议签到状态
     *
     * @param meetingId
     * @return
     */
    @RequestMapping("/update-sign-in-state")
    @ResponseBody
    public JsonResponseUtils updateMeetingSignInStateById(Long meetingId, @RequestParam(defaultValue = "0") Byte signInState) {
        meetingMessageService.updateMeetingSignInStateById(meetingId, signInState);
        return JsonResponseUtils.ok();
    }

    /**
     * 获取所有会议
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/all")
    @ResponseBody
    public JsonResponseUtils getAllMeetingMessage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "24") Integer pageSize) {
        PageInfo pageInfo = meetingMessageService.getAllMeetingMessage(pageNum, pageSize);
        return JsonResponseUtils.ok(pageInfo);
    }


    /**
     * 搜索会议
     * @param meetingMessage
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/search")
    @ResponseBody
    public JsonResponseUtils searchMeetingMessage(MeetingMessgae meetingMessage, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "24") Integer pageSize) {
        PageInfo pageInfo = meetingMessageService.searchMeetingMessage(meetingMessage, pageNum, pageSize);
        return JsonResponseUtils.ok(pageInfo);
    }



    /**
     * 获取平板显示数据
     * @param uuid
     * @return
     */
    @RequestMapping("/slab-all")
    @ResponseBody
    public JsonResponseUtils getSlabShowMeetingMessage(String uuid) {
        MeetingEquipment equipment = equipmentService.getEquipmentByUuid(uuid);
        if(!ObjectIfNullUtils.ifNull(equipment)){
            List<MeetingMessgae> list = meetingMessageService.getSlabShowMeetingMessage(equipment.getMeetingRoomId());
            return JsonResponseUtils.ok(list);
        }
        return JsonResponseUtils.err("没有找到该设备，请核对uuid");
    }

    /**
     * 获取大屏显示数据
     * @return
     */
    @RequestMapping("/big-screen-all")
    @ResponseBody
    public JsonResponseUtils getBigScreenMeetingMessage() {
        List<MeetingMessgae> list = meetingMessageService.getBigScreenMeetingMessage();
        return JsonResponseUtils.ok(list);
    }


    /**
     * 添加会议
     * @param meeting
     * @param session
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public JsonResponseUtils addMeetingMessage(MeetingMessgae meeting, HttpSession session) {
        Long i = meetingMessageService.selectDateBetweenMeetingMessage(meeting.getMeetingBeginDate(), meeting.getMeetingEndDate());
        if(i != 0){
            return JsonResponseUtils.err("该时间段已有会议,请重新选择");
        }
        meeting.setMeetingSponsorName((String)session.getAttribute("userName"));
        meeting.setMeetingAuditState((byte)0);
        meeting.setMeetingSignInState((byte)0);
        meeting.setCreated(new Date());
        meeting.setUpdated(new Date());
        meetingMessageService.addMeetingMessage(meeting);
        return JsonResponseUtils.ok();
    }

    /**
     * 通过id删除信息
     * @param meetingId
     * @return
     */
    @RequestMapping("/del")
    @ResponseBody
    public JsonResponseUtils delMeetingMessageById(Long meetingId){
        meetingMessageService.delMeetingMessageById(meetingId);
        return JsonResponseUtils.ok();
    }

    /**
     * 通过时间日期获取这一整天的数据
     * @param millisecond
     * @return
     */
    @RequestMapping("/date")
    @ResponseBody
    public JsonResponseUtils getDateMeetingMessage(Long millisecond){
        System.out.println(DateUtils.defaultDateFormatTurnString(millisecond));
        //这里减1000是一天是00:00:00 - 23:59:59
        List<MeetingMessgae> list = meetingMessageService.getDateMeetingMessage(new Date(millisecond), new Date(millisecond + 1000*60*60*24 - 1000));
        return JsonResponseUtils.ok(list);
    }

    /**
     * 通过时间日期获取这一整天的数据
     * @param millisecond
     * @return
     */
    @RequestMapping("/meeting-room-id-date")
    @ResponseBody
    public JsonResponseUtils getMeetingRoomIdDateMeetingMessage(Long meetingRoomId, Long millisecond){
        List<MeetingMessgae> list = meetingMessageService.getMeetingRoomIdDateMeetingMessage(meetingRoomId, new Date(millisecond), new Date(millisecond + 1000*60*60*24 - 1000));
        return JsonResponseUtils.ok(list);
    }
}
