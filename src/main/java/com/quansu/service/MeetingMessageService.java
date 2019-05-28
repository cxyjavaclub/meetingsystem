package com.quansu.service;

import com.github.pagehelper.PageInfo;
import com.quansu.pojo.MeetingMessgae;

import java.util.Date;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
public interface MeetingMessageService {

    /**
     * 通过日期范围获取数据
     * @param beginDate
     * @param endDate
     * @return
     */
    List<MeetingMessgae> getDateMeetingMessage(Date beginDate, Date endDate);

    /**
     * 通过userName获取会议
     * @param userName
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo findUserNameMeeting(String userName, Integer pageNum, Integer pageSize);

    /**
     * 获取待审核会议
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo getCheckPendingMeeting(Integer pageNum, Integer pageSize);

    /**
     * 通过id更新会议审核状态
     * @param meetingId
     * @param auditState
     * @return
     */
    Integer passIdUpdateCheckPendingState(Long meetingId, Byte auditState);


    /**
     * 获取所有会议
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo getAllMeetingMessage(Integer pageNum, Integer pageSize);


    PageInfo searchMeetingMessage(MeetingMessgae meetingMessage, Integer pageNum, Integer pageSize);


    /**
     * 添加会议
     * @param meeting
     * @return
     */
    Integer addMeetingMessage(MeetingMessgae meeting);

    /**
     * 通过id删除信息
     * @param meetingId
     * @return
     */
    Integer delMeetingMessageById(Long meetingId);

    /**
     * 通过id更新会议签到状态
     * @param meetingId
     * @param signInState
     * @return
     */
    Integer updateMeetingSignInStateById(Long meetingId, Byte signInState);

    /**
     * 返回与这个时间段冲突的个数
     * @param meetingBeginDate
     * @param meetingEndDate
     * @return
     */
    Long selectDateBetweenMeetingMessage(Date meetingBeginDate, Date meetingEndDate);

    /**
     * 获取平板显示数据
     * @param meetingRoomId
     * @return
     */
    List<MeetingMessgae> getSlabShowMeetingMessage(String meetingRoomId);

    /**
     * 获取大屏显示数据
     * @return
     */
    List<MeetingMessgae> getBigScreenMeetingMessage();

    /**
     * 通过会议室id和日期范围获取数据
     * @param meetingRoomId
     * @param beginDate
     * @param endDate
     * @return
     */
    List<MeetingMessgae> getMeetingRoomIdDateMeetingMessage(Long meetingRoomId, Date beginDate, Date endDate);

}
