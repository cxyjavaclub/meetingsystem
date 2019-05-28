package com.quansu.controller;

import com.github.pagehelper.PageInfo;
import com.quansu.pojo.MeetingRoom;
import com.quansu.service.MeetingRoomService;
import com.quansu.utils.JsonResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 * 会议室操作
 */
@Controller
@RequestMapping("/meeting-room")
public class MeetingRoomController {

    @Autowired
    MeetingRoomService meetingRoomService;

    /**
     * 获取所有会议室
     * @return
     */
    @RequestMapping("/all")
    @ResponseBody
    public JsonResponseUtils getAllMeetingRoom() {
        List<MeetingRoom> meetingRooms = meetingRoomService.getAllMeetingRoom();
        return JsonResponseUtils.ok(meetingRooms);
    }

    /**
     * 获取分页数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/page-data")
    @ResponseBody
    public JsonResponseUtils getPageMeetingRoom(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "24") Integer pageSize) {
        PageInfo pageInfo = meetingRoomService.getPageMeetingRoom(pageNum, pageSize);
        return JsonResponseUtils.ok(pageInfo);
    }

    /**
     * 通过id更新会议室信息
     * @param meetingRoom
     * @return
     */
    @RequestMapping("/find-id-update")
    @ResponseBody
    public JsonResponseUtils findIdUpdateMeetingRoom(MeetingRoom meetingRoom) {
        meetingRoomService.findIdUpdateMeetingRoom(meetingRoom);
        return JsonResponseUtils.ok();
    }

    /**
     *  添加会议室
     * @param meetingRoom
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public JsonResponseUtils addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRoomService.addMeetingRoom(meetingRoom);
        meetingRoom.setMeetingRoomState((byte)1);
        meetingRoom.setCreated(new Date());
        meetingRoom.setUpdated(new Date());
        return JsonResponseUtils.ok();
    }

    /**
     *  通过id删除
     * @param meetingRoomId
     * @return
     */
    @RequestMapping("/del")
    @ResponseBody
    public JsonResponseUtils delMeetingRoomById(Long meetingRoomId) {
       meetingRoomService.delMeetingRoomById(meetingRoomId);
        return JsonResponseUtils.ok();
    }

    /**
     *  通过id更新数据
     * @param meetingRoom
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseUtils updateMeetingRoomById(MeetingRoom meetingRoom) {
        meetingRoomService.updateMeetingRoomById(meetingRoom);
        return JsonResponseUtils.ok();
    }

}
