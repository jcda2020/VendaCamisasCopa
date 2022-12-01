package dao;

import java.util.List;

import model.Requests;
import model.Users;

public interface VendasMethods {
	
	void inseriPedido(Requests pedido);
	List<Requests> findPedidos(String email_usuario);
	Requests findById(Integer id);
	List<Requests> findPedidos();
	void updatePedido(Integer id);
	void deletePedido(Integer id);

}
