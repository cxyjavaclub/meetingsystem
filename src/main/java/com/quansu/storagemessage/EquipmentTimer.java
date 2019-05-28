package com.quansu.storagemessage;

import com.quansu.service.EquipmentService;
import com.quansu.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author cxy
 * @date 2019/5/24
 */
@Service
public class EquipmentTimer {
    private static Map<String, Timer> stringTimerMap = new HashMap<>();
    private Integer time = 1000 * 60 * 5;

    @Autowired
    EquipmentService equipmentService;

    public class TestTime extends TimerTask {
        private String uuid;

        public TestTime(String uuid){
            this.uuid = uuid;
        }
        @Override
        public void run() {
            equipmentService.findEquipmentStateByUuid(uuid, (byte)0);
        }
    }
    public synchronized void addStringTimerMap(String uuid){
        if(stringTimerMap.get(uuid) != null){
            stringTimerMap.get(uuid).cancel();
        }
        //创建定时器对象
        Timer timer =new Timer();
        //在3秒后执行MyTask类中的run方法,后面每10秒跑一次
        timer.schedule(new TestTime(uuid), new Date(System.currentTimeMillis() + time));
        stringTimerMap.put(uuid, timer);
    }
}
