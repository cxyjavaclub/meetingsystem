package com.quansu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quansu.daointerface.MeetingMessgaeMapper;
import com.quansu.pojo.MeetingMessgae;
import com.quansu.pojo.MeetingMessgaeExample;
import com.quansu.service.MeetingMessageService;
import com.quansu.utils.ObjectIfNullUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
@Service
public class MeetingMessageServiceImpl implements MeetingMessageService {

    @Autowired
    MeetingMessgaeMapper meetingMessgaeMapper;

    @Override
    public List<MeetingMessgae> getDateMeetingMessage(Date beginDate, Date endDate) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andMeetingBeginDateGreaterThanOrEqualTo(beginDate)
                .andMeetingBeginDateLessThan(endDate)
        .andMeetingAuditStateNotEqualTo((byte)2).andDeleteStateEqualTo(false);
        return meetingMessgaeMapper.selectByExample(example);
    }

    @Override
    public PageInfo findUserNameMeeting(String userName, Integer pageNum, Integer pageSize) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andMeetingSponsorNameEqualTo(userName).andDeleteStateEqualTo(false);
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(meetingMessgaeMapper.selectByExample(example));
    }

    @Override
    public PageInfo getCheckPendingMeeting(Integer pageNum, Integer pageSize) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andMeetingAuditStateEqualTo((byte)0).andDeleteStateEqualTo(false);
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(meetingMessgaeMapper.selectByExample(example));
    }

    @Override
    public Integer passIdUpdateCheckPendingState(Long meetingId, Byte auditState) {
        MeetingMessgae meetingMessgae = new MeetingMessgae();
        meetingMessgae.setMeetingId(meetingId);
        meetingMessgae.setMeetingAuditState(auditState);
        return meetingMessgaeMapper.updateByPrimaryKeySelective(meetingMessgae);
    }

    @Override
    public PageInfo getAllMeetingMessage(Integer pageNum, Integer pageSize) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andDeleteStateEqualTo(false);
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(meetingMessgaeMapper.selectByExample(example));
    }

    @Override
    public PageInfo searchMeetingMessage(MeetingMessgae meetingMessage, Integer pageNum, Integer pageSize) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        MeetingMessgaeExample.Criteria criteria = example.createCriteria();
        if(!ObjectIfNullUtils.ifNull(meetingMessage.getSponsorTrueName())){
            criteria.andSponsorTrueNameLike("%" + meetingMessage.getSponsorTrueName() + "%");
        }

        if(!ObjectIfNullUtils.ifNull(meetingMessage.getMeetingTheme())){
            criteria.andMeetingThemeLike("%" + meetingMessage.getMeetingTheme() + "%");
        }

        if(!ObjectIfNullUtils.ifNull(meetingMessage.getMeetingRoomId())){
            criteria.andMeetingRoomIdEqualTo(meetingMessage.getMeetingRoomId());
        }

        if(!ObjectIfNullUtils.ifNull(meetingMessage.getMeetingBeginDate())){
            criteria.andMeetingBeginDateGreaterThanOrEqualTo(meetingMessage.getMeetingBeginDate());
        }

        if(!ObjectIfNullUtils.ifNull(meetingMessage.getMeetingEndDate())){
            criteria.andMeetingEndDateLessThanOrEqualTo(meetingMessage.getMeetingEndDate());
        }
        //审核状态
        if(!ObjectIfNullUtils.ifNull(meetingMessage.getMeetingAuditState())){
            criteria.andMeetingAuditStateEqualTo(meetingMessage.getMeetingAuditState());
        }

        //签到状态
        if(!ObjectIfNullUtils.ifNull(meetingMessage.getMeetingSignInState())){
            criteria.andMeetingSignInStateEqualTo(meetingMessage.getMeetingSignInState());
        }
        criteria.andDeleteStateEqualTo(false);
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo(meetingMessgaeMapper.selectByExample(example));
    }

    @Override
    public Integer addMeetingMessage(MeetingMessgae meeting) {
        return meetingMessgaeMapper.insertSelective(meeting);
    }

    @Override
    public Integer delMeetingMessageById(Long meetingId) {
        MeetingMessgae meetingMessgae = new MeetingMessgae();
        meetingMessgae.setMeetingId(meetingId);
        meetingMessgae.setDeleteState(true);
        return meetingMessgaeMapper.updateByPrimaryKeySelective(meetingMessgae);
    }

    @Override
    public Integer updateMeetingSignInStateById(Long meetingId, Byte signInState) {
        MeetingMessgae meetingMessgae = new MeetingMessgae();
        meetingMessgae.setMeetingId(meetingId);
        meetingMessgae.setMeetingSignInState(signInState);
        return meetingMessgaeMapper.updateByPrimaryKeySelective(meetingMessgae);
    }

    @Override
    public Long selectDateBetweenMeetingMessage(Date meetingBeginDate, Date meetingEndDate) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        MeetingMessgaeExample.Criteria criteria = example.createCriteria();
        criteria.andMeetingBeginDateGreaterThan(meetingBeginDate)
                .andMeetingBeginDateLessThan(meetingEndDate);
        MeetingMessgaeExample.Criteria criteria1 = example.createCriteria();
        criteria1.andMeetingEndDateGreaterThan(meetingBeginDate)
                .andMeetingEndDateLessThan(meetingEndDate);
        example.or(criteria1);
        return meetingMessgaeMapper.countByExample(example);
    }

    @Override
    public List<MeetingMessgae> getSlabShowMeetingMessage(String meetingRoomId) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andMeetingRoomIdEqualTo(meetingRoomId)
                .andMeetingAuditStateEqualTo((byte)1).andMeetingEndDateGreaterThan(new Date())
                .andDeleteStateEqualTo(false);
        return meetingMessgaeMapper.selectByExample(example);
    }

    @Override
    public List<MeetingMessgae> getBigScreenMeetingMessage() {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andMeetingAuditStateEqualTo((byte)1)
                .andMeetingBeginDateLessThan(new Date()).andDeleteStateEqualTo(false);
        return meetingMessgaeMapper.selectByExample(example);
    }

    @Override
    public List<MeetingMessgae> getMeetingRoomIdDateMeetingMessage(Long meetingRoomId, Date beginDate, Date endDate) {
        MeetingMessgaeExample example = new MeetingMessgaeExample();
        example.createCriteria().andMeetingRoomIdEqualTo(meetingRoomId.toString()).andMeetingBeginDateGreaterThanOrEqualTo(beginDate)
        .andMeetingBeginDateLessThan(endDate).andDeleteStateEqualTo(false);
        return meetingMessgaeMapper.selectByExample(example);
    }
}
