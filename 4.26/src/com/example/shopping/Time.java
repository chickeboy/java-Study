package com.example.shopping;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	public String getTime() {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间
		
	}
}
