package calculadoranota;

import Keyboard.*;

public class calculadoranota {
	public static void main (String args[]){
		double practica1, practica2, practica3, practica4, examen1, examen2, notamode1, notamode2;
		System.out.println("Introdueix les seguents notes");
		System.out.print("Practica 1: ");
		practica1 = Keyboard.readDouble();
		System.out.print("Practica 2: ");
		practica2 = Keyboard.readDouble();
		System.out.print("Practica 3: ");
		practica3 = Keyboard.readDouble();
		System.out.print("Practica 4: ");
		practica4 = Keyboard.readDouble();
		System.out.println("Ara introdueix la nota dels examens:");
		System.out.print("Nota del primer examen: ");
		examen1 = Keyboard.readDouble();
		System.out.print("Nota del segon examen: ");
		examen2 = Keyboard.readDouble();
		if (examen2 >= 4.00 && practica1 >= 0 && practica2 >= 0 && practica3 >= 0 && practica4 >= 0 && practica1 <= 10 && practica2 <= 10 && practica3 <= 10 && practica4 <= 10 && examen1 >= 0 && examen2 >= 0 && examen1 <= 10 && examen2 <= 10){
			notamode1 = ((practica1 + practica2 + practica3 + practica4)/4) * 0.35 + examen1 * 0.15 + examen2 * 0.5; 
			notamode2 = examen2 * 0.65 + ((practica1 + practica2 + practica3 + practica4)/4) * 0.35;
			if (notamode1 >= notamode2) System.out.println("La teva nota final es " + notamode1);
			else System.out.println("La teva nota final es " + notamode2);
		}else if(examen2 < 4.00 && practica1 >= 0 && practica2 >= 0 && practica3 >= 0 && practica4 >= 0 && practica1 <= 10 && practica2 <= 10 && practica3 <= 10 && practica4 <= 10 && examen1 >= 0 && examen2 >= 0 && examen1 <= 10 && examen2 <= 10){
			System.out.println("La teva nota final es " + examen2);
		}else System.out.println ("Siusplau introdueix com a notes valors numerics valids, de 0 a 10.");
	}
}
