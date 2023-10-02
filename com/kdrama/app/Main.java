package com.kdrama.app;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String args[])
	{
System.out.println("Welcome To Kdrama Series Application!!");  

//used DateTimeFormatter,ofPattern,ZonedDateTime,format
System.out.println("current login:"+ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

//DateTime class object to call the method 
DateTime dateTime=new DateTime();
dateTime.datetime();

	}
	//default constructor
		public Main() {};
		
}