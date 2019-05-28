package com.quansu.daointerface;

import com.quansu.pojo.MeetingEquipment;
import com.quansu.pojo.MeetingEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingEquipmentMapper {
    long countByExample(MeetingEquipmentExample example);

    int deleteByExample(MeetingEquipmentExample example);

    int deleteByPrimaryKey(Long equipmentId);

    int insert(MeetingEquipment record);

    int insertSelective(MeetingEquipment record);

    List<MeetingEquipment> selectByExample(MeetingEquipmentExample example);

    MeetingEquipment selectByPrimaryKey(Long equipmentId);

    int updateByExampleSelective(@Param("record") MeetingEquipment record, @Param("example") MeetingEquipmentExample example);

    int updateByExample(@Param("record") MeetingEquipment record, @Param("example") MeetingEquipmentExample example);

    int updateByPrimaryKeySelective(MeetingEquipment record);

    int updateByPrimaryKey(MeetingEquipment record);
}