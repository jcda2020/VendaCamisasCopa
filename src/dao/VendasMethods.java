package dao;

import model.Requests;

public interface VendasMethods {
	
	void inseriPedido(Requests pedido);
	Requests findPedidos(String email_usuario);
	Requests findById(Integer id);
	void updatePedido(Integer id);
	void deletePedido(Integer id);

}
