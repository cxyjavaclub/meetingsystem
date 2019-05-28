package com.quansu.daointerface;

import com.quansu.pojo.MeetingInform;
import com.quansu.pojo.MeetingInformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingInformMapper {
    long countByExample(MeetingInformExample example);

    int deleteByExample(MeetingInformExample example);

    int deleteByPrimaryKey(Long informId);

    int insert(MeetingInform record);

    int insertSelective(MeetingInform record);

    List<MeetingInform> selectByExample(MeetingInformExample example);

    MeetingInform selectByPrimaryKey(Long informId);

    int updateByExampleSelective(@Param("record") MeetingInform record, @Param("example") MeetingInformExample example);

    int updateByExample(@Param("record") MeetingInform record, @Param("example") MeetingInformExample example);

    int updateByPrimaryKeySelective(MeetingInform record);

    int updateByPrimaryKey(MeetingInform record);
}