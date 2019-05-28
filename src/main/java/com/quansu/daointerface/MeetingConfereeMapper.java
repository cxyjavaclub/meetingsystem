package com.quansu.daointerface;

import com.quansu.pojo.MeetingConferee;
import com.quansu.pojo.MeetingConfereeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingConfereeMapper {
    long countByExample(MeetingConfereeExample example);

    int deleteByExample(MeetingConfereeExample example);

    int deleteByPrimaryKey(Long confereeId);

    int insert(MeetingConferee record);

    int insertSelective(MeetingConferee record);

    List<MeetingConferee> selectByExample(MeetingConfereeExample example);

    MeetingConferee selectByPrimaryKey(Long confereeId);

    int updateByExampleSelective(@Param("record") MeetingConferee record, @Param("example") MeetingConfereeExample example);

    int updateByExample(@Param("record") MeetingConferee record, @Param("example") MeetingConfereeExample example);

    int updateByPrimaryKeySelective(MeetingConferee record);

    int updateByPrimaryKey(MeetingConferee record);
}