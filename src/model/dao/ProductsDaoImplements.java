package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import db.DB;
import model.Products;
import model.Users;

public class ProductsDaoImplements implements ProductDao{
	private Connection conn;

	public ProductsDaoImplements(Connection conn) {
		
		this.conn = conn;
	}

	@Override
	public void inseriProduto(Products produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Products> findAll() {
		
		List<Products> listProducts = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM produtos";	
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();			
		
			while (rs.next()) {
				Products produto = new Products();
				
				produto.setSelecao(rs.getString("selecao"));
				produto.setPadrao(rs.getString("padrao"));
				produto.setSize(rs.getString("tamanho"));
				produto.setPrice(rs.getDouble("preco"));
				produto.setId(rs.getInt(rs.getInt("id")));
				listProducts.add(produto);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(stmt);
			DB.closeResultset(rs);
		}
		
		
		return listProducts;
		
		
		
		
	}

	@Override
	public Products findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
