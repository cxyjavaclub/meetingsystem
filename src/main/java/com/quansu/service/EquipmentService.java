package com.quansu.service;

import com.quansu.pojo.MeetingEquipment;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 */
public interface EquipmentService {

    /**
     * 获取所有设备信息
     * @return
     */
    List<MeetingEquipment> getAllEquipment();

    /**
     * 添加设备
     * @param equipment
     * @return
     */
    Integer addEquipment(MeetingEquipment equipment);

    /**
     * 通过id删除设备
     * @param equipmentId
     * @return
     */
    Integer deleteEquipmentById(Long equipmentId);

    /**
     * 通过id更新设备
     * @param equipment
     * @return
     */
    Integer updateEquipmentById(MeetingEquipment equipment);

    /**
     * 通过uuid更新设备状态
     * @param uuid
     * @param state
     * @return
     */
    Integer updateStateEquipmentByUuid(String uuid, Byte state);

    /**
     * 通过uuid获得设备
     * @param uuid
     * @return
     */
    MeetingEquipment getEquipmentByUuid(String uuid);

    /**
     * 通过uuid设置设备状态
     * @param uuid
     * @param state
     * @return
     */
    Integer findEquipmentStateByUuid(String uuid, Byte state);
}
