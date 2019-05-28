package com.quansu.controller;

import com.quansu.pojo.MeetingConferee;
import com.quansu.service.ConfereeService;
import com.quansu.utils.JsonResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 * 参会人员操作
 */
@Controller
@RequestMapping("/conferee")
public class ConfereeController {

    @Autowired
    ConfereeService confereeService;

    /**
     * 增加一条参会人员数据
     * @param conferee
     * @param session
     * @return
     */
    @RequestMapping("/add-one")
    @ResponseBody
    public JsonResponseUtils addOneConfereeMessage(MeetingConferee conferee, HttpSession session){
        String userName = (String)session.getAttribute("userName");
        conferee.setUserName(userName);
        conferee.setCreated(new Date());
        conferee.setUpdated(new Date());
        confereeService.addOneConfereeMessage(conferee);
        return JsonResponseUtils.ok();
    }

    /**
     * 增加多条参会人员数据
     * @param confereeList
     * @param session
     * @return
     */
    @RequestMapping("/add-list")
    @ResponseBody
    public JsonResponseUtils addListConfereeMessage(List<MeetingConferee> confereeList, HttpSession session){
        String userName = (String)session.getAttribute("userName");
        for (MeetingConferee conferee : confereeList){
            conferee.setUserName(userName);
            conferee.setCreated(new Date());
            conferee.setUpdated(new Date());
            confereeService.addOneConfereeMessage(conferee);
        }
        return JsonResponseUtils.ok();
    }

    /**
     * 通过会议id获取参会人员信息
     * @param meetingId
     * @return
     */
    @RequestMapping("/meeting-id-select")
    @ResponseBody
    public JsonResponseUtils findConfereeByMeetingId(Long meetingId){
        List<MeetingConferee> list = confereeService.findConfereeByMeetingId(meetingId);
        return JsonResponseUtils.ok(list);
    }
}
