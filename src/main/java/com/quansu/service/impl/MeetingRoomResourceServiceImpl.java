package com.quansu.service.impl;

import com.quansu.daointerface.MeetingRoomResourceMapper;
import com.quansu.pojo.MeetingRoomResource;
import com.quansu.pojo.MeetingRoomResourceExample;
import com.quansu.service.MeetingRoomResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
@Service
public class MeetingRoomResourceServiceImpl implements MeetingRoomResourceService {
    @Autowired
    MeetingRoomResourceMapper meetingRoomResourceMapper;

    @Override
    public List<MeetingRoomResource> getAllMeetingRoomResource() {
        MeetingRoomResourceExample example = new MeetingRoomResourceExample();
        example.createCriteria().andDeleteStateEqualTo(false);
        return meetingRoomResourceMapper.selectByExample(example);
    }
}
