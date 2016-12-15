package Exercici1;

import Keyboard.*;

public class Exercici1 {
	public static void main (String args[]){

		//Declarem i emplenem les dades, preguntes i respostes: (es podria colocar 19 com a variable
		String preguntes[], RespostaCorrecta[], RespostaIncorrecta1[], RespostaIncorrecta2[];
		preguntes = new String[20];
		RespostaCorrecta = new String[20];
		RespostaIncorrecta1 = new String[20];
		RespostaIncorrecta2 = new String[20];
		
		//Per comencar, cridem a omplena per que ens ompli les taules.
		int quina, quantes, numeracioCorrecta, sortides[], respostausuari;
		quantes = 0;
		sortides = new int [5];
		
		//omplenem totes les preguntes i respostes
		omplena (preguntes, RespostaCorrecta, RespostaIncorrecta1, RespostaIncorrecta2);
		
		
		int nombrepartides, preguntesencertades = 0; double percentatgecorrecte; char continua, veupreguntes; boolean fidejoc = false;
		for (nombrepartides = 1; nombrepartides <= 12 && fidejoc == false; nombrepartides++){
			preguntesencertades = 0;
			for (quantes = 0; quantes < 5; quantes++){
			
			
			//loop, cada pregunta individualment passara:
				
			//escollim aleatoriament un index de la pregunta (entre les 20)
				quina = quina();
				
				//si la pregunta ja ha aparegut (es a dir, que es troba a dins del vector sortides[5]), genera
				//una altra aleatoria. Aixi fins que generi una que no hagi aparegut
				//ES PODRIA FER DO WHILE!
				while (repetida(sortides, quantes, quina) == true){
					quina = quina();
				}
				sortides[quantes] = afegir(sortides, quantes, quina);
				
				//obtenim on es troba la resposta correcta alhora que mostrem la pregunta i les respostes, de manera aleatoria
				numeracioCorrecta = mostra(preguntes, RespostaCorrecta, RespostaIncorrecta1, RespostaIncorrecta2, quina);
				System.out.println("Indica la resposta correcta 1 o 2 o 3:");
				respostausuari = Keyboard.readInt();
				if (respostausuari == numeracioCorrecta){
					System.out.println("Encertat");
					preguntesencertades++;
				}else System.out.println("NO encertat");
				System.out.println(sortides[quantes]);
				
			}//finalloop;
				//System.out.println(sortides[quina]);
			
				// TESTER:
					// el nombre que ha de sortir es la pregunta -1, 
					// ja que la taula comenca amb index 0 i el text de la pregunta en 1
				System.out.println("Ara del 0 al 20 (sortides)");
				System.out.println(sortides[0]);
				System.out.println(sortides[1]);
				System.out.println(sortides[2]);
				System.out.println(sortides[3]);
				System.out.println(sortides[4]);
				// TESTER ENDED
		}

		percentatgecorrecte = preguntesencertades / 5 * 100; 
		System.out.println("FI JOC: has tingut un percentatge d'encert de " + percentatgecorrecte);
		System.out.println("***************************************************");
		System.out.println("Vols jugar altre partida?");
		continua = Keyboard.readChar();
		if (continua == 's' || continua == 'S'){
			if (percentatgecorrecte < 20){
				System.out.println("Vols veure totes les preguntes? (s/n)");
				veupreguntes = Keyboard.readChar();
				if (veupreguntes == 's' || veupreguntes == 'S'){
					totesCorrectes (preguntes, RespostaCorrecta);
				}

			}
		}
		else fidejoc = true;
		
	}
	
	
	//FUNCIO OBLIGATORIA
	private static void omplena (String preguntes[], String RespostaCorrecta[], String RespostaIncorrecta1[], String RespostaIncorrecta2[]){
		
		//Ara declarare el valor de cada pregunta i la seva resposta correcta
		//Primer escriure les preguntes
		preguntes[0] = "Pregunta numero 1";
		preguntes[1] = "Pregutna numero 2";
		preguntes[2] = "Pregunta numero 3";
		preguntes[3] = "Pregunta numero 4";
		preguntes[4] = "Pregunta numero 5";
		preguntes[5] = "Pregutna numero 6";
		preguntes[6] = "Pregunta numero 7";
		preguntes[7] = "Pregunta numero 8";
		preguntes[8] = "Pregunta numero 9";
		preguntes[9] = "Pregutna numero 10";
		preguntes[10] = "Pregunta numero 11";
		preguntes[11] = "Pregunta numero 12";
		preguntes[12] = "Pregunta numero 13";
		preguntes[13] = "Pregutna numero 14";
		preguntes[14] = "Pregunta numero 15";
		preguntes[15] = "Pregunta numero 16";
		preguntes[16] = "Pregunta numero 17";
		preguntes[17] = "Pregutna numero 18";
		preguntes[18] = "Pregunta numero 19";
		preguntes[19] = "Pregunta numero 20";
		
		//Ara escriure les RespostaCorrecta
		
		RespostaCorrecta[0] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 1";
		RespostaCorrecta[1] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 2";
		RespostaCorrecta[2] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 3";
		RespostaCorrecta[3] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 4";
		RespostaCorrecta[4] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 5";
		RespostaCorrecta[5] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 6";
		RespostaCorrecta[6] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 7";
		RespostaCorrecta[7] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 8";
		RespostaCorrecta[8] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 9";
		RespostaCorrecta[9] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 10";
		RespostaCorrecta[10] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 11";
		RespostaCorrecta[11] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 12";
		RespostaCorrecta[12] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 13";
		RespostaCorrecta[13] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 14";
		RespostaCorrecta[14] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 15";
		RespostaCorrecta[15] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 16";
		RespostaCorrecta[16] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 17";
		RespostaCorrecta[17] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 18";
		RespostaCorrecta[18] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 19";
		RespostaCorrecta[19] = "RESPOSTA CORRECTA A A PREGUNTA NUMERO 20";
		
		//Ara escriure les RespostaIncorrecta1
		
		RespostaIncorrecta1[0] = "Resposta Incorrecte 1 de la pregunta numero 1";
		RespostaIncorrecta1[1] = "Resposta Incorrecte 1 de la pregunta numero 2";
		RespostaIncorrecta1[2] = "Resposta Incorrecte 1 de la pregunta numero 3";
		RespostaIncorrecta1[3] = "Resposta Incorrecte 1 de la pregunta numero 4";
		RespostaIncorrecta1[4] = "Resposta Incorrecte 1 de la pregunta numero 5";
		RespostaIncorrecta1[5] = "Resposta Incorrecte 1 de la pregunta numero 6";
		RespostaIncorrecta1[6] = "Resposta Incorrecte 1 de la pregunta numero 7";
		RespostaIncorrecta1[7] = "Resposta Incorrecte 1 de la pregunta numero 8";
		RespostaIncorrecta1[8] = "Resposta Incorrecte 1 de la pregunta numero 9";
		RespostaIncorrecta1[9] = "Resposta Incorrecte 1 de la pregunta numero 10";
		RespostaIncorrecta1[10] = "Resposta Incorrecte 1 de la pregunta numero 11";
		RespostaIncorrecta1[11] = "Resposta Incorrecte 1 de la pregunta numero 12";
		RespostaIncorrecta1[12] = "Resposta Incorrecte 1 de la pregunta numero 13";
		RespostaIncorrecta1[13] = "Resposta Incorrecte 1 de la pregunta numero 14";
		RespostaIncorrecta1[14] = "Resposta Incorrecte 1 de la pregunta numero 15";
		RespostaIncorrecta1[15] = "Resposta Incorrecte 1 de la pregunta numero 16";
		RespostaIncorrecta1[16] = "Resposta Incorrecte 1 de la pregunta numero 17";
		RespostaIncorrecta1[17] = "Resposta Incorrecte 1 de la pregunta numero 18";
		RespostaIncorrecta1[18] = "Resposta Incorrecte 1 de la pregunta numero 19";
		RespostaIncorrecta1[19] = "Resposta Incorrecte 1 de la pregunta numero 20";
		
		//Ara escriure les RespostaIncorrecta2
		
		RespostaIncorrecta2[0] = "Resposta Incorrecte 2 de la pregunta numero 1";
		RespostaIncorrecta2[1] = "Resposta Incorrecte 2 de la pregunta numero 2";
		RespostaIncorrecta2[2]= "Resposta Incorrecte 2 de la pregunta numero 3";
		RespostaIncorrecta2[3] = "Resposta Incorrecte 2 de la pregunta numero 4";
		RespostaIncorrecta2[4] = "Resposta Incorrecte 2 de la pregunta numero 5";
		RespostaIncorrecta2[5] = "Resposta Incorrecte 2 de la pregunta numero 6";
		RespostaIncorrecta2[6] = "Resposta Incorrecte 2 de la pregunta numero 7";
		RespostaIncorrecta2[7] = "Resposta Incorrecte 2 de la pregunta numero 8";
		RespostaIncorrecta2[8] = "Resposta Incorrecte 2 de la pregunta numero 9";
		RespostaIncorrecta2[9] = "Resposta Incorrecte 2 de la pregunta numero 10";
		RespostaIncorrecta2[10] = "Resposta Incorrecte 2 de la pregunta numero 11";
		RespostaIncorrecta2[11] = "Resposta Incorrecte 2 de la pregunta numero 12";
		RespostaIncorrecta2[12] = "Resposta Incorrecte 2 de la pregunta numero 13";
		RespostaIncorrecta2[13] = "Resposta Incorrecte 2 de la pregunta numero 14";
		RespostaIncorrecta2[14] = "Resposta Incorrecte 2 de la pregunta numero 15";
		RespostaIncorrecta2[15] = "Resposta Incorrecte 2 de la pregunta numero 16";
		RespostaIncorrecta2[16] = "Resposta Incorrecte 2 de la pregunta numero 17";
		RespostaIncorrecta2[17] = "Resposta Incorrecte 2 de la pregunta numero 18";
		RespostaIncorrecta2[18] = "Resposta Incorrecte 2 de la pregunta numero 19";
		RespostaIncorrecta2[19] = "Resposta Incorrecte 2 de la pregunta numero 20";
	}
	
	//FUNCIO NO OBLIGATORIA
	public static int quina (){
		int quina;
		quina = (int) Math.round(Math.random() * 19 + 1);
		return quina;
	}
	
	//es podria fer una funcio "aleatoria" que generes el nombre aleatori donat els parametres (en aquest cas 19 i 1)
	// aixo permetria no haver de fer la funcio "aleatori", amb una ja valdria, pero suda

	public static int aleatori(){ //funcio utilitzada per generar l'ordre de sortida de mostra
		int nombrealeatori;
		nombrealeatori = (int) Math.round(Math.random() * 2 + 1);
		return nombrealeatori;
	}
	
	//FUNCIO OBLIGATORIA
	private static int mostra (String preguntes[], String RespostaCorrecta[], String RespostaIncorrecta1[], String RespostaIncorrecta2[], int quina){
		int ordre, numeracioCorrecta = 0;
		ordre = aleatori();
		System.out.println(preguntes[quina]);
		switch (ordre){
			case 1: System.out.println(RespostaCorrecta[quina] + "\n" + RespostaIncorrecta1[quina] + "\n" + RespostaIncorrecta2[quina]);
					numeracioCorrecta = 1;
				break;
			case 2: System.out.println(RespostaCorrecta[quina] + "\n" + RespostaIncorrecta2[quina] + "\n" + RespostaIncorrecta1[quina]);
					numeracioCorrecta = 1;
				break;
			case 3: System.out.println(RespostaIncorrecta1[quina] + "\n" + RespostaCorrecta[quina] + "\n" + RespostaIncorrecta2[quina]);
					numeracioCorrecta = 2;
				break;
			case 4: System.out.println(RespostaIncorrecta1[quina] + "\n" + RespostaIncorrecta2[quina] + "\n" + RespostaCorrecta[quina]);
					numeracioCorrecta = 3;
				break;
			case 5: System.out.println(RespostaIncorrecta2[quina] + "\n" + RespostaIncorrecta1[quina] + "\n" + RespostaCorrecta[quina]);
					numeracioCorrecta = 3;
				break;
			case 6: System.out.println(RespostaIncorrecta2[quina] + "\n" + RespostaCorrecta[quina] + "\n" + RespostaIncorrecta1[quina]);
					numeracioCorrecta = 2;
				break;
		}return numeracioCorrecta;
	}
	
	//FUNCIO OBLIGATORIA
	private static boolean repetida (int sortides[], int quantes, int quina){
		//Crearem un vector que guardi tots els numeros de les preguntes que ja han sortit.
		//El tamany d'aquest vector sera del valor quantes
		int posiciosortida;
		boolean hasortit = false;
		for (posiciosortida = 0; posiciosortida <= /*cal el "="?*/quantes; posiciosortida++){
			if (sortides[posiciosortida] == quina) hasortit = true;
		}return hasortit;
	}
	
	//FUNCIO OBLIGATORIA
	private static int afegir(int sortides[], int quantes, int quina){
		sortides[quantes] = quina;
		return quina;
	}
	
	//FUNCIO OBLIGATORIA (la fare al final) 
	
	private static void totesCorrectes (String preguntes[], String RespostaCorrecta[]){
		/* 
		crido alguna altra funcio o faig una de 0?
		*/
	}
}
	