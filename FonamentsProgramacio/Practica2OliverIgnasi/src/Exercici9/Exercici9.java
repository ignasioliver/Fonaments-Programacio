package Exercici9;

import Keyboard.*;

public class Exercici9 {
	public static void main (String args[]){
		System.out.println("*************Comptadors de vocals*************");
		System.out.println("Entra els caracters un a un. Per acabar entra el punt:");
		double A = 0, E = 0, I = 0, O = 0, U = 0, vocals =0, entrada = 0, consonants =0;
		while (entrada != '.'){
			entrada = Keyboard.readChar();
			if (entrada == 'A') A++;
			else if (entrada == 'E') E++;
			else if (entrada == 'I') I++;
			else if (entrada == 'O') O++;
			else if (entrada == 'U') U++;
			else if (entrada == 'a' || entrada == 'e' || entrada == 'i' || entrada == 'o' || entrada == 'u') vocals++;
			else if ((entrada == 'b' || entrada == 'B' || entrada == 'c' || entrada == 'C' || entrada == 'd'
					||entrada == 'D' || entrada == 'f' || entrada == 'F' || entrada == 'g' || entrada == 'G'
					|| entrada == 'h' || entrada == 'H' || entrada == 'j' || entrada == 'J' || entrada == 'k'
					|| entrada == 'K' || entrada == 'l' || entrada == 'L' || entrada == 'm' || entrada == 'M'
					|| entrada == 'n' || entrada == 'N' || entrada == 'p' || entrada == 'P' || entrada == 'q'
					|| entrada == 'Q' || entrada == 'r' || entrada == 'r' || entrada == 's' || entrada == 'S'
					|| entrada == 't' || entrada == 'T' || entrada == 'v' || entrada == 'V' || entrada == 'w'
					|| entrada == 'W' || entrada == 'x' || entrada == 'X' || entrada == 'z' || entrada == 'Z')) consonants++;
		}
		System.out.println("Comptador de vocals majuscules");
		System.out.println("==============================");
		System.out.println("Nombre de A: " + A);
		System.out.println("Nombre de E: " + E);
		System.out.println("Nombre de I: " + I);
		System.out.println("Nombre de O: " + O);
		System.out.println("Nombre de U: " + U);
		System.out.println();
		System.out.println("Els percentatges son els seguents:");
		System.out.println("---------------------------------");
		vocals = A + E + I + O + U + vocals;
		System.out.println("Vocals: " + (vocals / (vocals + consonants)) * 100 + "%");
		System.out.println("Consonants: " + (consonants / (vocals + consonants)) * 100 + "%");
	}
}
