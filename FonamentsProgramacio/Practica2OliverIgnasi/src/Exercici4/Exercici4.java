package Exercici4;

import Keyboard.*;

public class Exercici4 {
	public static void main (String args[]){
		double m, l, imc;
		System.out.println("Classificació de l'IMC\n------------- -- - ---");
		System.out.println("Quin és el teu pes (en kg.)?");
		m = Keyboard.readDouble();
		System.out.println("Quina és la teva alçada (en m.)?");
		l = Keyboard.readDouble();
		imc = m / Math.pow(l, 2);
		System.out.println("\nEl teu IMC és: " + imc);
		if (imc < 18){
			System.out.println("això indica INFRAPÈS");
		}else if (imc > 18 && imc < 25){
			System.out.println("això vol dir que és NORMAL");
		}else if (imc > 25){
			System.out.println("això indica OBESITAT");
		}
	}
}
