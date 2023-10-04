package com.kdrama.app;
//this interface is just created to show multiple inheritance
public interface TopReviewInterface {

	public default void reviewMethod() {
		System.out.println("You can check the review of drama below:\n");
	}
}
