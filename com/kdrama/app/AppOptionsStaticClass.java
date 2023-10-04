package com.kdrama.app;
//static class is group of class, can be created only as nested class
//cannot access instance variable or other methods other than static
//directly accessed using classaname.methodname, no need of object
public class AppOptionsStaticClass {

	//instance variable cannot be accessed by static
	public int x;
	//static variable can be accessed
	public static String OptionMessage;
	
	//static class can only be as nested inner class in java
	public static class StaticClassDemo{
		//static method can be called with static class directly, no need of instance
		public static void staticMethodDemo() {
			OptionMessage="you can search korean drama with title or display all kdramas \n";
			System.out.println(OptionMessage);
		}
	}

}
