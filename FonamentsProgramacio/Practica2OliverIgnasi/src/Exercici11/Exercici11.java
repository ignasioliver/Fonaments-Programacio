package Exercici11;

import Keyboard.Keyboard;

public class Exercici11 {
	public static void main (String args[]){
		int eleccio = 0;
		while (eleccio != 3){
			System.out.println("Escull segons siguin euros o pessetes la quantitat que entraras");
			System.out.println("	1.- Euros");
			System.out.println("	2.- Pessetes");
			System.out.println("	3.- Finalitzar");
			eleccio = Keyboard.readInt();
			double quantitat = 0, diners;
			if (eleccio == 1){
				System.out.println("Entra la quantitat a convertir ");
				quantitat = Keyboard.readDouble();
				diners = quantitat * 166.386;
				System.out.println("--------------------------------------------");
				System.out.println(quantitat + " euros son " + Math.round(diners) + " pessetes");
			}else if (eleccio == 2){
				System.out.println("Entra la quantitat a convertir ");
				quantitat = Keyboard.readDouble();
				diners = quantitat / 166.386;
				System.out.println("--------------------------------------------");
				System.out.println(quantitat + " euros son " + diners + " euros");
			}else if (eleccio != 3 && eleccio != 2 && eleccio != 1)	System.out.println("Opcio no existent");
			System.out.println();
		}
		System.out.println("Fi del programa");
	}
}
