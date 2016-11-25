package Exercici4;

import Keyboard.*;
import Exercici3.*;

public class Exercici4 {
	public static void main (String args[]){
		int any, mes, dia;
		long data;
		System.out.println("Numerologia");
		// Per tal de tenir el programa ben organitzat, cridem les funcions per parts
		any = lecturaany(1910, 2015);
		mes = lecturames(1, 12);
		dia = lecturadia(mes, any);
		data = any * 10000 + (mes * 100) + dia;
		System.out.print("El teu numero es ");
		numeroSort(data);
	}
	
	public static int lecturaany (int min, int max){
		int any;
		System.out.println("Indica l'any de naixement [" + min + ", " + max + "]");
		any = Keyboard.readInt();
		while (any < min || any > max){
			System.out.println("Any incorrecte. Indica novament l'any de naixament [" + min + ", " + max + "]");
			any = Keyboard.readInt();
		}
		return any;
	}
	
	public static int lecturames (int min, int max){
		int mes;
		System.out.println("Indica el mes de naixement [" + min + ", " + max + "]");
		mes = Keyboard.readInt();
		while (mes < min || mes > max){
			System.out.println("Mes incorrecte. Indica novament el mes de naixament [" + min + ", " + max + "]");
			mes = Keyboard.readInt();
		}
		return mes;
	}
	
	public static boolean bisiesto (int any){
		boolean bolea = false;
		if (any % 4 == 0){
			if (any % 100 != 0) bolea = true; //es de traspas
			else if (any % 100 == 0){
				if (any % 400 == 0) bolea = true;
				else bolea = false;
			}
		}else bolea = false; //false = not traspas	
		return bolea;
	}
	/*
	Podriem tenir un sol parametre a "lecturadia", nomes el mes, i que sigui aquesta
	mateixa funcio la que cridi l'any i el demani, pero seria un embolic ja que si
	nomes es es volgues llegir el dia, tambe es llegiria l'any per defecte. 
	D'aquesta manera no nomes es mante mes organitzat, sino que evitem que dins de la
	funcio es faci una altra crida.
	*/
	public static int lecturadia (int mes, int any){
		int dia, max;
		boolean comprovacio = bisiesto(any);
		System.out.println("Indica el dia de naixement [1, 28] o [1, 29] o [1, 30] o [1, 31] en funcio del mes");
		dia = Keyboard.readInt();
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){//dia maxim;
			max = 31;
		}else if (mes == 2){
			if (comprovacio ==  true) max = 29;
			else max = 28;
		}else max = 30;
		if (comprovacio == true) System.out.println("Es any de traspas");
		while (dia > max){
			System.out.println("Dia incorrecte. Indica novament dia de naixement [1, " + max + "]");
			dia = Keyboard.readInt();
		}
		return dia;
	}
	
	public static void numeroSort (long data){
		int nombretotaldigits, nombresort = 0, dataint, posiciodigit;
		dataint = (int) data;
		nombretotaldigits = Exercici3.numDigits(dataint);
		for (posiciodigit = nombretotaldigits; posiciodigit >= 0; posiciodigit--){
			//He igualat posiciodigit per fer-ho mes clar i per l'if que vindra
			nombresort = nombresort + Exercici3.digit(dataint, posiciodigit);
			/*
			Es possible que aqui "nombresort" tingui dos digits, per tant els separem.
			Sabem tambe que no en pot tenir mes de 2, i que la suma dels 2 digits per separat
			mai sera major a 9, de manera que no cal que cridem cap funcio, fem l'operacio
			directament per estalviar-nos temps d'execucio.
			*/
			if (nombresort > 9){
			nombresort = nombresort/10 + nombresort%10;
			}
		}
		System.out.println(nombresort);
	}
}