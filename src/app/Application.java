package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Products;
import model.Requests;
import model.dao.ProductsDaoImplements;
import model.dao.RequestsDaoImplents;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner leiaValores = new Scanner(System.in);
		
		RequestsDaoImplents pedido = new RequestsDaoImplents();
		
		ProductsDaoImplements produtos = new ProductsDaoImplements();
		
		List<Products> listaProdutos = new ArrayList<>();
		
		listaProdutos.addAll(produtos.findAll());   
		System.out.println("--------------------------------------------");
		
		
		for (Products products : listaProdutos) {
			System.out.println(products);
		}
		
		System.out.println("--------------------------------------------");
		
		System.out.println("ID do produto: ");
		int idProduto = leiaValores.nextInt();
		//String nome = leiaValores.nextLine();

		
		System.out.println("Digite a quantidade: ");
		//Recebe a data como String
		//String dataString = leiaValores.next();
		int quantidade = leiaValores.nextInt();
		
		double valorTotal = leiaValores.nextDouble();	
			
		
		//leiaValores.nextLine();  // Consume newline left-over
		
		
		System.out.println("Digite o email: ");
		String email = leiaValores.next();
		
		Requests compra = new Requests();
		compra.setId(idProduto);
		compra.setQuantidade(quantidade);
		compra.setValor_total(valorTotal);
		
		
		pedido.inseriPedido(compra);

	}

}
