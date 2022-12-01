package model;

import java.io.Serializable;
import java.util.Objects;

public class Products implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String selecao;
	
	private Double price ;
	
	private String size;
	
	private String padrao;
	
	private Integer id ;

	public Products(String selecao, Double price, String size, String padrao, Integer id) {
		super();
		this.selecao = selecao;
		this.price = price;
		this.size = size;
		this.padrao = padrao;
		this.id = id;
	}

	public Products() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, padrao, price, selecao, size);
	}
	

	public String getSelecao() {
		return selecao;
	}

	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPadrao() {
		return padrao;
	}

	public void setPadrao(String padrao) {
		this.padrao = padrao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(id, other.id) && Objects.equals(padrao, other.padrao)
				&& Objects.equals(price, other.price) && Objects.equals(selecao, other.selecao)
				&& Objects.equals(size, other.size);
	}

	@Override
	public String toString() {
		return "Products [selecao=" + selecao + ", price=" + price + ", size=" + size + ", padrao=" + padrao + ", id="
				+ id + "]";
	} 
	
	
	
	
}
