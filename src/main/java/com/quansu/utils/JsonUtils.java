package com.quansu.utils;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * json转换工具
 */
public class JsonUtils {

	// 定义json对象
	private static final ObjectMapper MAPPER = new ObjectMapper();
	static {
		//允许使用未带引号的字段名
		MAPPER.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		//允许使用单引号
		MAPPER.configure(Feature.ALLOW_SINGLE_QUOTES, true);
	}

	/**
	 * 将对象转换成json字符串。
	 * @param data
	 * @return
	 * @throws IOException
	 */
	public static String objectToJson(Object data) throws IOException {
		try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将json结果集转化为对象
	 * 
	 * @param jsonData
	 *            json数据
	 * @param beanType
	 *            对象中的object类型
	 * @return
	 */
	public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
		try {
			T t = MAPPER.readValue(jsonData, beanType);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将json数据转换成pojo对象list
	 * @param jsonData
	 * @param beanType
	 * @return
	 */
	public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
		JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
		try {
			List<T> list = MAPPER.readValue(jsonData, javaType);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json字符串转Map
	 * 
	 * @param jsonStr
	 * @return
	 * @throws IOException
	 */
	public static Map<String, Object> parseMap(String jsonStr) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, Object> map = MAPPER.readValue(jsonStr, Map.class);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
