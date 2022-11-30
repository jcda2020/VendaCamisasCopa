package model.dao;

import dao.VendasMethods;
import model.Pedidos;

public class PedidosImplementsDao implements VendasMethods{

	private String email;
	
	
	
	public PedidosImplementsDao() {
		
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public void inseriPedido(int quantidade, double valor, int id_produto, String email_usuario) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Pedidos findPedidos(String email_usuario) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Pedidos findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void updatePedido(Integer id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deletePedido(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
