package com.quansu.daointerface;

import com.quansu.pojo.MeetingMessgae;
import com.quansu.pojo.MeetingMessgaeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingMessgaeMapper {
    long countByExample(MeetingMessgaeExample example);

    int deleteByExample(MeetingMessgaeExample example);

    int deleteByPrimaryKey(Long meetingId);

    int insert(MeetingMessgae record);

    int insertSelective(MeetingMessgae record);

    List<MeetingMessgae> selectByExample(MeetingMessgaeExample example);

    MeetingMessgae selectByPrimaryKey(Long meetingId);

    int updateByExampleSelective(@Param("record") MeetingMessgae record, @Param("example") MeetingMessgaeExample example);

    int updateByExample(@Param("record") MeetingMessgae record, @Param("example") MeetingMessgaeExample example);

    int updateByPrimaryKeySelective(MeetingMessgae record);

    int updateByPrimaryKey(MeetingMessgae record);
}