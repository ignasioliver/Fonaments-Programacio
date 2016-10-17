package Exercici6;

import Keyboard.*;

public class Exercici6 {
	public static void main(String args[]){
		int resultat;
		int residu;
		residu = 0;
		System.out.println("Especifica el numero de segons");
		System.out.println("------------------------------");
		resultat = Keyboard.readInt();
		System.out.print(resultat);
		System.out.print(" son: ");
		System.out.print(resultat/3600);
		System.out.print(" hores i ");
		System.out.print(resultat%60);
		System.out.print(" minuts i queden ");
		System.out.print(residu);
		System.out.print(" segons");
	}
}
