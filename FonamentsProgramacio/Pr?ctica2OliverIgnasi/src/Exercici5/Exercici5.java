package Exercici5;

import Keyboard.*;

public class Exercici5 {
	public static void main (String args[]){
		double m, l, imc;
		System.out.println("Classificacio de l'IMC");
		System.out.println("------------- -- - ---");
		System.out.println("Quin es el teu pes (en kg.)?");
		m = Keyboard.readDouble();
		System.out.println("Quina es la teva alcada (en m.)?");
		l = Keyboard.readDouble();
		imc = m / Math.pow(l, 2);
		System.out.println("El teu IMC es: " + imc);
		if (imc > 17 && imc < 18){
			System.out.println("aixo indica INFRAPES MODERAT");
		}else if (imc > 16 && imc < 17){
			System.out.println("aixo indica INFRAPES CONSIDERABLE");
		}else if (imc < 16){
			System.out.println("aixo indica INFRAPES SEVER");
		}else if (imc > 18 && imc < 25){
			System.out.println("aixo vol dir que es NORMAL");	
		}else if (imc > 25 && imc < 30){
			System.out.println("aixo indica OBESITAT LLEU");
		}else if (imc > 30 && imc < 35){
			System.out.println("aixo indica OBESITAT MODERADA");
		}else if (imc > 35 && imc < 40){
			System.out.println("aixo indica OBESITAT PREMORBIDA");
		}else if (imc > 40){
			System.out.println("aixo indica OBESITAT MORBIDA");
		}
	}
}
