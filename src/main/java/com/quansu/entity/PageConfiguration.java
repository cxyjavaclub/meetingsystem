package com.quansu.entity;

import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/
 */
public class PageConfiguration {
    /**
     * 初始化所有页面
     */
    public static List<PageConfigurationVo> initPage(){
        List<PageConfigurationVo> voList = new ArrayList<>();
        List<PageConfigurationVo.Two> twos = new ArrayList<>();
        twos.add(PageConfigurationVo.getTwoObject("user-message.html", "个人信息"));
        twos.add(PageConfigurationVo.getTwoObject("user-meeting.html", "待参加会议"));
        voList.add(PageConfigurationVo.getOneObject("个人中心", "fa fa-user", twos));
        List<PageConfigurationVo.Two> twos1 = new ArrayList<>();
        twos1.add(PageConfigurationVo.getTwoObject("meeting-reserve.html", "预定会议"));
        twos1.add(PageConfigurationVo.getTwoObject("meeting-message-preview.html", "会场查询"));
        twos1.add(PageConfigurationVo.getTwoObject("audit-meeting.html", "会议审核"));
        twos1.add(PageConfigurationVo.getTwoObject("all-meeting-reserve-list.html", "所有会议列表"));
        voList.add(PageConfigurationVo.getOneObject("会议预定", "fa fa-calendar-minus-o", twos1));
        List<PageConfigurationVo.Two> twos2 = new ArrayList<>();
        twos2.add(PageConfigurationVo.getTwoObject("equipment-message.html", "设备状态"));
        twos2.add(PageConfigurationVo.getTwoObject("add-equipment.html", "增加设备"));
        voList.add(PageConfigurationVo.getOneObject("设备管理", "fa fa-cog", twos2));
        List<PageConfigurationVo.Two> twos3 = new ArrayList<>();
        twos3.add(PageConfigurationVo.getTwoObject("meeting-room-operation.html", "会议室管理"));
        voList.add(PageConfigurationVo.getOneObject("系统管理", "fa fa-wrench", twos3));
        return voList;
    }

    /**
     * 返回页面配置
     * @param str
     * @return
     */
    public static List<PageConfigurationVo> getPageConfiguration(String str){
        String all = "all";
        if(all.toLowerCase().equals(str)){
            return initPage();
        }else {
            if(str.length() != 0) {
                List<PageConfigurationVo> list = initPage();
                List<String> split = Arrays.asList(str.trim().split(","));
                for (PageConfigurationVo one : list) {
                    for (int i = 0; i < one.getTwo().size(); i++) {
                        if (!split.contains(one.getTwo().get(i).getCatalogName())) {
                            one.getTwo().remove(i);
                            i--;
                        }
                    }
                }
                return list;
            }
        }
        return null;
    }
}
