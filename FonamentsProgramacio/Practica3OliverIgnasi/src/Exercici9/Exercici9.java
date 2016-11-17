package Exercici9;

import Keyboard.*;
//L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible
public class Exercici9 {
	public static void main (String args[]){
		int numero, fila = 1, columna;
		System.out.println("Prova de dibuix d'una sola cadira donat un numero (escriu-lo):");
		numero = Keyboard.readInt();
		while (fila <= numero){
			columna = 1;
			if (fila < numero / 2 + 1) System.out.print("*");
			else if (fila == numero / 2 + 1){
				while (columna <= numero){
					System.out.print("*");
					columna++;
				}
			}else{
				System.out.print("*");
				columna = 2;
				while (columna < numero){
					System.out.print(" ");
					columna++;
				}
				System.out.print("*");
			}
			System.out.println();
			fila++;
		}
	}
}