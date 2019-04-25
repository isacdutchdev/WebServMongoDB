package meta.com.br.adapter;

import org.bson.Document;


import meta.com.br.entity.Produto;



public class ProdutoAdapter {
	
	public static Document paraDocumento(Produto p) {
		Document doc = new Document();
		doc.append("_id", p.get_id());
		doc.append("foto", p.getFoto());
		doc.append("nomeProduto", p.getNomeProduto());
		doc.append("imeione", p.getImeione());
		doc.append("preco", p.getPreco());
		return doc;

	}
	
	public static Produto paraObjeto(Document doc) {
		Produto p = new Produto();
		p.set_id(doc.getDouble("_id"));
		p.setFoto(doc.getString("foto"));
		p.setNomeProduto(doc.getString("nomeProduto"));
		p.setImeione(doc.getDouble("imeione"));
		p.setPreco(doc.getDouble("preco"));

		return p;
	}
	


}
