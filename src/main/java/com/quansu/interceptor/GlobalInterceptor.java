package com.quansu.interceptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;

/**
 * @author cxy
 * 查看访问信息（应把此拦截器放在配置最上面，否则有可能被其他拦截器拦截）
 */
public class GlobalInterceptor implements HandlerInterceptor {
    Logger logger = LogManager.getLogger(GlobalInterceptor.class);

    /**
     * Handler执行之前调用这个方法
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("\n" + httpServletRequest.getRequestURI() + "====================>preHandle\n");
        if (handler instanceof HandlerMethod) {

            HandlerMethod h = (HandlerMethod) handler;
            sb.append("Controller: ").append(h.getBean().getClass().getName()).append("\n");
            sb.append("Method    : ").append(h.getMethod().getName()).append("\n");
            sb.append("Params    : ").append(getParamString(httpServletRequest.getParameterMap())).append("\n");
            sb.append("URI       : ").append(httpServletRequest.getRequestURI()).append("\n");
            logger.info(sb.toString());
        }
        return true;
    }

    private String getParamString(Map<String, String[]> parameterMap) {
        String str = "";
        for (String s : parameterMap.keySet()) {
            str += s + "：" + Arrays.toString(parameterMap.get(s)) + "，";
        }
        return str;
    }

    /**
     * Handler执行之后，ModelAndView返回之前调用这个方法
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("\n" + httpServletRequest.getRequestURI() + "====================>postHandle\n");
    }

    /**
     * Handler执行完成之后调用这个方法
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) throws Exception {
        logger.info("\n" + httpServletRequest.getRequestURI() + "====================>afterCompletion\n");
        if (e != null) {
            logger.info("错误：\n");
            e.printStackTrace();
        }
    }
}
