package com.kdrama.app;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
//  get local time, calculate duration using switch case


public class DateTime {
	public void datetime() {
	LocalTime logintime=LocalTime.now();
	Scanner sc=new Scanner(System.in);
	System.out.print("confirm to exit from the session, press y/n:");
	String exit=sc.nextLine();
	switch(exit){
	case ("y"):
		LocalTime logoutime=LocalTime.now();
		System.out.println("Thanks, Your current session is ended");
		System.out.println("Total Login time:"+Duration.between(logintime, logoutime).toMinutes()+" Minutes");
		break;
	case "n":
		break;
	default:
		System.out.println("Enter a valid option as y/n:");
	}
	sc.close();
	}
}
