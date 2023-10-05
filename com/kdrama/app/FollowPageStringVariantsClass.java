package com.kdrama.app;

import java.util.StringTokenizer;

public class FollowPageStringVariantsClass {
	public void FollowPageStringVariantmethod() {
		//string buffer is mutable, data can be inserted,replaced, deleted,synchronized
	StringBuffer followMsg=new StringBuffer("Follow");
	followMsg.append(" ");
	followMsg.append("Us");
	//string builder is same as string string buffer but not synchronized
	StringBuilder followMsg1=new StringBuilder("on");
	System.out.print(followMsg+" ");System.out.print(followMsg1+"\n");
	//   StringTokenizer to split the string
	StringTokenizer st = new StringTokenizer("Instagram Discord"," ");  
	//while loop, iterator
	 while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
	
	}
	
	

}
