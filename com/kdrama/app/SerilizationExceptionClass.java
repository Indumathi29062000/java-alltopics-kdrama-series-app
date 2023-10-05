package com.kdrama.app;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//serialization converts object to byte of stream
//use implement to use seriliZable
public class SerilizationExceptionClass implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//throws
	@SuppressWarnings("unchecked")
	public void serializationMethod() throws IOException, ClassNotFoundException{
		 List<String> kdramaSeriesList = new ArrayList<>();	
		  List<String> deserializedSeries=new ArrayList<>();
		 kdramaSeriesList.add("Crash Landing on You");
	        kdramaSeriesList.add("Itaewon Class");
	        kdramaSeriesList.add("Descendants of the Sun");
	        
	        //serialization using writeOut
	        //exception with try catch
	        try {
	        	//mention the filename where we have convert the above list object to stream
	            FileOutputStream fileOut = new FileOutputStream("kdrama_series.ser");
	            //write java data into it
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            //writeObject is used here
	            out.writeObject(kdramaSeriesList);
	            //close it to avoid resource leak
	            out.close();
	            fileOut.close();
	            System.out.println("Serialized data is saved in kdrama_series.ser");
	            //throw used within method body, create new Runtime Exception
	            }catch (RuntimeException r) {
	                throw new RuntimeException("Something went wrong while accessing K-drama series.");

	            }
	        
	      //deSeerialization
	        try {
	        	FileInputStream fileIn=new FileInputStream("kdrama_series.ser");
	        	ObjectInputStream in=new ObjectInputStream(fileIn);
	        	//readObject used here
	        	deserializedSeries = (List<String>) in.readObject();	           
	        	in.close();
	        	fileIn.close();
	            System.out.println("deSerilized the file"+deserializedSeries);

	        	
	        }catch (IOException i) {
                i.printStackTrace();}
	      //finally will be executed regardless of exception block
	        finally {
	            System.out.println("Successfully serialized, deseriliazed kdrama list");

	            }
	}
	

}
