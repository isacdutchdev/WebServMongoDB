package meta.com.br.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import meta.com.br.adapter.ClienteAdapter;
import meta.com.br.entity.Cliente;

public class ClienteDao extends Dao {

	public static final String CLIENTE = "cliente";
	

	public void create(Cliente c) throws Exception {
		MongoCollection<Document> coll = getDB().getCollection(CLIENTE);
		coll.insertOne(ClienteAdapter.paraDocumento(c));

	}

	public List<Cliente> findAll() throws Exception {
		MongoCursor<Document> cursor = null;
		List<Cliente> lista = null;
		MongoCollection<Document> coll = getDB().getCollection(CLIENTE);
		cursor = coll.find().iterator();
		lista = new ArrayList<Cliente>();
		while (cursor.hasNext()) {
			lista.add(ClienteAdapter.paraObjeto(cursor.next()));
		}
		cursor.close();
		return lista;

	}
	
	

}
