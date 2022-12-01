package model;

import java.io.Serializable;
import java.util.Objects;

public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  String email;
	
	private String password;
	
	private People cpf_people;
	
	
	
	public Users() {
		
	}

	public Users(String email, String password, People cpf_people) {
	
		this.email = email;
		this.password = password;
		this.setCpf_people(cpf_people);
	}	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public People getCpf_people() {
		return cpf_people;
	}

	public void setCpf_people(People cpf_people) {
		this.cpf_people = cpf_people;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf_people, email, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(cpf_people, other.cpf_people) && Objects.equals(email, other.email)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "Email: " + email + ",\n Password: " + password + ",\n cpf_people: " + cpf_people ;
	}




	
}
