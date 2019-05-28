package com.quansu.daointerface;

import com.quansu.pojo.MeetingRootResource;
import com.quansu.pojo.MeetingRootResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingRootResourceMapper {
    long countByExample(MeetingRootResourceExample example);

    int deleteByExample(MeetingRootResourceExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(MeetingRootResource record);

    int insertSelective(MeetingRootResource record);

    List<MeetingRootResource> selectByExample(MeetingRootResourceExample example);

    MeetingRootResource selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") MeetingRootResource record, @Param("example") MeetingRootResourceExample example);

    int updateByExample(@Param("record") MeetingRootResource record, @Param("example") MeetingRootResourceExample example);

    int updateByPrimaryKeySelective(MeetingRootResource record);

    int updateByPrimaryKey(MeetingRootResource record);
}