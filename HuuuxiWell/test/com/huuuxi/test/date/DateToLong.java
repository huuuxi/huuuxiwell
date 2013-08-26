package com.huuuxi.test.date;

import java.util.Date;


/**   
 * @Title: DateToLong.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2013-8-26 下午2:21:48 
 */
public class DateToLong {

	public static void main(String[] args) {
		getDateToLong();
	}
	/** 
	* @Title: getDateToLong 
	* @Description: 日期如果未加 23:59:59 得到的Long默认是 相差 86399000
	* @Return: 
	*/
	public static void getDateToLong(){
		Date date = new Date(2013, 23, 1); // 61338700800000
		Long t = date.getTime();
		System.out.println(t);
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0); 
		Long tt = date.getTime();
		System.out.println(tt);
		date.setHours(23);
		date.setMinutes(59);
		date.setSeconds(59); //61338787199000
		System.out.println(date.getTime());
		System.out.println(date.getTime() - t); //86399000
		
	}
}
