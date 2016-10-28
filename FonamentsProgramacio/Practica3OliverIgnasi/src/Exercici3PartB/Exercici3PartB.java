package Exercici3PartB;

import Keyboard.*;

public class Exercici3PartB {
	public static void main (String args[]){
		int entrada, a = -1, b = 0, numeroinvertit = 0, numero;
		boolean stopper = false;
		System.out.println("Entra valor inferior a l'interval");
		while (stopper == false){
			entrada = Keyboard.readInt();
			if (entrada < 0) System.out.println("Incorrecte. Ha de ser positiu. Entra un altre numero");
			else if(a >= 0){
				b = entrada;
				if (b <= a) System.out.println ("Incorrecte. Ha de ser major a " + a);
				else stopper = true;
			}else if (a == -1){
				a = entrada;
				System.out.println("Entra valor superior a l'interval");
			}
		} //Ja tenim els valors minim i maxim de l'interval
		System.out.println("Dins de l'interval [" + a + ", " + b + "] hi ha"  );
		stopper = false;
		while (a <= b){ //Que iteri des del valor a (minim) fins al b (maxim), inclos
			if (a  % 5 == 0){
				numero = a; //no interessa modificar a fins la seguent iteracio
				while (numero != 0){
					numeroinvertit = numeroinvertit * 10;
					numeroinvertit = numeroinvertit + numero % 10;
					numero = numero/10;
				}System.out.print("El numero invertit del " + a + " es el " + numeroinvertit);
				System.out.println(" i la seva arrel quadrada es " + Math.sqrt(numeroinvertit));
				numeroinvertit=0;
			}a++;
		}
	}
}