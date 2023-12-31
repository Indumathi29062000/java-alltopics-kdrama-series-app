package com.kdrama.app;

import java.io.IOException;
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
//method overloading
actorDisplayDetailsSubClass.DisplayActorDetails("Choi", "She was pretty");

//multiple inheritance object to display k drama details that is stored in collection framework
KdramaDisplayMultipleInheritanceClass kdramaDisplay = new KdramaDisplayMultipleInheritanceClass(
        "", "", null, "", Genre.Action,0);
kdramaDisplay.kdramadisplayGetMethod();

//recursion object
SongsRecursionIterativeClass songsRecursionIterativeClass=new SongsRecursionIterativeClass();
songsRecursionIterativeClass.recursionMethod();
//iteration object
songsRecursionIterativeClass.iterationMethod();
//type casting object
TypeCastingClass typeCastingClass=new TypeCastingClass();
typeCastingClass.typeCastingMethod();

//string buffer.string builder, stringTokenizer
FollowPageStringVariantsClass followPageStringVariantsClass=new FollowPageStringVariantsClass();
followPageStringVariantsClass.FollowPageStringVariantmethod();

//serilaiZation , exception object
SerilizationExceptionClass serilizationExceptionClass=new SerilizationExceptionClass();
try {
	serilizationExceptionClass.serializationMethod();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//DateTime class object to call the method 
DateTime dateTime=new DateTime();
dateTime.datetime();


	}
	//default constructor
		public Main() {};
		
}