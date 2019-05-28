package com.quansu.daointerface;

import com.quansu.pojo.MeetingRoomResource;
import com.quansu.pojo.MeetingRoomResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRoomResourceMapper {
    long countByExample(MeetingRoomResourceExample example);

    int deleteByExample(MeetingRoomResourceExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(MeetingRoomResource record);

    int insertSelective(MeetingRoomResource record);

    List<MeetingRoomResource> selectByExample(MeetingRoomResourceExample example);

    MeetingRoomResource selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") MeetingRoomResource record, @Param("example") MeetingRoomResourceExample example);

    int updateByExample(@Param("record") MeetingRoomResource record, @Param("example") MeetingRoomResourceExample example);

    int updateByPrimaryKeySelective(MeetingRoomResource record);

    int updateByPrimaryKey(MeetingRoomResource record);
}