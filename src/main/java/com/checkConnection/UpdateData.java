package com.checkConnection;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import java.util.Iterator;

import org.bson.*;
public class UpdateData 
{
	public static void main(String args[])
	{
		try
		{
			//+++++ Making Connection ++++++//
			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("studentinformation");
			MongoCollection<Document> collection = database.getCollection("strecord");
			
			
			
			//FindIterable<Document> itreDoc = collection.find();
			FindIterable<Document> itreDoc = collection.find();
			int i = 1;
			Iterator it = itreDoc.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				i++;
				
			}
			
			
			
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
