package com.checkConnection;

import com.mongodb.jdbc.MongoConnection;
import com.mongodb.jdbc.MongoDriver;
import com.example.StudentMongodb.StudentMongodbApplication;
import com.mongodb.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import static com.mongodb.client.model.Filters.eq;

public class mongodbConnection extends SpringBootServletInitializer
{
	public static void main(String args[])
	{
		try
		{
		//connection to database 
			
					MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); 
					System.out.println("Connection sucessful");
					
		  // Connection with Database Collection.
					
					DB database = mongoClient.getDB("studentinformation");
					DBCollection collection = database.getCollection("strecord"); 
					
		  //MongoCollection<Document> table = bds.getCollection("stinfo");
					
					System.out.println("commection with studentinformation");
					MongoCollection<Document> coll = collection.getCollection("strecord");
					Document myDoc = coll.find();
					System.out.println(myDoc.toJson());
					System.out.println("Collection SampleCollection selected successfully");
		 // Document strecord = collection.find().first();
					
					System.out.println("All connection done");
		  
		 // newInsert = db.strecord.insert({name:"Rajesh", phon_no: 8907532671, depart:"CS", enrol_date:"1/12/20", enrol_no:22, Status:"true", param:"value"})
		  
		 
		  mongoClient.close();
		 
		  System.out.println("connection Closed");
		  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		  
		  
		  
		
	}


