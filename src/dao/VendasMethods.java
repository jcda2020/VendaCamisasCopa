package dao;

import model.Requests;

public interface VendasMethods {
	
	void inseriPedido(int quantidade, double valor, int id_produto, String email_usuario);
	Requests findPedidos(String email_usuario);
	Requests findById(Integer id);
	void updatePedido(Integer id);
	void deletePedido(Integer id);

}
