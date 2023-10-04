package com.kdrama.app;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Date;
//can implement multiple interface, but can extend only one class
public class KdramaDisplayMultipleInheritanceClass extends Kdrama implements ImageInterface,TopReviewInterface{
//super
	public KdramaDisplayMultipleInheritanceClass(String title, String director, Date released, String Description,
			Genre genre, int episodes) {
		super(title, director, released, Description, genre, episodes);
		
	}
//implement unimplemented method of interface
	@Override
	public void imgDisplayMethod() {
		System.out.println("Display image\n");
	}
	
	//scanner
	Scanner sc=new Scanner(System.in);
			
	//method to use 2 interface element,extended class
	public void kdramadisplayGetMethod() {
           System.out.println("enter the title of kdrama details you are looking for:");
           title=sc.next();
           
         //create array list
       	ArrayList<String> ArrayListTitle = new ArrayList<String>();
       	
       	//add elements in array list
       	ArrayListTitle.add("Healer");
       	ArrayListTitle.add("Goblin");
       	
       	//Hash map to have key and values
       	HashMap<String, String>directorHashmap=new 	HashMap<String, String>();
       	directorHashmap.put("Healer","lee Min ho");
       	directorHashmap.put("Goblin","Gong yoo");

       	//HashMap<String,Date >releasedHashMap=new HashMap<String,Date>();
        //releasedHashMap.put("Healer",DateTimeFormatter.ofPattern("dd-MM-yyyy", 29-06-2000));
       	HashMap<String,String >DescriptionHashMap=new HashMap<String,String>();
       	DescriptionHashMap.put("Healer", "this is an amazing drama");
       	DescriptionHashMap.put("Goblin", "this is an fantasy drama");
     	HashMap<String,Integer >episodesHashMap=new HashMap<String,Integer>();
     	episodesHashMap.put("Healer", 16);
     	episodesHashMap.put("Goblin",21);

       	
       	//if condition to print values of k drama by matching user given data and array list condition
       	if (ArrayListTitle.contains(title)) {
       		System.out.println("below are the details of mentioned drama:");
       		System.out.println("title:"+title);
       		if (directorHashmap.containsKey(title)) {
           		System.out.println("director:"+directorHashmap.get(title));

       		}
       		System.out.println("released:"+released);
       		if (DescriptionHashMap.containsKey(title)) {
           		System.out.println("Description:"+DescriptionHashMap.get(title));

       		}
       		if (episodesHashMap.containsKey(title)) {
           		System.out.println("episodes:"+episodesHashMap.get(title));

       		}
       	}
       	else {
       		System.out.println("No such kdrama available, try searching another drama");

       	}
           
	}

}
