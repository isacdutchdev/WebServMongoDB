package meta.com.br.entity;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private Double _id;
	private String foto;
	private String nomeProduto;
	private Double imeione;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(Double _id, String foto, String nomeProduto, Double imeione, Double preco) {
		super();
		this._id = _id;
		this.foto = foto;
		this.nomeProduto = nomeProduto;
		this.imeione = imeione;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [_id=" + _id + ", foto=" + foto + ", nomeProduto=" + nomeProduto + ", imeione=" + imeione
				+ ", preco=" + preco + "]";
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

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getImeione() {
		return imeione;
	}

	public void setImeione(Double imeione) {
		this.imeione = imeione;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	

}
