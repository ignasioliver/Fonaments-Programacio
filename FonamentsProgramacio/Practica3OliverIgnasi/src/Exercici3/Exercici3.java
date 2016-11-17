package Exercici3;

import Keyboard.*;
//L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible
public class Exercici3 {
	public static void main (String args[]){
		int numero, ultimnumero, entrada;
		String invertit = "";
		boolean stopper = false;
		System.out.println("******Invertit número******\nEntra el número a invertir");
		entrada = Keyboard.readInt();
		numero = entrada;
		/* Indispensable que desi l'entrada en una variable amb la que no treballare per poder-la
		mostrar a l'inici */
		while(stopper == false){
			if (entrada < 0){
				System.out.println("Incorrecte. Ha de ser positiu. entra un altre número");
				entrada = Keyboard.readInt();
				numero = entrada;
			}else{
				ultimnumero = numero % 10; //obtinc l'ultim nombre
				numero = numero / 10; //actualitzo el valor traienli l'ultima xifra
				invertit = invertit + ultimnumero;
				if (numero <= 0) stopper = true;
			}
		}
		System.out.println("El número invertit del " + entrada + " és el " + invertit);
	}
}