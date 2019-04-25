package meta.com.br.persistence;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import meta.com.br.adapter.ProdutoAdapter;
import meta.com.br.entity.Produto;

public class ProdutoDao extends Dao {
	
	public static final String PRODUTO = "produto";
	
	public List<Produto> findAllProduto() throws Exception{
		MongoCursor<Document> cursorp = null;
		List<Produto> listap = null;
		MongoCollection<Document> collp = getDB().getCollection(PRODUTO);
		cursorp = collp.find().iterator();
		listap = new ArrayList<Produto>();
		while (cursorp.hasNext()) {
			listap.add(ProdutoAdapter.paraObjeto(cursorp.next()));
		}
		cursorp.close();
		return listap;
	}

}
