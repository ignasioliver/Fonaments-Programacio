package Exercici3;

import Keyboard.*;

public class Exercici3 {
	public static void main (String args[]){
		int  n, numero, quinDigit = 0, suma = 0, resultatnumDigits;
		System.out.println("Indica el numero del que vols saber la suma dels seus digits: ");
		numero = Keyboard.readInt();
		//amb resultatnumDigits evitem que per cada iteracio es cridi la funcio numDigits
		resultatnumDigits = numDigits(numero);
		for (n = 0; n < resultatnumDigits; n++){
			suma = suma + (digit(numero, quinDigit));
			quinDigit++;
		}System.out.println("La suma dels digits es: " + suma);
	}
	
	public static int numDigits (int numero){
		int digits;
		for (digits = 0; numero > 0; digits++) numero = numero / 10;
		return digits;	
	}
	
	public static int digit (int numero, int quinDigit){
		int comptador;
		for (comptador = 1; comptador <= quinDigit; comptador++){
			numero = numero / 10;
		}numero = numero % 10;
		return numero;		
	}	
}