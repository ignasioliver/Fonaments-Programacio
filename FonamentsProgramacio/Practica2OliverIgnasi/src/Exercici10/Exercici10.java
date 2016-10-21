package Exercici10;

import Keyboard.*;

public class Exercici10 {
	public static void main (String args[]){
		double aposta;
		int dau1, dau2;
		System.out.println("Entra la quantitat que vols apostar: ");
		aposta = Keyboard.readDouble();
		dau1 = (int) Math.round(Math.random() * 5 + 1);
		System.out.println("Llancem el dau .... ha sortit el numero " + dau1);
		if (dau1 % 2 != 0) System.out.println("felicitats has guanyat .... " + aposta * 3);
		else if (dau1 % 2 == 0){
			dau2 = (int) Math.round(Math.random() * 5 + 1);
			System.out.println("Llancem el segon dau .... ha sortit el numero " + dau2);
				if (dau1 + dau2 == 5) System.out.println("felicitats has guanyat ..... " + aposta * 2);
				else if (dau1 + dau2 == 8 || dau1 + dau2 == 10 || dau1 + dau2 == 11) System.out.println("felicitats has guanyat ..... " + aposta * 1.5);
				else System.out.print("Ohhhh has perdut");
		}else System.out.print("S'ha produit un error.");
	}
}
