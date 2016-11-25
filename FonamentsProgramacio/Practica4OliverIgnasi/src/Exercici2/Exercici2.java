package Exercici2;

//no cal importar el Keyboard.*;
import Exercici1.*; //pero si que importem cadira i tamburet

public class Exercici2 {
	public static void main (String args[]){
		/*
		L'avantatge de declarar min i no usar (15) directament es que permet 
		l'implementacio directa del for. A mes, si es volgues, canviar els valors
		del maxim i el minim seria molt mes senzill i intuitiu 
		*/
		int min, ncadires = 0;
		for (min = 15; min <= 100; min++){
			if (min % 3 == 0 && min % 2 != 0){
				System.out.println("Cadira de mida: " + min + "\n==================");
				Exercici1.cadira(min);
				ncadires++;
			} 
		}System.out.print("S'han dibuixat un nombre total de " + ncadires + " cadires.");
	}
}