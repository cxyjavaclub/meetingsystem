package com.quansu.service;

import com.github.pagehelper.PageInfo;
import com.quansu.pojo.MeetingRoom;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
public interface MeetingRoomService {

    /**
     * 获取分页数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo getPageMeetingRoom(Integer pageNum, Integer pageSize);

    /**
     * 获取所有会议室
     * @return
     */
    List<MeetingRoom> getAllMeetingRoom();

    /**
     * 通过id更新会议室信息
     * @param meetingRoom
     * @return
     */
    Integer findIdUpdateMeetingRoom(MeetingRoom meetingRoom);

    /**
     *  添加会议室
     * @param meetingRoom
     * @return
     */
    Integer addMeetingRoom(MeetingRoom meetingRoom);

    /**
     * 通过id删除数据
     * @param meetingRoomId
     * @return
     */
    Integer delMeetingRoomById(Long meetingRoomId);

    /**
     * 通过id更新数据
     * @param meetingRoom
     * @return
     */
    Integer updateMeetingRoomById(MeetingRoom meetingRoom);

}
