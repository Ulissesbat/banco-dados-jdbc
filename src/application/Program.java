package application;

import java.util.Date;

import model.entities.Departmente;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Departmente obj = new Departmente(1, "Books");
		
		Seller seller = new Seller(2, "Maria", "maria@gmail.com", new Date(), obj);
		
		System.out.println(seller);
	}

}
