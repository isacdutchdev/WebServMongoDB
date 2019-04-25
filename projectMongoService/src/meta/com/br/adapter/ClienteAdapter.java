package meta.com.br.adapter;

import org.bson.Document;

import meta.com.br.entity.Cliente;

public class ClienteAdapter {

	public static Document paraDocumento(Cliente c) {
		Document doc = new Document();
		doc.append("_id", c.get_id());
		doc.append("foto", c.getFoto());
		doc.append("name", c.getNome());
		doc.append("email", c.getEmail());
		doc.append("pais", c.getPais());
		doc.append("bandeira", c.getBandeira());
		return doc;

	}

	public static Cliente paraObjeto(Document doc) {
		Cliente c = new Cliente();
		c.set_id(doc.getDouble("_id"));
		c.setFoto(doc.getString("foto"));
		c.setNome(doc.getString("name"));
		c.setEmail(doc.getString("email"));
		c.setPais(doc.getString("pais"));
		c.setBandeira(doc.getString("bandeira"));
		return c;
	}
	
	

}
