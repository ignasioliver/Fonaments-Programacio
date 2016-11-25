package Exercici5;

import Keyboard.*;
import Exercici4.*;

public class Exercici5 {
	public static void main (String args[]){
		int any, mes, dia;
		String nomdelmes;
		char confirmacio;
		long data;
		
		do {
			System.out.println("Numerologia\n-----------");
			// Per tal de tenir el programa ben organitzat, cridem les funcions per parts.
			any = Exercici4.lecturaany(1910, 2015);
			mes = Exercici4.lecturames(1, 12);
			dia = Exercici4.lecturadia(mes, any);
			data = any * 10000 + (mes * 100) + dia;
			nomdelmes = donaNom(mes);
			System.out.print("Amb la data " + dia + " de " + nomdelmes + " del " + any + " el teu numero de la sort es el ");
			Exercici4.numeroSort(data);
			//Ara preguntarem a  l'usuari si vol acabar el programa o no.
			//En forma de bucle, per si l'usuari no escriu ni 's' ni 'n'.
			System.out.println();
			do {
				System.out.println("Vols obtenir altre numero de la sort (s/n)?");
				confirmacio = Keyboard.readChar();
			} while (confirmacio != 's' && confirmacio != 'n');
		} while (confirmacio == 's');
	}

	
	private static String donaNom (int mes){
		String nomMes = "";
		//No es necessari l'us d'un default ja que la funcio lecturames(1, 12)
		//ja s'assegura que el mes estigui compres entre 1 i 12.
		switch(mes){
			case 1: nomMes = "Gener"; break;
			case 2: nomMes = "Febrer"; break;
			case 3: nomMes = "Marc"; break;
			case 4: nomMes = "Abril"; break;
			case 5: nomMes = "Maig"; break;
			case 6: nomMes = "Juny"; break;
			case 7: nomMes = "Juliol"; break;
			case 8: nomMes = "Agost"; break;
			case 9: nomMes = "Setembre"; break;
			case 10: nomMes = "Octubre"; break;
			case 11: nomMes = "Novembre"; break;
			case 12: nomMes = "Desembre"; break;
		}return nomMes;
	}
}