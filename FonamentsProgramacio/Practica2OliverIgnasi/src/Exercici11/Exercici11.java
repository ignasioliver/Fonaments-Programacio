package Exercici11;

import Keyboard.Keyboard;

public class Exercici11 {
	public static void main (String args[]){
		int eleccio = 0;
		while (eleccio != 3){
			System.out.println("Escull segons siguin euros o pessetes la quantitat que entraràs");
			System.out.println("	1.- Euros\n	2.- Pessetes\n	3.- Finalitzar");
			eleccio = Keyboard.readInt();
			double quantitat = 0, diners;
			if (eleccio == 1){
				System.out.println("Entra la quantitat a convertir ");
				quantitat = Keyboard.readDouble();
				diners = quantitat * 166.386;
				System.out.println("--------------------------------------------");
				System.out.println(quantitat + " euros són " + Math.round(diners) + " pessetes");
			}else if (eleccio == 2){
				System.out.println("Entra la quantitat a convertir ");
				quantitat = Keyboard.readDouble();
				diners = quantitat / 166.386;
				System.out.println("--------------------------------------------");
				System.out.println(quantitat + " euros són " + diners + " euros");
			}else if (eleccio != 3 && eleccio != 2 && eleccio != 1)	System.out.println("Opció no existent");
			System.out.println();
		}
		System.out.print("Fi del programa");
	}
}