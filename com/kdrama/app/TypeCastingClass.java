package com.kdrama.app;

import java.util.Scanner;

//perform explicit,implicit,string type casting
public class TypeCastingClass {
	Scanner sc=new Scanner(System.in);
	
	public void typeCastingMethod() {
 String StringPhoneNumber="3125678900";
//for strings we can use
 Long phoneNumber=Long.parseLong(StringPhoneNumber);
//implicit
System.out.println("Leave your rating here:");
int rating=sc.nextInt();
float ratingFloat=rating;
//explicit
int intrating=(int)ratingFloat;

System.out.println("thanks for your final rating:"+intrating+"\n"+"Contact info:"+phoneNumber);


	}

}
