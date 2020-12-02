package com.checkConnection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.internal.operation.CreateCollectionOperation;
import com.mongodb.MongoCredential;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import com.mongodb.DB;
import com.mongodb.MongoClient;



public class NewConnection {

	public static void main(String[] args)
	{
		
		try
		{
			
			  MongoClient mongo = new MongoClient("localhost", 27017);
			  //Create Credential
			  MongoCredential credential;
			  credential = MongoCredential.createCredential ("username", "mydb", "password".toCharArray());
			  System.out.println("Connected to database");
			  //Access Database
			  MongoDatabase database = mongo.getDatabase("mydb");
			  System.out.println("Success");
			  //+++++++++++++++++++++++++++++++++++++++//
			  //Create Collection
			  database.createCollection("myconnection");
			  System.out.println("Collection created successfully");
			  //Retrieving a collection
			  MongoCollection<Document> collection = database.getCollection("myconnection");
			  System.out.println("Collection myCollection selected successfully"); 
			  
			  Document document = new Document("title","Mongodb")
					  .append("description","database")
					  .append("like", 100)
					  .append("url","http//www/myfi.com");
			  collection.insertOne(document);
			  System.out.println("Data inserted in mydb");
			  
			  
			    
			mongo.close();  
					  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
