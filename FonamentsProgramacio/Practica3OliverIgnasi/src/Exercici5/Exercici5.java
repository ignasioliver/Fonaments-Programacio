package Exercici5;

import Keyboard.*;
//L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible
public class Exercici5 {
	public static void main (String args[]){
		int dau1, dau2, valordaus, N, stopper = 1; //stopper = jugador
		double diners, dinersinicials;
		System.out.println("Quants voleu jugar:");
		N = Keyboard.readInt();
		while (N < 2){
			System.out.println("Valor no correcte. Quants voleu jugar >= 2:");
			N = Keyboard.readInt();
		}
		while (stopper <= N){
			dau1 = (int) Math.round(Math.random() * 5 + 1);
			dau2 = (int) Math.round(Math.random() * 5 + 1);
			System.out.println("Indica la quantitat de diners que vol jugar el jugador " + stopper);
			dinersinicials = Keyboard.readDouble();
			while (dinersinicials < 0){
				System.out.println("Valor de diners no correcte. Indica un altre import...");
				dinersinicials = Keyboard.readDouble();
			}
			diners = dinersinicials; //Per poder mostrar els diners inicials al print del final
			valordaus = dau1 + dau2;
			switch (valordaus){
				case 2: diners = diners * 2; break;
				case 3: if (diners % 4 == 0) diners = 12;
						else diners = 4; break;
				case 4: diners = diners / 10;
						if (diners < 0) diners = 0; break;
				case 5: diners = diners - diners /4; break;
				case 6: if (dau1 == 3) diners = diners * 2; //SI ho es un dau l'altre ho sera per forca
						else diners = diners * 3; break;
				case 7: diners = diners / 10;
						if (diners < 0) diners = 0; break;
				case 8: diners = diners + diners / 10; break;
				case 9: diners = Math.pow(diners, 5); break;
				case 10: diners = Math.sqrt(diners); break; 
				case 11: if (dau1 == 6 || dau2 == 6) diners = Math.pow(diners, 5);
						else diners = Math.sqrt(diners); break;
				case 12: break;
			}
			System.out.print("Tirem els daus i...\nHa sortit el dau: " + dau1 + "\nHa sortit el dau: ");
			System.out.println(dau2 + "\nJugador " + stopper + " et jugaves: " + dinersinicials + " i ara tens " + diners + "\n\n");
			stopper++;
		}
	}
}