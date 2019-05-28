package com.quansu.view;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

/**
 * @author cxy
 * @date 2019/5/15
 * 自定义视图检测器，在视图解析器bean中添加属性名viewClass，value设置当前类
 */
public class HtmlResourceView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale){
        File file=new File(this.getServletContext().getRealPath("/")+getUrl());
        //判断页面是否存在
        return file.exists();
    }
}
