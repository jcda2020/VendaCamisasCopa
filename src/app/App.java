package app;

import java.util.Scanner;

import model.Requests;
import model.dao.RequestsDaoImplents;

public class App {
	
	
	
	public static void main(String[] args) {
		
		Scanner leiaValores = new Scanner(System.in);
		
		RequestsDaoImplents pedido = new RequestsDaoImplents();
		
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
		
		
		pedido.inseriPedido(null);
		
	}

}
