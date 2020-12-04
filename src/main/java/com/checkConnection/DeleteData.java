package com.checkConnection;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DeleteData {

	public static void main(String[] args)
	{
		try 
		{
			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("studentinformation");
			MongoCollection<Document> coll = database.getCollection("stinfo");
			
			//Delete data from collection+++//
			coll.deleteOne(
					Filters.eq("name","Aakash"));
			System.out.println("Delete Sucessfully");
			
			//+++++++++++++++++++++++++++++//
			FindIterable<Document> iter = coll.find();
			int i = 1;
			Iterator it = iter.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				i++;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
