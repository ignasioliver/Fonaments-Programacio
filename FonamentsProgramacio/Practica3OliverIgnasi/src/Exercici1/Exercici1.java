package Exercici1;

import Keyboard.*;
// L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible
public class Exercici1 {
	public static void main (String args[]){
		char entrada = ' ';
		String frase = "";
		System.out.println("Entra un text caràcter a caràcter. Prem el punt per finalitzar");
		do {
			entrada = Keyboard.readChar();
			if (entrada != '.') frase = entrada + frase; //Inverteixo el text
		} while (entrada != '.');
		System.out.print("El text girat és: \n" + frase);
	}
}