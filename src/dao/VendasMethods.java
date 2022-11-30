package dao;

import model.Pedidos;

public interface VendasMethods {
	
	void inseriPedido(int quantidade, double valor, int id_produto, String email_usuario);
	Pedidos findPedidos(String email_usuario);
	Pedidos findById(Integer id);
	void updatePedido(Integer id);
	void deletePedido(Integer id);

}
