package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.StatementImpl;
import dao.VendasMethods;
import db.DB;
import db.DbException;
import model.Requests;

public class RequestsDaoImplents implements VendasMethods{	
	
	private Connection conn;

	public RequestsDaoImplents(Connection conn) {
		super();
		this.conn = conn;
	}

	public RequestsDaoImplents() {
		
	}

	@Override
	public void inseriPedido(Requests pedido) {
		PreparedStatement stmt = null;
		String sql = "INSERT INTO pedidos (quantidade, valor_total, id_produtos, email_usuarios) VALUES "
				+ "(?, ?, ?, ?)";
		
		try {
			stmt = conn.prepareStatement(sql, StatementImpl.RETURN_GENERATED_KEYS);
			stmt.setInt(1, pedido.getQuantidade());
			stmt.setDouble(2, pedido.getValor_total());
			stmt.setInt(3, pedido.getId_produtos().getId());
			stmt.setString(4, pedido.getEmail_usuarios().getEmail());
		
		
		
		int linhaAfetada = stmt.executeUpdate();		
		
		if (linhaAfetada > 0 ) {
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				int id = rs.getInt(1);
				System.out.println("Pedido registrado com sucesso!");					
			}
			
			
		}else {
			
			throw new DbException("Error: Nenhuma pedido foi registrado!");
		}
		
			
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		DB.closeStatement(stmt);
	}
	
		
	}

	@Override
	public Requests findPedidos(String email_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Requests findById(Integer id) {
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
