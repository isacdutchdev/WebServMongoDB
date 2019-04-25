package meta.com.br.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Dao {

	MongoClient mongoClient;


	public MongoClient openMongoClient() {
		mongoClient = new MongoClient();	
		return mongoClient;
	}

	public MongoDatabase getDB() throws Exception {
		return openMongoClient().getDatabase("serviceNosql");
		
	}
	

	

}
