package ui;

import generated.wsimport.*;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface{
	private Scanner s;
	
	public UserInterface() {
		s = new Scanner(System.in);
	}
	
	public void header() {
		System.out.println(">>> PESQUISA DE PREÇOS <<<\n");
		System.out.println("______________________________\n\n");
	}
	
	public int menu() {
		System.out.println("[1] Cadastrar novo mercado");
		System.out.println("[2] Consultar ID do mercado");
		System.out.println("[3] Cadastrar novo produto");
		System.out.println("[4] Consultar ID do produto");
		System.out.println("[5] Deletar um produto");
		System.out.println("[6] Cadastrar lista de compras");
		System.out.println("[7] Buscar melhores ofertas\n");
		System.out.println("Escolha uma opção: ");
		int opt = s.nextInt();
		System.out.println("\n");
		
		return opt;
	}
	
	public Marketplace newMarketplace() {
		Marketplace m = new Marketplace();
		String name = new String();
		String address = new String();
		String contact = new String();
		String opening = new String();
		
		System.out.println("> NOME: ");
		name = s.next();
		System.out.println("> UNIDADE (CASO HAJA): ");
		name = name + " " + s.next();
		System.out.println("> ENDERECO: ");
		address = s.next();
		System.out.println("> CONTATO: ");
		contact = s.next();
		System.out.println("> HORÁRIO DE ABERTURA: ");
		opening = s.next();
		System.out.println("> HORÁRIO DE FECHAMENTO: ");
		opening = opening + " - " + s.next();
		System.out.println("\n");
		
		m.setName(name);
		m.setAddress(address);
		m.setContact(contact);
		m.setOpening(opening);
		
		return m;
	}
	
	public String searchMarketId() {
		String name = new String();
		
		System.out.println("> NOME DO MERCADO: ");
		name = s.next();
		System.out.println("> UNIDADE (CASO HAJA): ");
		name = name + " " + s.next();
		
		return name;
	}
	
	public Product newProduct() {
		Product p = new Product();
		String name = new String();
		String brand = new String();
		String measure = new String();
		int id_market = 0;
		double price = 0;
		
		System.out.println("> NOME: ");
		name = s.next();
		System.out.println("> MARCA: ");
		brand = s.next();
		System.out.println("> MEDIDA: ");
		measure = s.next();
		System.out.println("> ID DO MERCADO: ");
		id_market = s.nextInt();
		System.out.println("> PRECO: ");
		price = s.nextDouble();
		System.out.println("\n");
		
		p.setName(name);
		p.setBrand(brand);
		p.setMeasure(measure);
		p.setMarketId(id_market);
		p.setPrice(price);
		
		return p;
	}
	
	public String searchProductId() {
		String name = new String();
		
		System.out.println("> NOME DO PRODUTO: ");
		name = s.next();
		
		System.out.println("\n");
		return name;
	}
	
	public String deleteProduct() {
		String name = new String();
		
		System.out.println("> NOME DO PRODUTO: ");
		name = s.next();
		
		System.out.println("\n");
		return name;
	}
	
	public ArrayList<String> newList() {
		ArrayList<String> items = new ArrayList<String>();
		String item = new String();
		
		System.out.println("Adicione os itens da sua lista de compras. Digite \"sair\" quando terminar.");
		
		item = s.next();
		while((!item.equals("sair")) || (!item.equals("SAIR")) || (!item.equals("Sair"))) {
			items.add(item);
			item = s.next();
		}
		
		System.out.println("\n");
		return items;
	}
	
	public void searchBestOffers() {
		System.out.println("Buscando as melhores ofertas para você...\n");
	}
	
	public void printMarket(String info) {
		System.out.println(info + "\n");
	}
	
	public void printProduct(String info) {
		System.out.println(info + "\n");
	}
	
	public void printGroceriesList(String info) {
		System.out.println(info + "\n");
	}
	
	public void printBestOffers(String info) {
		System.out.println(info + "\n");
	}
}