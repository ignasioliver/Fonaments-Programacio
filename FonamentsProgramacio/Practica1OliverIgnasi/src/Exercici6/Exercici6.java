package Exercici6;

import Keyboard.*;

public class Exercici6 {
	public static void main(String args[]){
		int resultat;
		System.out.println("Especifica el número de segons");
		System.out.println("------------------------------");
		resultat = Keyboard.readInt();
		System.out.print(resultat);
		System.out.print(" són: ");
		System.out.print(resultat / 3600);
		System.out.print(" hores i ");
		System.out.print(resultat % 3600 / 60);
		System.out.print(" minuts i queden ");
		System.out.print(resultat % 60);
		System.out.print(" segons");
	}
}