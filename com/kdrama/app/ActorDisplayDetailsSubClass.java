package com.kdrama.app;

import java.util.HashMap;

//extends an abstract subclass
public class ActorDisplayDetailsSubClass extends ActorAbstractClass {
	HashMap<String, Integer> actorVar = new HashMap<String, Integer>();	
    public ActorDisplayDetailsSubClass() {
	actorVar.put("Lee Min HO",32);
    }
	@Override
	public void DisplayActorDetails(String actorName) {
    	  System.out.println(actorName);
		
	}
	//method overloading
	public void DisplayActorDetails(String actorName,String dramaName)
	{
  	  System.out.println(actorName+","+dramaName);

	}
	@Override
	public void printActorMessage() {
		System.out.println("below are the details of ML and FL:");
	}

}
