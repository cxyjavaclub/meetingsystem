package com.quansu.controller;

import com.quansu.pojo.MeetingRoomResource;
import com.quansu.service.MeetingRoomResourceService;
import com.quansu.utils.JsonResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 * 会议室资源操作
 */
@Controller
@RequestMapping("/meeting-room-resource")
public class MeetingRoomResourceController {

    @Autowired
    MeetingRoomResourceService meetingRoomResourceService;

    @RequestMapping("/all")
    @ResponseBody
    public JsonResponseUtils getAllMeetingRoomResource(){
        List<MeetingRoomResource> list = meetingRoomResourceService.getAllMeetingRoomResource();
        return JsonResponseUtils.ok(list);
    }
}
