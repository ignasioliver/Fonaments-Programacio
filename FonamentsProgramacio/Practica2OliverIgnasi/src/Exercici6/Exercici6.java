package Exercici6;

public class Exercici6 {
	public static void main (String args[]){
		double m, l, imc, l_min = 0.4, l_max = 2.5, m_min = 3.0, m_max = 234.0;
		m = Math.rint((Math.random()* (m_max - m_min) + m_min ) * 100.0) / 100.0;
		l = Math.rint((Math.random()* (l_max - l_min) + l_min ) * 100.0) / 100.0;
		System.out.println("\nEl pes generat aleatoriament ha estat [3, 234]: " + m);
		System.out.println("L'alçada generada aleatoriament ha estat [0.4, 2.5]: " + l);
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