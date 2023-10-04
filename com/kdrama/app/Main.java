package com.kdrama.app;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.kdrama.app.AppOptionsStaticClass.StaticClassDemo;

public class Main {
	public static void main(String args[])
	{
System.out.println("Welcome To Kdrama Series Application \n");  

//final class object to call final method to print about content
AboutFinal aboutFinal=new AboutFinal();
aboutFinal.finalmethod();

//static class
StaticClassDemo.staticMethodDemo();

//used DateTimeFormatter,ofPattern,ZonedDateTime,format
System.out.println("current login:"+ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

//abstract class objects
ActorDisplayDetailsSubClass actorDisplayDetailsSubClass=new ActorDisplayDetailsSubClass();
actorDisplayDetailsSubClass.printActorMessage();
actorDisplayDetailsSubClass.DisplayActorDetails("Lee Min HO");

//multiple inheritance object to display kdrama details that is stored in collection framework
KdramaDisplayMultipleInheritanceClass kdramaDisplay = new KdramaDisplayMultipleInheritanceClass(
        "", "", null, "", Genre.Action,0);
kdramaDisplay.kdramadisplayGetMethod();

//DateTime class object to call the method 
DateTime dateTime=new DateTime();
dateTime.datetime();

	}
	//default constructor
		public Main() {};
		
}