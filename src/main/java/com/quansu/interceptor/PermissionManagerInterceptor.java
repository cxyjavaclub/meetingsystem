package com.quansu.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author cxy
 * @date 2019/5/15
 *
 * 权限管理类 （应配置为拦截全部访问）
 */
//    @SuppressWarnings("all") 为去警告注解 all代表去掉所有警告
@SuppressWarnings("all")
public class PermissionManagerInterceptor implements HandlerInterceptor {
    Logger logger = LogManager.getLogger(GlobalInterceptor.class);
    /**
     * 用于spring4.0版本以下配置不拦截访问页
     */
    private List<String> exceptUrls;

    public List<String> getExceptUrls() {
        return exceptUrls;
    }

    public void setExceptUrls(List<String> exceptUrls) {
        this.exceptUrls = exceptUrls;
    }

    /**
     * 判断访问路径是否是不拦截路径
     * @param request
     * @return
     */
    public boolean ifIsExceptUrls(HttpServletRequest request) {
        //放行exceptUrls中配置的url
        //request.getRequestURI() 路径包含项目名
        //request.getServletPath() 路径不包含项目名
        for (String url : exceptUrls) {
            if (request.getServletPath().equals(url)) {
                return true;
            }
        }
        return false;
    }
//    4.0以下例子：
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
//        //如果访问的是设置不拦截的地址，就放行
//        if (ifIsExceptUrls(httpServletRequest)) {
//            return true;
//        }
//        return true;
//    }



    /**
     * 在请求处理之前执行，该方法主要是用于准备资源数据的，然后可以把它们当做请求属性放到WebRequest中
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        return true;
    }

    /**
     * 该方法将在Controller执行之后，返回视图之前执行，ModelMap表示请求Controller处理之后返回的Model对象，所以可以在
     * 这个方法中修改ModelMap的属性，从而达到改变返回的模型的效果。
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 该方法将在整个请求完成之后，也就是说在视图渲染之后进行调用，主要用于进行一些资源的释放
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) throws Exception {

    }
}
