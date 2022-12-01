package model;

import java.io.Serializable;
import java.util.Objects;

public class People implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String address;
	
	private String cpf;
	
	private Double telefone;
	
	private String name;	
	
	
	public People() {
		
	}

	public People(String address, String cpf, Double telefone, String name) {
	
		this.address = address;
		this.cpf = cpf;
		this.telefone = telefone;
		this.name = name;
	}
	


	public String getAddress() {
		return address;
	}
	


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getTelefone() {
		return telefone;
	}


	public void setTelefone(double d) {
		this.telefone = d;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, cpf, name, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(address, other.address) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(name, other.name) && Objects.equals(telefone, other.telefone);
	}
	
		
	
	
}
