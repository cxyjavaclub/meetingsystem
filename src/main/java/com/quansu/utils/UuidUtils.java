package com.quansu.utils;

import java.util.Arrays;
import java.util.UUID;

public class UuidUtils {

	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

	/**
	 * 获得指定数目的UUID
	 * @param number int 需要获得的UUID数量
	 * @return String[] UUID数组
	 */
	public static String[] getUUID(int number){
		if(number < 1){
			return null;
		}
		String[] retArray = new String[number];
		for(int i=0;i<number;i++){
			retArray[i] = get32UUID();
		}
		return retArray;
	}
	
	public static void main(String[] args) {
		System.out.println(get32UUID());
	}
}

