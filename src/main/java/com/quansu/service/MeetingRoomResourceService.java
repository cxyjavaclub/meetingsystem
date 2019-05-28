package com.quansu.service;

import com.quansu.pojo.MeetingRoomResource;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
public interface MeetingRoomResourceService {

    /**
     * 获取所有会议室资源
     * @return
     */
    List<MeetingRoomResource> getAllMeetingRoomResource();
}
