package Exercici2;

//import Keyboard.*;
import Exercici1.*; //importem cadira i tamburet

//es podria cridar a la funcio tamboret creant:
//tamboret obj = new Exercici1.tamboret;

public class Exercici2 {
	public static void main (String args[]){
		//L'avantatge de declarar min (15) es que permet l'implementacio directa del for
		int min, ncadires = 0;
		for (min = 15; min <= 100; min++){ //l'increment podria ser min = min + 2, ho fico aixi?
			if (min % 3 == 0 && min % 2 != 0){
				System.out.println("Cadira de mida: " + min + "\n==================");
				Exercici1.cadira(min);
				ncadires++;
			} 
		}System.out.print("S'han dibuixat un nombre total de " + ncadires + " cadires.");
		//Exercici1.tamboret(4);
	}
}