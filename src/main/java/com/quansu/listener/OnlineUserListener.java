package com.quansu.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author cxy
 * 监听session创建与销毁
 */
public class OnlineUserListener implements HttpSessionListener  {
    Logger logger = LogManager.getLogger(OnlineUserListener.class);

    /**
     * session创建时调用的方法
     * @param httpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        logger.info("session创建");
    }

    /**
     * session销毁时调用的方法
     * @param httpSessionEvent
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        logger.info("session销毁");
    }
}
