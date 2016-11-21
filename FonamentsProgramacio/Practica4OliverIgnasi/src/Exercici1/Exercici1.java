package Exercici1;

import Keyboard.*;

public class Exercici1 {
	public static void main (String args[]){
		int n;
		System.out.println("Introdueix l'edat de la persona que ha de seure: ");
		n = Keyboard.readInt();
		if (n >= 3 && n <= 7 ||  n > 21 && n % 2 != 0 ) cadira(n);
		else if (n >= 4 && n <= 6 || n > 7 && n < 21 || n > 21 && n % 2 == 0) tamboret(n);
		else if (n < 3) System.out.print("Encara li cal un cotxet per assentar-se!");
		else System.out.println("Valor no valid"); //pensar si realment cal afegir-lo
		
	}
		
	public static void tamboret (int n){
		int fila = 1, columna, espais;
		for (fila = 1; fila <= n; fila++){
			if (fila == 1 || fila == 2){
				for (columna = 1; columna <= n; columna++) System.out.print("*");
			}else{
				System.out.print("*");
				for (espais = 2; espais < n; espais++) System.out.print(" ");
				System.out.print("*");
			}System.out.println();
		}
	}
		
	public static void cadira (int n){
		int fila = 1, columna, espais;
		for (fila = 1; fila <= n; fila++){
			if (fila < n / 2 + 1) System.out.print("*");
			else if (fila == n / 2 + 1){ 
				for (columna = 1; columna <= n; columna++) System.out.print("*");
			}else {
				System.out.print("*");
				for (espais = 2; espais < n; espais++) System.out.print(" ");
				System.out.print("*");
			}System.out.println();
		}
	}
}