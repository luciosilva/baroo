import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Main {

	public static void main(String[] args) {

		char sexo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\nRELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n",bill.feeding());
		if(bill.cover() == 0.0)
			System.out.println("Isento de Couvert");
		else
			System.out.printf("Couvert = R$ %.2f%n",bill.cover());	
		System.out.printf("Ingresso = R$ %.2f%n",bill.ticket());

		System.out.printf("\nValor a pagar = R$ %.2f%n",bill.total());

	}
}
