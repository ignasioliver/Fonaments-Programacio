package Exercici2;

import Keyboard.*;

public class Exercici2 {
	public static void main (String args[]) {
		double base, alcada;
		System.out.println("Quina és la base?");
		base = Keyboard.readDouble();
		System.out.println("Quina és l'alçada?");
		alcada = Keyboard.readDouble();
		System.out.println("***PROGRAMA ÀREA TRIANGLE***");
		System.out.println("Mida de la base: " + base);
		System.out.println("Mida de l'alçada: " + alcada);
		System.out.println("L'àrea del triangle és: " + (base * alcada) / 2);
	}
}