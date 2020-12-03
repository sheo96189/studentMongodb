package com.checkConnection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.springframework.boot.jdbc.DatabaseDriver;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.internal.operation.ListCollectionsOperation;
import com.mongodb.operation.FindOperation;

public class fetchData 
{
	public static void main(String args[])
	{
		takedata td = new takedata();
		td.foo();
		System.out.println("call the foo function");
	}

}

 class takedata
{
	 public  void foo()
	 {
	 try
	 {
		 //Fetch Data from database and print in the console +++++++ 
		 MongoClient mongo = new MongoClient("localhost", 27017);
		 MongoDatabase database = mongo.getDatabase("studentinformation");
		 MongoCollection<Document> doc = database.getCollection("strecord");
		 System.out.println("Connected");
		 
		 //List list = new ArrayList();
		 //list.add(doc);
		 FindIterable<Document> iterDoc = doc.find();
		 int i = 1;
		 Iterator it = iterDoc.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
			 i++;
		 }
		 
		 System.out.println("here is the data");
		 
		 
	
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
		 
	 }
	
}
	
}
 
