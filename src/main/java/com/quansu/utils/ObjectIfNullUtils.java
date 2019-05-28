package com.quansu.utils;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author cxy
 */
public class ObjectIfNullUtils {

    /**
     * 判断对象是否为空
     *
     * @param obj
     * @return
     */
    public static Boolean ifNull(Object obj) {
        return obj == null ? true : false;
    }

    /**
     * 判断对象不为空
     *
     * @param obj
     * @return
     */
    public static Boolean elseNull(Object obj) {
        return obj == null ? false : true;
    }

    @Test
    public void test(){

    }

    /**
     * 判断对象长度是否为空（对象不能为null）
     *
     * @param type
     * @param obj
     * @return
     */
    public static Boolean ifLengthZero(String type, Object obj) {
        int length = 0;
        switch (type) {
            case "Collection":
                if(!(obj instanceof  Collection)){
                    throw new RuntimeException("这个不是一个Collection集合");
                }
                length = ((Collection) obj).size();
                break;
            case "Map":
                if(!(obj instanceof  Map)){
                    throw new RuntimeException("这个不是一个Map集合");
                }
                length = ((Map) obj).size();
                break;
            case "String":
                if(!(obj instanceof  String)){
                    throw new RuntimeException("这个不是一个String对象");
                }
                length = ((String) obj).length();
                break;
        }
        return length == 0 ? true : false;
    }

    /**
     * 判断对象是否为空或者长度等于0
     *
     * @param type
     * @param obj
     * @return
     */
    private static Boolean ifObjectLengthZeroAndNull(String type, Object obj) {
        if (ifNull(obj)) {
            return true;
        }
        if (ifLengthZero(type, obj)) {
            return true;
        }
        return false;
    }

    /**
     * 判断List集合是否为空或长度是否等于0
     *
     * @param list
     * @return
     */
    public static Boolean ifListLengthZeroAndNull(List list) {
        return ifObjectLengthZeroAndNull("Collection", list);
    }

    /**
     * 判断Set集合是否为空或长度是否等于0
     *
     * @param set
     * @return
     */
    public static Boolean ifSetLengthZeroAndNull(Set set) {
        return ifObjectLengthZeroAndNull("Collection", set);
    }

    /**
     * 判断Map集合是否为空或长度是否等于0
     *
     * @param map
     * @return
     */
    public static Boolean ifMapLengthZeroAndNull(Map map) {
        return ifObjectLengthZeroAndNull("Map", map);
    }

    /**
     * 判断String集合是否为空或长度是否等于0
     *
     * @param str
     * @return
     */
    public static Boolean ifStringLengthZeroAndNull(String str) {
        return ifObjectLengthZeroAndNull("String", str);
    }

    /**
     * 判断Array集合是否为空或长度是否等于0
     *
     * @param obj
     * @return
     */
    public static Boolean ifArrayLengthZeroAndNull(Object obj) {
        if (ifNull(obj)) {
            return true;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (length == 0) {
                return true;
            }else {
                return false;
            }
        }else{
            throw new RuntimeException("这个不是一个数组");
        }
    }

    /**
     * 返回一个指定的集合数（超出范围会抛异常）
     * @param list
     * @param num
     * @param <T>
     * @return
     */
    public static <T> T getListNumData(List<T> list, Integer num){
        if(!ifListLengthZeroAndNull(list)) {
            return list.get(num);
        }
        return null;
    }
}
