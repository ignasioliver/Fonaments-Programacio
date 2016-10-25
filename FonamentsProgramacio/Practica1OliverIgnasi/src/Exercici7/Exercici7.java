package Exercici7;

import Keyboard.*;

public class Exercici7 {
	public static void main(String args[]){
		int hores, minuts, segons;
		System.out.println("Especifica el numero de hores");
		System.out.println("-----------------------------");
		hores = Keyboard.readInt();
		System.out.println("Especifica el numero de minuts");
		System.out.println("-----------------------------");
		minuts = Keyboard.readInt();
		System.out.println("Especifica el numero de segons");
		System.out.println("-----------------------------");
		segons = Keyboard.readInt();
		System.out.print(hores + "h-" + minuts + "'-" + segons + "\" son : " + ((hores * 3600) + (minuts * 60) + segons) + "\"");
	}
}
