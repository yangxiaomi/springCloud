package com.microservicecloud.api2020.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.swing.SpringLayout.Constraints;

public class TestReflect01 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获取反射起点对象
		Configuration c1  = new Configuration();
		Class<?> cls1 = c1.getClass();
		Class<?> cls2 = Class.forName("com.microservicecloud.api2020.test.Configuration");
		//获取无参的构造函数
		Constructor<?> con=cls2.getDeclaredConstructor();
//		con.setAccessible(true);
		Object obj = con.newInstance();
		System.out.println(obj);
	}
	
}
class Configuration{
}
	
	