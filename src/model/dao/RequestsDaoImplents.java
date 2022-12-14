package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.StatementImpl;
import dao.VendasMethods;
import db.DB;
import db.DbException;
import model.Products;
import model.Requests;
import model.Users;

public class RequestsDaoImplents implements VendasMethods{	
	
	private Connection conn;

	public RequestsDaoImplents(Connection conn) {
		
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
	public List<Requests>findPedidos(String email_usuario) {
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

	@Override
	public List<Requests> findPedidos() {
		List<Requests> listProductsOrded = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pedidos";	
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();			
		
			while (rs.next()) {
				Requests pedido = new Requests();
				Users user = new Users ();
				
				pedido.setId(rs.getInt(rs.getInt("id")));
				pedido.setQuantidade(rs.getInt("quantidade"));
				
				pedido.setEmail_usuarios((Users) rs.getObject("email_usuarios"));
				
				listProductsOrded.add(pedido);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(stmt);
			DB.closeResultset(rs);
		}
		
		
		return listProductsOrded;
	}

	
	
	
	
	



	



	
}
