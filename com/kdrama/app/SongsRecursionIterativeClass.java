package com.kdrama.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//recursion is the method that calls itself
//finite recursion should be used to avoid runtime exception
public class SongsRecursionIterativeClass{
	String[] koreanOSTSongs = {
		    "My Love from the Star - Every Moment of You",
		    "Goblin - Stay With Me",
		    "Descendants of the Sun - Always",
		    "Boys Over Flowers - Almost Paradise",
		    "Scarlet Heart: Ryeo - For You",
		    "While You Were Sleeping - When Night Falls",
		    "Moon Lovers: Scarlet Heart Ryeo - All With You",
		    "It's Okay, That's Love - Best Luck",
		    "Guardian: The Lonely and Great God - Beautiful",
		    "Crash Landing on You - Sarang Surowo"
		};
	static int count=1;
    public void recursionMethod() {
        if (count <= 1) {
        	//use for each to iterate through array
            // Print the entire content of the array
        	System.out.println("Below are the famous korean songs of all time:");
            for (String song : koreanOSTSongs) {
                System.out.println(song);
            }
            //increment the count
            count++;
            //call the method until it reaches count=2
            recursionMethod();
        }
    }
	public void iterationMethod() {
		List<String> famousKoreanActors = new ArrayList<>();
        famousKoreanActors.add("Lee Min-ho");
        famousKoreanActors.add("Song Joong-ki");
        famousKoreanActors.add("Kim Soo-hyun");
        famousKoreanActors.add("Park Seo-joon");
        famousKoreanActors.add("Hyun Bin");
        famousKoreanActors.add("Gong Yoo");
        famousKoreanActors.add("Ji Chang-wook");
        famousKoreanActors.add("Lee Jong-suk");
        famousKoreanActors.add("Park Bo-gum");
        System.out.println("See the popoluar Korean actors of all time:");
		Iterator<String> iterator= famousKoreanActors.iterator();
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println(name);
		}
	}
	
}
