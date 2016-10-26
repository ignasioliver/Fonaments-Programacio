package Exercici5;

import Keyboard.*;

public class Exercici5 {
	public static void main (String args[]){
		double m, l, imc;
		System.out.println("Classificació de l'IMC\n------------- -- - ---");
		System.out.println("Quin és el teu pes (en kg.)?");
		m = Keyboard.readDouble();
		System.out.println("Quina és la teva alcada (en m.)?");
		l = Keyboard.readDouble();
		imc = m / Math.pow(l, 2);
		System.out.println("\nEl teu IMC és: " + imc);
		if (imc > 17 && imc < 18) System.out.println("això indica INFRAPÈS MODERAT");
		else if (imc > 16 && imc < 17) System.out.println("això indica INFRAPÈS CONSIDERABLE");
		else if (imc < 16) System.out.println("això indica INFRAPÈS SEVER");
		else if (imc > 18 && imc < 25) System.out.println("això vol dir que és NORMAL");	
		else if (imc > 25 && imc < 30) System.out.println("això indica OBESITAT LLEU");
		else if (imc > 30 && imc < 35) System.out.println("això indica OBESITAT MODERADA");
		else if (imc > 35 && imc < 40) System.out.println("això indica OBESITAT PREMORBIDA");
		else if (imc > 40) System.out.println("això indica OBESITAT MORBIDA");
	}
}