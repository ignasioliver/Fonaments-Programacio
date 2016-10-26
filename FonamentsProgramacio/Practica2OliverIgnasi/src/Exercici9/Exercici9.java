package Exercici9;

import Keyboard.*;

public class Exercici9 {
	public static void main (String args[]){
		System.out.println("*************Comptadors de vocals*************");
		System.out.println("Entra els caracters un a un. Per acabar entra el punt:");
		int A = 0, E = 0, I = 0, O = 0, U = 0;
		char entrada = 0;
		double vocals = 0, consonants = 0;
		while (entrada != '.'){
			entrada = Keyboard.readChar();
			if (entrada == 'A') A++;
			else if (entrada == 'E') E++;
			else if (entrada == 'I') I++;
			else if (entrada == 'O') O++;
			else if (entrada == 'U') U++;
			else if (entrada == 'a' || entrada == 'e' || entrada == 'i' || entrada == 'o' || entrada == 'u') vocals++;
			else if ((entrada >= 'B' && entrada <= 'Z') || (entrada >= 'b' && entrada <= 'z')) consonants++;
		}
		System.out.println("Comptador de vocals majúscules\n==============================");
		System.out.println("Nombre de A: " + A + "\nNombre de E: " + E + "\nNombre de I: " + I);
		System.out.println("Nombre de O: " + O + "\nNombre de U: " + U + "\n");
		System.out.println("Els percentatges són els seguents:\n---------------------------------");
		vocals = A + E + I + O + U + vocals;
		System.out.println("Vocals: " + (vocals / (vocals + consonants)) * 100 + " %");
		System.out.println("Consonants: " + (consonants / (vocals + consonants)) * 100 + " %");
	}
}