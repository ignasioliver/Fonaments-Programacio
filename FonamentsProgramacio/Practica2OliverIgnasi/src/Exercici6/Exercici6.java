package Exercici6;

//import java.lang.*; NO CAL

public class Exercici6 {
	public static void main (String args[]){

		double m, l, imc, l_min = 0.4, l_max = 2.5, m_min = 3.0, m_max = 234.0;
		
		m_max = m_max + 0.01; //COMPROVAR AIXO!!!
		l_max = l_max + 0.01; //COMPROVAR AIXO!!!
		
		m = Math.rint((Math.random()* (m_max - m_min) + m_min ) * 100.0) / 100.0;
		l = Math.rint((Math.random()* (l_max - l_min) + l_min ) * 100.0) / 100.0;

		System.out.println();
		System.out.println("El pes generat aleatoriament ha estat [3, 234]: " + m);
		System.out.println("L'alcada generada aleatoriament ha estat [0.4, 2.5]: " + l);
		System.out.println();
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