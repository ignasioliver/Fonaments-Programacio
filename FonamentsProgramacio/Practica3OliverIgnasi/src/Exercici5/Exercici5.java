package Exercici5;

import Keyboard.*;

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
		//System.out.println(dau);
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
			System.out.println(valordaus);
			System.out.println(diners);
			System.out.println(dinersinicials);
			switch (valordaus){
			case 2: diners = diners * 2;
			case 3: if (diners % 4 == 0) diners = 12;
					else diners = 4;
			case 4: diners = diners / 10;
					if (diners < 0) diners = 0;
			case 5: diners = diners - diners /4;
			case 6: if (dau1 == 3) diners = diners * 2; //SI ho es una dau l'altre ho sera per forca...
					else diners = diners * 3; 
			case 7: diners = diners / 10;
					if (diners < 0) diners = 0;
			case 8: diners = diners + diners / 10;
			case 9: diners = Math.pow(diners, 5);
			case 10: diners = Math.sqrt(diners);
			case 11: if (dau1 == 6 || dau2 == 6) diners = Math.pow(diners, 5);
					else diners = Math.sqrt(diners);
			case 12:
			}
			System.out.print("Tirem els daus i...\nHa sortit el dau: " + dau1 + "\nHa sortit el dau: ");
			System.out.println(dau2 + "\nJugador " + stopper + " et jugaves: " + dinersinicials + " i ara tens " + diners + "\n\n\n");
			stopper++;
		}
	}
}
// NO FUNCIONA I NO SE PERQUE. POSSIBLEMENT PERQUE ELS SWITCHES NO FUNCIONEN COM EM PENSO. CHECK IT!
//PREGUNTES: EN EL CAS 6, COM QUE UN DELS DOS? HAN  DE SER ELS DOS PER FORCA (SUMEN 6)