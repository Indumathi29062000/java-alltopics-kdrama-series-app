package com.kdrama.app;
//abstract class can have both implemented and unimplemented methods
public abstract class ActorAbstractClass {
	
//abstract method to display actor details
public abstract void DisplayActorDetails(String actorName);

//can have implemented method also
public void printActorMessage() {
	System.out.println("Below is the Actor/Actress who played the role in this drama: /n");
}



	
}
