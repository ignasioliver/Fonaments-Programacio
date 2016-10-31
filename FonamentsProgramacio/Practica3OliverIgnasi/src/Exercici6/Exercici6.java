package Exercici6;

import Keyboard.*;

public class Exercici6 {
	public static void main (String args[]){
		int N, i = 0, j = 0, filamig = 0;
		System.out.println("Introdueix N");
		N = Keyboard.readInt();
		while (i < N){ // 5 vegades
			while (j < N){ //Per cada de les 5 vegades de i, j ho fara les vegades que sigui necessari:
				//System.out.println("0");
				System.out.println("0");
				while (j == N / 2 - 1){ //aqui esta exactament al mig
					while (filamig < N){
						System.out.print("*");
						filamig++;
					}
					System.out.println();
					j++;
				}
				j++;
				
			}
			i++;
		}
		
	}
}

/*
Print when:
	i = N/2 + 1;
	j = N/2 + 1;
	


*/







/*
NOT WORKING
public class Exercici6 {
	public static void main (String args[]){
		int N, i = 0, j = 0, filamig = 0;
		System.out.println("Introdueix N");
		N = Keyboard.readInt();
		while (i < N){
			while ( j < N){
				//if (i == N / 2 - 1) System.out.print("0");
				System.out.println("0");
				while (filamig < N){// imprimim fila del mig
					if (j == N / 2 - 1) System.out.print("0");
					filamig++;
				}
				//if (i == N / 2 + 1 && j == N / 2 + 1) System.out.println("*");
				j++;
			}
			i++;
		}
		
	}
}
*
*
*
*
*
*
*
*
*
*
*
*
*
*PRETTY GOOD
*
*package Exercici6;

import Keyboard.*;

public class Exercici6 {
	public static void main (String args[]){
		int N, i = 0, j = 0, filamig = 0;
		System.out.println("Introdueix N");
		N = Keyboard.readInt();
		while (i < N){ // 5 vegades
			while (j < N){ //Per cada de les 5 vegades de i, j ho fara les vegades que sigui necessari:
				//System.out.println("0");
				System.out.println("0");
				while (i == N / 2 ){
					System.out.println("X");
					i++;
				}
			j++;	
			}
			i++;
		}
		
	}
}
*
*
*
*
*
*/