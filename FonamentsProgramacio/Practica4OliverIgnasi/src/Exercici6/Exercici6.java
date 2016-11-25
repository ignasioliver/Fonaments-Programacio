package Exercici6;

import Keyboard.*;

public class Exercici6 {
	public static void main (String args[]){
		int alcada, pisos, inicial, nTotxos, nTotxosInicials;
		char caracter;
		alcada = alcada();
		caracter = caracter();
		pisos = pisos();
		piramideInversa(alcada, pisos, caracter);
		//Ara hem d'imprimir el nombre de totxos
		nTotxos = 0;
		//a la 1a fila sempre es tindra el seguent n. de totxos:
		nTotxosInicials = pisos * (alcada + 1) - 1;
		for (nTotxos = 0; pisos >= 1; pisos--){
			inicial = 1;
			while (inicial < nTotxosInicials) inicial++;
			nTotxosInicials = nTotxosInicials - alcada+1;
			nTotxos = nTotxos + inicial;
		} System.out.print("\nEl numero de totxos usats es: " + nTotxos);
	}
	
	private static char caracter() {
		System.out.println("Especifica tipus de toxto a usar en la contruccio");
		char caracter = Keyboard.readChar();
		return caracter;
	}
	
	private static int pisos() {
		System.out.println("Indica el numero de pisos, valor senar dintre de l'interval (0,80)");
		int pisos = Keyboard.readInt();
		while (pisos <= 0 || pisos >= 80 || pisos % 2 == 0) {
			System.out.println("Indica el numero de pisos, valor senar dins de l'interval (0, 80)");
			pisos = Keyboard.readInt();
		}return pisos;
	}
	
	private static int alcada() {
		System.out.println("Indica l'alcada dels pisos, valor senar major a 0");
		int alcada = Keyboard.readInt();
		while (alcada <= 0 || alcada % 2 == 0) {
			System.out.println("Indica l'alcada dels pisos, valor senar major a 0");
			alcada = Keyboard.readInt();
		}return alcada;
	}

	public static void piramideInversa(int nPisos, int altura, char valor) {
		int x, y, a, b;
		x = 0;
		y = altura * 2;
		for (x = 0; x < altura; x++){
			for (b = 0; b < nPisos; System.out.println()){
				for (a = 1; a <= x; a ++){
					System.out.print(" ");
				}a = 1;
				for (a = 1; a <= y - 1; a ++){
					System.out.print(valor);
				}b++;
			}y = y - 2;
		}
	}
}