package Exercici8;

import Keyboard.*;

public class Exercici8 {
	public static void main (String args[]){
		System.out.println("*************Comptadors de vocals*************");
		System.out.println("Entra els caracters un a un. Per acabar entra el punt:");
		int A = 0, E = 0, I = 0, O = 0, U = 0, entrada = 0;
		while (entrada != '.'){
			entrada = Keyboard.readChar();
			if (entrada == 'A') A++;
			else if (entrada == 'E') E++;
			else if (entrada == 'I') I++;
			else if (entrada == 'O') O++;
			else if (entrada == 'U') U++;
		}
		System.out.println("Comptador de vocals majuscules");
		System.out.println("==============================");
		System.out.println("Nombre de A: " + A);
		System.out.println("Nombre de E: " + E);
		System.out.println("Nombre de I: " + I);
		System.out.println("Nombre de O: " + O);
		System.out.println("Nombre de U: " + U);
	}
}
