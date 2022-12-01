package model;

import java.util.Objects;
import java.util.Random;

public class Requests {

	private Integer id;	
	private Double valor_total;	
	private Integer quantidade ;
	private Products id_produtos;
	private Users email_usuarios;
	
	public Requests(Integer id, Double valor_total, Integer quantidade, Products id_produtos, Users email_usuarios) {
	
		this.id = id;
		this.valor_total = valor_total;
		this.quantidade = quantidade;
		this.id_produtos = id_produtos;
		this.email_usuarios = email_usuarios;
	}

	public Requests() {
		
	}
	
	
	Random gerador = new Random();
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Products getId_produtos() {
		return id_produtos;
	}

	public void setId_produtos(Products id_produtos) {
		this.id_produtos = id_produtos;
	}

	public Users getEmail_usuarios() {
		return email_usuarios;
	}

	public void setEmail_usuarios(Users email_usuarios) {
		this.email_usuarios = email_usuarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email_usuarios, id, id_produtos, quantidade, valor_total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requests other = (Requests) obj;
		return Objects.equals(email_usuarios, other.email_usuarios) && Objects.equals(id, other.id)
				&& Objects.equals(id_produtos, other.id_produtos) && Objects.equals(quantidade, other.quantidade)
				&& Objects.equals(valor_total, other.valor_total);
	}

	@Override
	public String toString() {
		return "RequestsDaoImplents [id=" + id + ", valor_total=" + valor_total + ", quantidade=" + quantidade + ", id_produtos="
				+ id_produtos + ", email_usuarios=" + email_usuarios + "]";
	}
	
	 public double id () {
			
			this.id = (int) (1+gerador.nextDouble());
			
			return id;
		}
	
}
