package Practica5_OliverIgnasi;

import Keyboard.Keyboard;

public class random {
	public static void main (String args[]){
		//Aquest programa posa de manifest la irregularitat que ofereix l'us del random si no s'usa correctament
		int i, mostra, un = 0, dos = 0, tres = 0, quatre = 0, cinc = 0, sis = 0;
		System.out.println("Introdueix la mostra, el nombre de vegades a generar un numero aleatori [1, 6] (com mes gran mes trigara): ");
		mostra = Keyboard.readInt();
		for (i = 0; i < mostra; i++){
			int opcio= (int) Math.round(Math.random() * 5 + 1);
			if (opcio == 1) un++;
			else if (opcio == 2)dos++;
			else if(opcio == 3)tres++;
			else if(opcio == 4)quatre++;
			else if(opcio == 5)cinc++;
			else if(opcio == 6)sis++;
		}System.out.println("VEGADES QUE HA APARESCUT EL...\nUN: " + un + "\nDOS: " + dos + "\nTRES: " + tres + "\nQUATRE: " + quatre + "\nCINC: " + cinc + "\nSIS: " + sis);
		
		double und, dosd, tresd, quatred, cincd, sisd;
		und = un; dosd = dos; tresd = tres; quatred = quatre; cincd = cinc; sisd = sis;
		und =  und / mostra * 100;
		dosd = dosd / mostra * 100;
		tresd = tresd / mostra * 100;
		quatred = quatred / mostra * 100;
		cincd = cincd / mostra * 100;
		sisd = sisd / mostra * 100;
		System.out.println("\nPERCENTATGES DEL...\nUN: " + und + " %\nDOS: " + dosd + " %\nTRES: " + tresd + " %\nQUATRE: " + quatred + " %\nCINC: " + cincd + " %\nSIS: " + sisd + " %");
		System.out.print("Com es pot observar, la distribucio no es aleatoria");
	}
}