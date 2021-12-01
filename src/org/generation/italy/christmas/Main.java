package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<String> gifts;
		Scanner scanner = new Scanner(System.in);
		
		gifts = new ArrayList<String>();
		boolean continua = false;
		
		while(continua == false) {
			// chiedere all`utente l`inserimento del regalo
			System.out.print("Inserisci il regalo che vuoi: ");
			gifts.add(scanner.nextLine());
			// stampare tutti i regali inseriti fino ad ora
			System.out.println(gifts.size());
			// chiedere se vuole continuare con l`inserimento
			System.out.print("Vuoi inserire altro? (s/n)");
			String scelta = scanner.nextLine();
			// se la risposta è si il ciclo ricomincia
			if(scelta.equalsIgnoreCase("n")) {
				continua = true;
			// se la risposta è no il ciclo finisce
			} else if(scelta.equalsIgnoreCase("s")) {
				
			} else {
				System.out.println("Error, inserire input valido");
			}
		}
		
		System.out.println("La tua lista è composta da: ");
		
		for(int i = 0; i < gifts.size(); i++) {
			System.out.println(gifts.get(i));
		}
		
//		System.out.print("Inserisci il regalo che vuoi: ");
//		gifts.add(scanner.nextLine());
//		
//		
//		System.out.print("Vuoi inserire altro? (s/n)");
//		String scelta = scanner.nextLine();
//		
//		
//		for(int i = 0; i < gifts.size(); i++) {
//			System.out.println(gifts.get(i));
//		}
//		
//		
//		if(scelta.equalsIgnoreCase("s")) {
//			gifts.add(scanner.nextLine());
//		} else {
//			System.out.println("La tua lista è composta da: " + gifts.get(i) + "elementi");
//			System.out.println(gifts);
//		}
		scanner.close();	
	}

}
