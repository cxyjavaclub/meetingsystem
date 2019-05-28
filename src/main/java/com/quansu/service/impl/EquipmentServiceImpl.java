package com.quansu.service.impl;

import com.quansu.daointerface.MeetingEquipmentMapper;
import com.quansu.pojo.MeetingEquipment;
import com.quansu.pojo.MeetingEquipmentExample;
import com.quansu.service.EquipmentService;
import com.quansu.utils.ObjectIfNullUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    MeetingEquipmentMapper equipmentMapper;

    @Override
    public List<MeetingEquipment> getAllEquipment() {
        MeetingEquipmentExample example = new MeetingEquipmentExample();
        example.createCriteria().andDeleteStateEqualTo(false);
        return equipmentMapper.selectByExample(example);
    }

    @Override
    public Integer addEquipment(MeetingEquipment equipment) {
        return equipmentMapper.insertSelective(equipment);
    }

    @Override
    public Integer deleteEquipmentById(Long equipmentId) {
        MeetingEquipment equipment = new MeetingEquipment();
        equipment.setEquipmentId(equipmentId);
        equipment.setDeleteState(true);
        return equipmentMapper.updateByPrimaryKeySelective(equipment);
    }

    @Override
    public Integer updateEquipmentById(MeetingEquipment equipment) {
        return equipmentMapper.updateByPrimaryKeySelective(equipment);
    }

    @Override
    public Integer updateStateEquipmentByUuid(String uuid, Byte state) {
        MeetingEquipment equipment = new MeetingEquipment();
        MeetingEquipmentExample example = new MeetingEquipmentExample();
        example.createCriteria().andEquipmentUuidEqualTo(uuid);
        equipment.setEquipmentState(state);
        return equipmentMapper.updateByExampleSelective(equipment, example);
    }

    @Override
    public MeetingEquipment getEquipmentByUuid(String uuid) {
        MeetingEquipmentExample example = new MeetingEquipmentExample();
        example.createCriteria().andEquipmentUuidEqualTo(uuid).andDeleteStateEqualTo(false);
        return ObjectIfNullUtils.getListNumData(equipmentMapper.selectByExample(example), 0);
    }

    @Override
    public Integer findEquipmentStateByUuid(String uuid, Byte state) {
        MeetingEquipmentExample example = new MeetingEquipmentExample();
        example.createCriteria().andEquipmentUuidEqualTo(uuid);
        MeetingEquipment equipment = new MeetingEquipment();
        equipment.setEquipmentState(state);
        return equipmentMapper.updateByExampleSelective(equipment, example);
    }
}
