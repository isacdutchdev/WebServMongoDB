package meta.com.br.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import meta.com.br.entity.Cliente;
import meta.com.br.persistence.ClienteDao;

@Path("/cliente")
public class ClienteService {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String save(String cliente) {
		try {
			Cliente c = new Gson().fromJson(cliente, Cliente.class);
			new ClienteDao().create(c);
			return new Gson().toJson(c);
		
		} catch (Exception ep) {
			return "Error:" + ep.getMessage(); 
		}
	}
	
	@GET
	public String listar() {
		try {
			 return new Gson().toJson(new ClienteDao().findAll());
			
		} catch (Exception ep) {
			return "Error:" + ep.getMessage();
		}
	}

}
