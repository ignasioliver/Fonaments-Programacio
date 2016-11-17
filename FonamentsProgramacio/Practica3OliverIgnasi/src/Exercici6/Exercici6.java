package Exercici6;

import Keyboard.*;
//L'esquema detallat usat es troba al codi font en paper per tal que aquest sigui mes comprensible
public class Exercici6 {
	public static void main (String args[]){
		int numero, fila = 1, espais, asteriscs, ultimsespais, valormaximespai, asteriscsbaixos;
		ultimsespais = 1; 
		valormaximespai= ultimsespais + 1; 
		char caracter;
		System.out.println("Indica l'alcada. ha de ser un valor >1 i senar");
		numero = Keyboard.readInt();
		while (numero % 2 == 0){
			System.out.println("Indica l'alcada. ha de ser un valor >1 i senar");
			numero = Keyboard.readInt();
		}
		System.out.println("Indica el caracter a usar. Nomes son possibles '*' '$' '#'");
		caracter = Keyboard.readChar();
		while (caracter != 'a' || caracter != '$' || caracter != '#'){
			System.out.println("Indica el caracter a usar. Nomes son possibles '*' '$' '#'");
			caracter = Keyboard.readChar();
		}
		asteriscsbaixos = numero - 1; //asteriscs referents a la part d'abaix. 
		// Com que vull que el seu comportament sigui independent a les iteracions, en declaro el seu valor inicial fora del bucle.
		System.out.println("El rombe d'alcada " + numero + " es:");
		while (fila <= numero){
			if (fila < numero / 2 + 1){
				espais = fila + 1;
				while (espais <= numero / 2 + 1){
					System.out.print(" ");
					espais++;
				}
				asteriscs = 1;
				while (asteriscs <= fila + fila - 1){
					System.out.print(caracter);
					asteriscs++;
				}
			}else if (fila == numero / 2 + 1){
				asteriscs = 1;
				while (asteriscs <= numero){
					System.out.print(caracter);
					asteriscs++;
				}

			}else if (fila > numero / 2 + 1){
				ultimsespais = 1;
				while (ultimsespais < valormaximespai){
					System.out.print(" ");
					ultimsespais++;
				}
				valormaximespai = ultimsespais + 1;
				
				asteriscs = 1;
				while (asteriscs < asteriscsbaixos){
					System.out.print(caracter);
					asteriscs++;
				}
				asteriscsbaixos = asteriscsbaixos - 2;
				
			}
			
			System.out.println();
			fila++;
		}
	}
}