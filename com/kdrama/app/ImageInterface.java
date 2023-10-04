package com.kdrama.app;
//interface can have common unimplemented method and variables
//multiple inheritance possible
public interface ImageInterface {
	//interface can have only static and final variable
	//values cannot be changed in class
public final int imgid=0;
public static final String imgerror = "image not availabe";

//can have default method, this can be implemented
	public default void imgerrorMethod() {
		System.out.println(imgerror);
	};
	//can have unimplemented method
	public void imgDisplayMethod();
}
