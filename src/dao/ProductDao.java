package dao;

import java.util.List;

import model.Products;

public interface ProductDao {
void inseriProduto(Products produto);
List<Products> findAll();
Products findById(Integer id);
void updateProduct(Integer id);
void deleteProduct(Integer id);
	
	
}
