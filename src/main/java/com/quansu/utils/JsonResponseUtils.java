package com.quansu.utils;

import java.io.Serializable;

/**
 * @author cxy
 */
public class JsonResponseUtils  implements Serializable {

    /**
     * 状态码
     */
    private int code;
    private String msg = "";
    private Object data = null;
    /**
     * 用于layUi总行数
     */
    private long count;

    public JsonResponseUtils() {
    }

    private JsonResponseUtils(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private JsonResponseUtils(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private JsonResponseUtils(int code, String msg, long count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static JsonResponseUtils ok() {
        return new JsonResponseUtils(200, "OK", null);
    }

    public static JsonResponseUtils ok(String msg) {
        return new JsonResponseUtils(200, msg, null);
    }

    public static JsonResponseUtils ok(Object data) {
        return new JsonResponseUtils(200, "", data);
    }

    public static JsonResponseUtils layUiOk(String msg, long count, Object data) {
        return new JsonResponseUtils(200, msg, count, data);
    }

    public static JsonResponseUtils layUiOk(long count, Object data) {
        return new JsonResponseUtils(200, "", count, data);
    }

    public static JsonResponseUtils ok(String msg, Object data) {
        return new JsonResponseUtils(200, msg, data);
    }

    public static JsonResponseUtils err() {
        return new JsonResponseUtils(500, "Err", null);
    }

    public static JsonResponseUtils err(String msg) {
        return new JsonResponseUtils(500, msg, null);
    }

    public static JsonResponseUtils err(Object data) {
        return new JsonResponseUtils(500, "", data);
    }

    public static JsonResponseUtils err(String msg, Object data) {
        return new JsonResponseUtils(500, msg, data);
    }


    public static JsonResponseUtils biud(int code, String msg, Object data) {
        return new JsonResponseUtils(code, msg, data);
    }

    public static JsonResponseUtils biud(int code, String msg) {
        return new JsonResponseUtils(code, msg, null);
    }

    public static JsonResponseUtils biud(int code, Object data) {
        return new JsonResponseUtils(code, "", data);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public long getCount() {
        return count;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public void setCount(long count) {
        this.count = count;
    }

    public void setAllMessage(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResponseUtils{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
