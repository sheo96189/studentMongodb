package com.checkConnection;
import com.mongodb.client.MongoCollection;

import com.mongodb.client.MongoDatabase;

import com.mongodb.internal.operation.CreateCollectionOperation;

import freemarker.core.ReturnInstruction.Return;

import com.mongodb.MongoCredential;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import org.bson.*;
import org.bson.types.*;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class studentdb 
{

	public static void main(String[] args)
	{
	
		checkin in = new checkin();
		in.woo();
		System.out.println(" call woo");
		
	}	
}
 class checkin
{
	public void woo()
	{
		try
		{
			
			  MongoClient mongo = new MongoClient("localhost", 27017);
			  //Create Credential
//			  MongoCredential credential;
	//		  credential = MongoCredential.createCredential ("username", "mydb", "password".toCharArray());
		//	  System.out.println("Connected to database");
			  //Access Database
			  MongoDatabase database = mongo.getDatabase("mydb");
			  System.out.println("Success");
			  //+++++++++++++++++++++++++++++++++++++++//
			  //Create Collection
			  
			  
			  database.createCollection("mydb1");
			  System.out.println("Collection created successfully");
			  //Retrieving a collection
			  //db.createCollection('test', function(err, collection) {});
			  MongoCollection<Document> collection = database.getCollection("mydb1");
			  System.out.println("Collection myCollection selected successfully"); 
			  Document document = new Document("title","Mongodb")
					  .append("description","database")
					  .append("like", 100);
					  
			  System.out.println("Append"); 
			  //for (String name : database.listCollectionNames()) { 
			        // System.out.println(name); }
			  
			//  collection.insertOne(temp);
			 // System.out.println("inserted successfully"); 
			  collection.insertOne(document);
			  System.out.println("Data inserted in mydb");
			  
			  
			    
			//mongo.dropDatabase("mydb");
			
			//mongo.close(); 
			
					  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

     }
	

}
		
		
		



