package model.dao;

import java.sql.Connection;
import java.util.List;

import dao.ProductDao;
import model.Products;

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
		// TODO Auto-generated method stub
		return null;
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
