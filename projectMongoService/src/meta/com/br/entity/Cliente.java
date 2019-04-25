package meta.com.br.entity;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double _id;
	private String foto;
	private String nome;
	private String email;
	private String pais;
	private String bandeira;

	public Cliente() {

	}

	public Cliente(Double _id, String foto, String nome, String email, String pais, String bandeira) {
		super();
		this._id = _id;
		this.foto = foto;
		this.nome = nome;
		this.email = email;
		this.pais = pais;
		this.bandeira = bandeira;
	}

	@Override
	public String toString() {
		return "Cliente [_id=" + _id + ", foto=" + foto + ", nome=" + nome + ", email=" + email + ", pais=" + pais
				+ ", bandeira=" + bandeira + "]";
	}

	public Double get_id() {
		return _id;
	}

	public void set_id(Double _id) {
		this._id = _id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	
	
}
