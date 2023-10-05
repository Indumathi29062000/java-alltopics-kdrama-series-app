package com.kdrama.app;

import java.util.Scanner;

//perform explicit,implicit,string type casting
public class TypeCastingClass {
	Scanner sc=new Scanner(System.in);
	
	public void typeCastingMethod() {
 String StringPhoneNumber="3125678900";
//for strings we can use
 Long phoneNumber=Long.parseLong(StringPhoneNumber);
 int rating;
//implicit
 //do while loop
 do {
System.out.println("Leave your rating(1-5) here:");
 rating=sc.nextInt();
 }while(rating>=5);
float ratingFloat=rating;
//explicit
int intrating=(int)ratingFloat;

System.out.println("thanks for your final rating:"+intrating+"\n"+"Contact info:"+phoneNumber);


	}

}
