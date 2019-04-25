package meta.com.br.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import meta.com.br.persistence.ProdutoDao;

@Path("/cliente/produto")
public class ProdutoService {
	
	
	@GET
	public String listarProduto() {
		try {
			return new Gson().toJson(new ProdutoDao().findAllProduto());
			
		} catch (Exception ep) {
			return "Error:" + ep.getMessage();
		}
	}

}
