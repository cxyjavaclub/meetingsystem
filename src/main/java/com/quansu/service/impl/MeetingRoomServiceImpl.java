package com.quansu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quansu.daointerface.MeetingRoomMapper;
import com.quansu.pojo.MeetingRoom;
import com.quansu.pojo.MeetingRoomExample;
import com.quansu.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {

    @Autowired
    MeetingRoomMapper meetingRoomMapper;

    @Override
    public PageInfo getPageMeetingRoom(Integer pageNum, Integer pageSize) {
        MeetingRoomExample example = new MeetingRoomExample();
        example.createCriteria().andDeleteStateEqualTo(false);
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(meetingRoomMapper.selectByExample(example));
    }

    @Override
    public List<MeetingRoom> getAllMeetingRoom() {
        MeetingRoomExample example = new MeetingRoomExample();
        example.createCriteria().andDeleteStateEqualTo(false);
        return meetingRoomMapper.selectByExample(example);
    }

    @Override
    public Integer findIdUpdateMeetingRoom(MeetingRoom meetingRoom) {
        return meetingRoomMapper.updateByPrimaryKeySelective(meetingRoom);
    }

    @Override
    public Integer addMeetingRoom(MeetingRoom meetingRoom) {
        return meetingRoomMapper.insertSelective(meetingRoom);
    }

    @Override
    public Integer delMeetingRoomById(Long meetingRoomId) {
        MeetingRoom meetingRoom = new MeetingRoom();
        meetingRoom.setMeetingRoomId(meetingRoomId);
        meetingRoom.setDeleteState(true);
        return meetingRoomMapper.updateByPrimaryKeySelective(meetingRoom);
    }

    @Override
    public Integer updateMeetingRoomById(MeetingRoom meetingRoom) {
        return meetingRoomMapper.updateByPrimaryKeySelective(meetingRoom);
    }
}
