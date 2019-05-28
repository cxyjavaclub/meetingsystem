package com.quansu.controller;

import com.quansu.pojo.MeetingEquipment;
import com.quansu.service.EquipmentService;
import com.quansu.storagemessage.EquipmentTimer;
import com.quansu.utils.JsonResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cxy
 * @date 2019/5/15
 * 设备操作
 */
@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    /**
     * 权限名
     */
    String addEquipment = "增加设备";
    String equipmentState = "设备状态";

    @Autowired
    EquipmentService equipmentService;

    @Autowired
    PermissionManagerController permissionManagerController;

    @Autowired
    EquipmentTimer equipmentTimer;

    /**
     * 设备在线访问
     * @param uuid
     * @return
     */
    @RequestMapping("/on-line")
    @ResponseBody
    public JsonResponseUtils detectionEquipmentOnLine(String uuid) {
        equipmentService.findEquipmentStateByUuid(uuid, (byte)1);
        equipmentTimer.addStringTimerMap(uuid);
        return JsonResponseUtils.ok();
    }


    @RequestMapping("/verify")
    @ResponseBody
    public JsonResponseUtils verifyMessage(String verifyMessage) {
        System.out.println(verifyMessage);
        Map map = new HashMap<>();
        map.put("msg", "begin#70");
        map.put("ms", "10000");
        return JsonResponseUtils.ok(map);
    }


    /**
     * 获取所有的设备信息
     *
     * @return
     */
    @RequestMapping("/all")
    @ResponseBody
    public JsonResponseUtils getAllEquipment() {
        List<MeetingEquipment> list = equipmentService.getAllEquipment();
        return JsonResponseUtils.ok(list);
    }

    /**
     * 增加设备
     * @param equipment
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public JsonResponseUtils addEquipment(MeetingEquipment equipment) {
        equipment.setCreated(new Date());
        equipmentService.addEquipment(equipment);
        return JsonResponseUtils.ok();
    }

    /**
     * 通过id删除设备
     * @param equipmentId
     * @return
     */
    @RequestMapping("/del")
    @ResponseBody
    public JsonResponseUtils deleteEquipmentById(Long equipmentId) {
        equipmentService.deleteEquipmentById(equipmentId);
        return JsonResponseUtils.ok();
    }

    /**
     * 通过id更新设备
     * @param equipment
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseUtils updateEquipmentById(MeetingEquipment equipment) {
        equipmentService.updateEquipmentById(equipment);
        return JsonResponseUtils.ok();
    }
}
