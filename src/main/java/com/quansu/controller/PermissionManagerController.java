package com.quansu.controller;

import com.quansu.entity.PageConfiguration;
import com.quansu.utils.ObjectIfNullUtils;
import com.quansu.utils.JsonResponseUtils;
import com.quansu.utils.PermissionManagerUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author cxy
 * @date 2019/5/15
 * 权限管理操作
 */
@Controller
@RequestMapping("/login")
public class PermissionManagerController {

    /**
     * 供OA端设置当前账户，并设置权限
     * @return
     */
    @RequestMapping("/logging")
    @ResponseBody
    public JsonResponseUtils setJurisdiction(HttpSession session, String huserId, String hpageStr){
        JsonResponseUtils jsonResponseUtils = JsonResponseUtils.ok();
        if(ObjectIfNullUtils.ifNull(huserId)){
            jsonResponseUtils = JsonResponseUtils.err("用户信息为空");
        }else {
            session.setAttribute("userName", huserId);
            session.setAttribute("jurisdictionString", hpageStr);
            session.setAttribute("PageConfiguration", PageConfiguration.getPageConfiguration(hpageStr));
            //设置权限
//            session.setAttribute("jurisdictionObject",
//                    PermissionManagerUtils.findFormatCreate(hpageStr,
//                            true, null,
//                            null, null));
        }
        return jsonResponseUtils;
    }

    /**
     * 获取显示页面
     * @param session
     * @return
     */
    @RequestMapping("/page")
    @ResponseBody
    public JsonResponseUtils getPageMessage(HttpSession session){
        return JsonResponseUtils.ok(session.getAttribute("PageConfiguration"));
    }

    /**
     * 获取名称
     * @param session
     * @return
     */
    @RequestMapping("/user-name")
    @ResponseBody
    public JsonResponseUtils getUserName(HttpSession session){
        return JsonResponseUtils.ok(session.getAttribute("userName"));
    }

    /**
     * 检查权限
     * @param jurisdictionName
     * @return
     */
    public boolean selectJurisdiction(String jurisdictionName)
    {
        HttpSession session= ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        Object object = session.getAttribute("jurisdictionObject");
        if(object != null){
            PermissionManagerUtils.JurisdictionList jurisdictionObject = (PermissionManagerUtils.JurisdictionList)object;
            return jurisdictionObject.ifNotJurisdiction(jurisdictionName);
        }else{
            return false;
        }
    }
}
