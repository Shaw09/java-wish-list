package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<String> gifts;
		Scanner scanner = new Scanner(System.in);
		
		gifts = new ArrayList<String>();
		boolean continua = true;
		
		while(continua == true) {
			System.out.print("Inserisci il regalo che vuoi: ");
			gifts.add(scanner.nextLine());
			System.out.println("La lista � composta da: " + gifts.size() + " elementi");
			System.out.print("Vuoi inserire altro? (s/n)");
			String scelta = scanner.nextLine();
			if(scelta.equalsIgnoreCase("n")) {
				continua = false;
			} else if(scelta.equalsIgnoreCase("s")) {
				
			} else {
				System.out.println("Error, inserire input valido");
			}
		}
		
		System.out.println("La tua lista � composta da: ");
		Collections.sort(gifts);
		for(int i = 0; i < gifts.size(); i++) {
			System.out.println(gifts.get(i));
		}
		
		scanner.close();	
	}

}
