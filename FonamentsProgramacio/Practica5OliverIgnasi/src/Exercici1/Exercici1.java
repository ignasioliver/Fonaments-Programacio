package Exercici1;

import Keyboard.*;

public class Exercici1{
		public static void main (String args[]){
			int i = 0, nRespostesEncertades, quina, opcio = 0, correcte; //variables contadores
			char resposta,veureRespostes;
			double percentatge;
			
			//Creem les taules
			String preguntes[] = new String [20];
			String RespostaCorrecta[] = new String[20];
			String RespostaIncorrecta1[] = new String[20];
			String RespostaIncorrecta2[] = new String [20];
			
			//Creem la taula sortides on hi haura els index de les preguntes que ja han sortit
			int sortides[] = new int[5];
			
			//Omplenem les taules
			omplena(preguntes,RespostaCorrecta,RespostaIncorrecta1,RespostaIncorrecta2);
			
			do{
				System.out.println("JUGUEM!!!!");
				System.out.println("**********");
				nRespostesEncertades=0;
					for(i = 0; i < 5; i++){

						//Generem un nombre aleatori de l'index: del 0 al 19
						do quina = aleatori(0, 19);
						while(repetida(sortides, i, quina));
						correcte = mostra(preguntes, RespostaCorrecta, RespostaIncorrecta1, RespostaIncorrecta2, quina);
						afegir(sortides, i, quina);
						System.out.println("Indica la resposta correcta 1 ó 2 ó 3");
						
						//Per evitar que el s'aturi si l'usuari introdueix una tecla erronea, nomes proseguirem si l'opcio existeix
						opcio = Keyboard.readInt();
						while (opcio != 1 && opcio != 2 && opcio != 3) opcio = Keyboard.readInt();
						if(opcio == correcte){
							System.out.println("Encertat");
							nRespostesEncertades++;
						}else System.out.println("NO encertat");	
					}
				percentatge = (nRespostesEncertades / 5.0) * 100;
				System.out.println("FI JOC: has tingut un percentatge d'encert de " + percentatge + "%");
				System.out.println("****************************************************");
				System.out.println("Vols jugar altre partida? (s/n)");
				resposta = Keyboard.readChar();
				while (resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') resposta = Keyboard.readChar();
				if((resposta == 's' || resposta == 'S') && percentatge < 20){
					System.out.println("Vols veure totes les preguntes? (s/n)");
					veureRespostes = Keyboard.readChar();
					while (veureRespostes != 's' && veureRespostes != 'S' && veureRespostes != 'n' && veureRespostes != 'N') resposta = Keyboard.readChar();
					if(veureRespostes == 's' || veureRespostes == 'S') totesCorrectes(preguntes,RespostaCorrecta);
				}
			}while((resposta == 's' || resposta == 'S') && i < 12);
		}
		
	private static void omplena(String []preguntes,String []RespostaCorrecta,String [] RespostaIncorrecta1,String[] RespostaIncorrecta2){
			
			//Omplena les preguntes i respostes
			preguntes[0] = "Quin es el nom de la xarxa d'ordinadors des de la qual es va originar Internet?";
			preguntes[1] = "A quin any va neixer el cercador de Google?";
			preguntes[2] = "Qui es el Director Executiu de SpaceX?";
			preguntes[3] = "Qui es el Director Executiu de Tesla Motors?";
			preguntes[4] = "Qui es el President (Chairman) de SolarCity?";
			preguntes[5] = "Qui fou el fundador de Oracle Corporation";
			preguntes[6] = "Qui fou el fundador de Amazon, Inc.?";
			preguntes[7] = "Qui fou el fundador de Quora, Inc.";
			preguntes[8] = "El primer model de cotxe Tesla va ser el...";
			preguntes[9] = "El mes rapid que el cotxe Tesla Model S arriba als 100km/h es en...";
			preguntes[10] = "OpenAI es una empresa...";
			preguntes[11] = "Deep Learning es un sinonim modern de les aplicacions de les...";
			preguntes[12] = "Es poden crear xarxes neuronals simples en Python?";
			preguntes[13] = "Verse es una aplicacio...";
			preguntes[14] = "L'AI (Inteligencia Artificial) es divideix en...";
			preguntes[15] = "Els tipus de coneixement que podem obtenir gracies al Machine Learning son...";
			preguntes[16] = "NO es una aplicacio del Machine Learning...";
			preguntes[17] = "Elon Musk disposa d'un patrimoni aproximat de...";
			preguntes[18] = "Halcyon Molecular es una empresa de...";
			preguntes[19] = "Elon Musk viu a...";
			
			RespostaCorrecta[0] = "Arpanet";
			RespostaCorrecta[1] = "1998";
			RespostaCorrecta[2] = "Elon Musk";
			RespostaCorrecta[3] = "Elon Musk";
			RespostaCorrecta[4] = "Elon Musk";
			RespostaCorrecta[5] = "Lawrence J. Ellison";
			RespostaCorrecta[6] = "Jeff Bezos";
			RespostaCorrecta[7] = "Adam d'Angelo";
			RespostaCorrecta[8] = "Roadster";
			RespostaCorrecta[9] = "2.7 segons";
			RespostaCorrecta[10] = "Sense anim de lucre";
			RespostaCorrecta[11] = "Xarxes neuronals";
			RespostaCorrecta[12] = "Si";
			RespostaCorrecta[13] = "De pagaments per mobil";
			RespostaCorrecta[14] = "2 escoles de pensament: AI convencional i AI computacional";
			RespostaCorrecta[15] = "Creixement, reestructuracio i ajustament";
			RespostaCorrecta[16] = "Les calculadores cientifiques";
			RespostaCorrecta[17] = "$ 13.500.000.000";
			RespostaCorrecta[18] = "Biotecnologia";
			RespostaCorrecta[19] = "Bel-Air, California";
			
			RespostaIncorrecta1[0] = "Meritasium";
			RespostaIncorrecta1[1] = "1899";
			RespostaIncorrecta1[2] = "Peter Thiel";
			RespostaIncorrecta1[3] = "Richard Brandson";
			RespostaIncorrecta1[4] = "Warren Buffet";
			RespostaIncorrecta1[5] = "Charles G. Koch";
			RespostaIncorrecta1[6] = "Elon Musk";
			RespostaIncorrecta1[7] = "Mark Zuckerberg";
			RespostaIncorrecta1[8] = "Model S";
			RespostaIncorrecta1[9] = "5.75 segons";
			RespostaIncorrecta1[10] = "Basada a Miami";
			RespostaIncorrecta1[11] = "Xarxes d'Internet";
			RespostaIncorrecta1[12] = "No";
			RespostaIncorrecta1[13] = "Que permet organitzar els deures de l'universitat";
			RespostaIncorrecta1[14] = "No contempla cap divisio";
			RespostaIncorrecta1[15] = "Creixement, orientacio i capacitacio";
			RespostaIncorrecta1[16] = "La classificacio de sequencies d'ADN";
			RespostaIncorrecta1[17] = "$ 20.000.000";
			RespostaIncorrecta1[18] = "Aeronautica";
			RespostaIncorrecta1[19] = "Las Vegas, Nevada";
			
			RespostaIncorrecta2[0] = "ComptNet";
			RespostaIncorrecta2[1] = "1994";
			RespostaIncorrecta2[2]= "Jeff Bezos";
			RespostaIncorrecta2[3] = "Max Levchin";
			RespostaIncorrecta2[4] = "Martin Eberhad";
			RespostaIncorrecta2[5] = "Adam d'Angelo";
			RespostaIncorrecta2[6] = "Bob Miner";
			RespostaIncorrecta2[7] = "Mark Cuban";
			RespostaIncorrecta2[8] = "Model 3";
			RespostaIncorrecta2[9] = "4.98 segons";
			RespostaIncorrecta2[10] = "Propietat de la NASA";
			RespostaIncorrecta2[11] = "Conjunt de dispositiu d'IoT";
			RespostaIncorrecta2[12] = "Ni en Phyton ni en cap altre llenguatge";
			RespostaIncorrecta2[13] = "Basada en jocs interactius";
			RespostaIncorrecta2[14] = "Unicament en la AI computacional";
			RespostaIncorrecta2[15] = "Composicio analitica i ajustament";
			RespostaIncorrecta2[16] = "El reconeixement de veu";
			RespostaIncorrecta2[17] = "$ 800.000";
			RespostaIncorrecta2[18] = "Desenvolupament d'interficies de software";
			RespostaIncorrecta2[19] = "Chicago, Illinois";	
		}
		
	private static int mostra(String []preguntes,String []RespostaCorrecta,String [] RespostaIncorrecta1,String[] RespostaIncorrecta2,int quina){
			int correcte = 0;
			System.out.println("PREGUNTA: " + preguntes[quina]);
			int opcio= aleatori(1, 6);
			switch(opcio){
				case 1:
					System.out.println("Resposta 1: " + RespostaCorrecta[quina]);
					System.out.println("Resposta 2: " + RespostaIncorrecta1[quina]); 
					System.out.println("Resposta 3: " + RespostaIncorrecta2[quina]);
					correcte = 1;
				break;
				case 2:
					System.out.println("Resposta 1: " + RespostaCorrecta[quina]); 
					System.out.println("Resposta 2: " + RespostaIncorrecta2[quina]);
					System.out.println("Resposta 3: " + RespostaIncorrecta1[quina]);
					correcte = 1;
				break;
				case 3:
					System.out.println("Resposta 1: " + RespostaIncorrecta1[quina]);
					System.out.println("Resposta 2: " + RespostaCorrecta[quina]);
					System.out.println("Resposta 3: " + RespostaIncorrecta2[quina]);
					correcte = 2;
				break;
				case 4:
					System.out.println("Resposta 1: " + RespostaIncorrecta2[quina]);
					System.out.println("Resposta 2: " + RespostaCorrecta[quina]);
					System.out.println("Resposta 3: " + RespostaIncorrecta1[quina]);
					correcte = 2;	
				break;
				case 5:
					System.out.println("Resposta 1: " + RespostaIncorrecta1[quina]);
					System.out.println("Resposta 2: " + RespostaIncorrecta2[quina]); 
					System.out.println("Resposta 3: " + RespostaCorrecta[quina]);
					correcte = 3;
				break;
				case 6: 
					System.out.println("Resposta 1: " + RespostaIncorrecta2[quina]);
					System.out.println("Resposta 2: " + RespostaIncorrecta1[quina]);
					System.out.println("Resposta 3: " + RespostaCorrecta[quina]);
					correcte = 3;
				break;
			}return correcte;
	}
		
	private static boolean repetida (int sortides[], int quantes, int quina){
		boolean trobada = false;
		int i = 0;
		while(i < quantes && !trobada){
			if(sortides[i] == quina) trobada = true;
			else i++;
		}return trobada;
	}

	private static int afegir (int sortides[], int quantes, int quina) {
		sortides[quantes] = quina;
		return quantes++;
	}

	private static void totesCorrectes (String preguntes[], String RespostaCorrecta[]){
		System.out.println("\nPreguntes del joc i les seves corresponents respostes correctes\n");
		for(int i = 0; i < 20; i++){
			System.out.println(preguntes[i]);
			System.out.println(RespostaCorrecta[i] + "\n");
		}
	}
	
	//Creo una funcio que crea un numero aleatori entre dos nombres donats (inclosos)
	//Aquesta funcio es molt mes precisa i aleatoria que no pas l'us generalitzat del "random * x + x"
	//En aquest mateix paquet (Exercici1) es troba el fitxer "random.java", un programa que he desenvolupat on es demostra (per tal de 
	// justificar la funcio que creo a continuacio) que el random no compleix les expectatives. Tambe es pot consultar a:
	// https://github.com/ignasioliver/TCM/blob/master/FonamentsProgramacio/Practica5OliverIgnasi/src/Exercici1/random.java
	public static int aleatori(int minim, int maxim){
		double aleatori, nombreresultant;
		int nombrefinal;
		aleatori = Math.random();
		maxim++;
		nombreresultant = aleatori * (maxim - minim);
		nombrefinal = (int) (nombreresultant + minim);
		return nombrefinal;
	}
}	