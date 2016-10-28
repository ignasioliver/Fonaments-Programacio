package Exercici1;

import Keyboard.*;

public class Exercici1 {
	public static void main (String args[]){
		char entrada = ' ';
		String frase = "";
		System.out.println("Entra un text caràcter a caràcter. Prem el punt per finalitzar");
		while(entrada != '.'){
			entrada = Keyboard.readChar();
			if (entrada != '.') frase = entrada + frase;
		}System.out.print("El text girat és: \n" + frase);
	}
}

// Fet utilitzant boolean al projecte "Activitats"