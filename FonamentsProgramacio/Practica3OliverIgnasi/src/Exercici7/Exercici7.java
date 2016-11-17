package Exercici7;

import Keyboard.*;
//L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible

public class Exercici7 {
	public static void main (String args[]){
			int numero, fila = 0, asteriscs, asteriscsdreta = 0, comptadorasteriscsdreta, espais;
			int espaisbaixos;
			asteriscs = 1; int asteriscsfinals = asteriscs; 
			System.out.println("Indica l'alcada. ha de ser un valor >1 i senar");
			numero = Keyboard.readInt();
			while (numero % 2 == 0){
				System.out.println("Indica l'alcada. ha de ser un valor >1 i senar");
				numero = Keyboard.readInt();
			}
			espaisbaixos = numero - 1; //espais referents a la part d'abaix. Com que vull que el seu comportament sigui independent a les iteracions, en declaro el seu valor inicial fora del bucle.
			System.out.println("El rombe d'alcada " + numero + " es:");
			while (fila <= numero + 1){
			//si numero = 9, l'estructura tindra 11 files: de la 0 a la 10. Per aixo utilitzo numero + 1
			//el motiu pel qual treballo aixi es perque es mes entenedor treballar amb les files operables de la 1 a la 9,
			//ja que la 0 i la 10 nomes seran asteriscos seguits.
				System.out.print("*");
				if (fila == 0){ // a la primera fila s'imprimeix tot d'asteriscs
					asteriscs = 0;
					while (asteriscs < numero){
						System.out.print("*");
						asteriscs++;
					}
				}else if (fila < numero / 2 + 1){//fins la fila de la meitat
					asteriscs = fila + 1;
					while (asteriscs <= numero / 2 + 1){
						System.out.print("*");
						asteriscs++;
						asteriscsdreta++; //son els asteriscs que imprimire despres dels espais
					}
					espais = 1;
					while (espais <= fila + fila - 1){
						System.out.print(" ");
						espais++;
					}
					//Procedeixo a imprimir els asteriscs de la dreta
					comptadorasteriscsdreta = 1;
					while (comptadorasteriscsdreta <= asteriscsdreta){
						System.out.print("*");
						comptadorasteriscsdreta++;
					}
					//reinicialitzem el valor dels asteriscs de la dreta per la seguent iteracio
					asteriscsdreta = 0;

				}else if (fila == numero / 2 + 1){
					espais = 1;
					while (espais <= numero){
						System.out.print(" ");
						espais++;
					}

				}else if (fila > numero / 2 + 1 && fila != numero + 1){
				// a partir de la fila del mig i fins al final sense comptar la ultima fila
					asteriscs = 1;
					//hae d'augmentar el valor dels asteriscsfinals ja que a cada fila imprimeix mes
					asteriscsfinals++;
					while (asteriscs < asteriscsfinals){
						System.out.print("*");
						asteriscs++;
					}
					//asteriscsfinals++;
					
					espais = 1;
					while (espais < espaisbaixos){
						System.out.print(" ");
						espais++;
					}
					espaisbaixos = espaisbaixos - 2;
					
					//Agafarem els valors dels asteriscsfinals (de la meitat baixa del rombe)
					asteriscsdreta = asteriscsfinals;
					comptadorasteriscsdreta = 1;
					while (comptadorasteriscsdreta < asteriscsdreta){
						System.out.print("*");
						comptadorasteriscsdreta++;
					}
				
				
				}else if (fila == numero + 1){ //la ultima fila
					asteriscs = 0;
					while (asteriscs < numero){
						System.out.print("*");
						asteriscs++;
					}

				}
				System.out.println("*");
				fila++;
			}
		
	}
}
