package com.quansu.service;

import com.quansu.pojo.MeetingConferee;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
public interface ConfereeService {
    /**
     * 增加一条参会人员数据
     * @param conferee
     * @return
     */
    Integer addOneConfereeMessage(MeetingConferee conferee);

    /**
     * 通过会议id获取参会人员信息
     * @param meetingId
     * @return
     */
    List<MeetingConferee> findConfereeByMeetingId(Long meetingId);
}
