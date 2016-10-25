package Exercici2;

import Keyboard.*;

public class Exercici2 {
	public static void main (String args[]) {
		double base, alcada;
		System.out.println("Quina es la base?");
		base = Keyboard.readDouble();
		System.out.println("Quina es l'alcada?");
		alcada = Keyboard.readDouble();
		System.out.println("***PROGRAMA AREA TRIANGLE***");
		System.out.println("Mida de la base: " + base);
		System.out.println("Mida de l'alcada: " + alcada);
		System.out.println("L'area del triangle es: " + (base * alcada) / 2);
	}
}