package Exercici4;

import Keyboard.*;

public class Exercici4 {
	public static void main (String args[]){
		int any, mes, dia;
		System.out.println("Especifica l'any en que vas neixer en format 4 xifres");
		any = Keyboard.readInt();
		while (any > 2016){
			System.out.println("Siusplau introdueix un any valid");
			any = Keyboard.readInt();
		}
		System.out.println("Especifica el mes en que vas neixer [1, 12]");
		mes = Keyboard.readInt();
		while (mes < 1 || mes > 12){
			System.out.println("Siusplau introdueix un mes valid [1, 12]");
			mes = Keyboard.readInt();

		}
		System.out.println("Especifica el dia en que vas neixer [1, 31]");
		dia = Keyboard.readInt();
		while (dia < 1 || dia > 31){
			System.out.println("Siusplau introdueix un dia valid [1, 31]");
			dia = Keyboard.readInt();

		}

	}
}
// PREGUNTA: PUC UTILITZAR UN ALTRE WHILE PER FORMALITZAR ELS CASOS D'ERROR?