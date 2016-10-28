package Exercici2;

import Keyboard.*;

public class Exercici2 {
	public static void main (String args[]){
		char entrada;
		int As = 0, vocals = 0;
		boolean stopper = false;
		System.out.println("******* COMPTAR CARCATERS - NO VOCALS ********");
		System.out.println("Entra un punt per acabar. Si s'han entrat 3 a's el programa tambe finalitza");
		System.out.println("Entra primer caràcter");
		while(stopper == false){
			entrada = Keyboard.readChar();
			if (entrada == '.') stopper = true;
			else if (entrada == 'a' || entrada == 'A'){
				As++;
				if (As != 3)  System.out.println("Entra altre caràcter");
				else stopper = true;
			}else if (entrada != 'e' && entrada != 'i' && entrada != 'o' && entrada != 'u' && entrada != 'E' && entrada != 'I' && entrada != 'O' && entrada != 'U'){
				System.out.println("Entra altre caràcter");
				vocals++;
			}else System.out.println("Entra altre caràcter");
		}System.out.print("El nombre de caràcters no vocals és de: \n" + vocals);
	}
}

/* PREGUNTES:
		1.- CAL QUE TINGUEM EN COMPTE LES MAJUSCULES? TANT DE LES As COM LA RESTA DE VOCALS.
			I LA RESTA DE CARACTERS QUE NO SON CONSONANTS?
		2.- HI HA CAP PROBLEMA SI NOMES UTILITZO UN BOOLEAN? (EN PODRIA UTILITZAR MES)
*/