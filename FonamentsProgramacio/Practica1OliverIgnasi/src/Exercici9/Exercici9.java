package Exercici9;

import Keyboard.*;

public class Exercici9 {
	public static void main(String args[]){
		int valor, resultat;
		System.out.println("Especifica una quantitat");
		System.out.println("------------------------");
		valor = Keyboard.readInt();
		
		resultat = valor / 50000;
		valor = valor % 50000;
		if (resultat != 0) System.out.println(resultat + " Bitllets de 50000 colons");
		
		resultat = valor / 20000;
		valor = valor % 20000;
		if (resultat != 0) System.out.println(resultat + " Bitllets de 20000 colons");
		
		resultat = valor / 10000;
		valor = valor % 10000;
		if (resultat != 0) System.out.println(resultat + " Bitllets de 10000 colons");
		
		resultat = valor / 5000;
		valor = valor % 5000;
		if (resultat != 0) System.out.println(resultat + " Bitllets de 5000 colons");
		
		resultat = valor / 2000;
		valor = valor % 2000;
		if (resultat != 0) System.out.println(resultat + " Bitllets de 2000 colons");
		
		resultat = valor / 1000;
		valor = valor % 1000;
		if (resultat != 0) System.out.println(resultat + " Bitllets de 1000 colons");
		
		resultat = valor / 500;
		valor = valor % 500;
		if (resultat != 0) System.out.println(resultat + " Monedes de 500 colons");
		
		resultat = valor / 100;
		valor = valor % 100;
		if (resultat != 0) System.out.println(resultat + " Monedes de 100 colons");
		
		resultat = valor / 50;
		valor = valor % 50;
		if (resultat != 0) System.out.println(resultat + " Monedes de 50 colons");
		
		resultat = valor / 25;
		valor = valor % 25;
		if (resultat != 0) System.out.println(resultat + " Monedes de 25 colons");
		
		resultat = valor / 10;
		valor = valor % 10;
		if (resultat != 0) System.out.println(resultat + " Monedes de 10 colons");
		
		resultat = valor / 5;
		valor = valor % 5;
		if (resultat != 0) System.out.println(resultat + " Monedes de 5 colons");
		
		resultat = valor / 1;
		valor = valor % 1;
		if (resultat != 0 )System.out.println(resultat + " Monedes de 1 colon");
	}
}