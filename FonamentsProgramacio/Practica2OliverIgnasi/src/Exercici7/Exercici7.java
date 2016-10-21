package Exercici7;

import Keyboard.*;

public class Exercici7 {
	public static void main (String args[]){
		double a, b, c, x;
		System.out.println("Resolucio d'equacions de 2n grau");
		System.out.println("--------- - --------- -- -- ----");
		System.out.println("Introdueix el primer coeficient de l'equacio (a):");
		a = Keyboard.readDouble();
		System.out.println("Introdueix el segon coeficient de l'equacio (b):");
		b = Keyboard.readDouble();
		System.out.println("Introdueix el tercer coeficient de l'equacio (c):");
		c = Keyboard.readDouble();
		if (a == 0){
			if (b == 0)	System.out.print("L'equacio no te resultats reals");
			else{
				x = -c / b;
				System.out.println("El resultat de l'equacio es: x = " + x);
			}
		}else if (((Math.pow(b, 2)) - 4 * a * c) < 0) System.out.println("L'equacio no te resultats reals");
		else if (((Math.pow(b, 2)) - 4 * a * c) == 0){
			x = -b / (2 * a);
			System.out.println("El resultat de l'equacio es: x = " + x);
		}else if (((Math.pow(b, 2)) - 4 * a * c) > 0){
			x = (-b + Math.sqrt(((Math.pow(b, 2)) - 4 * a * c))) / (2 * a);
			System.out.print("Els resultats de l'equacio son: x = " + x);
			x = (-b - Math.sqrt(((Math.pow(b, 2)) - 4 * a * c))) / (2 * a);
			System.out.println(" i x = " + x);
		}
	}
}