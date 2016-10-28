 package Exercici3;

import Keyboard.*;

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
				ultimnumero = numero%10; //obtinc l'ultim nombre
				numero = numero/10; //actualitzo el valor traienli l'ultima xifra
				invertit = invertit + ultimnumero;
				if (numero <= 0) stopper = true;
			}
		}
		System.out.println("El número invertit del " + entrada + " és el " + invertit);
	}
}

/*
 	PREGUNTA: CAL ANAR COMENTANT? PER EXEMPLE L'EXPLICACIO DE CERTES COSES COM L'US D'UN BOOLEAN:
	en aquest cas es necessari l'us d'un bolea/stopper que ens permeti
	aturar el programa quan ho desitjem. No podem fer que el parametre del while
	sigui "numero < 0" ja que en el cas que el numero introduit fos un 0, el valor
	invertit no tindria cap valor, i no seria correcte forca-lo.
*/