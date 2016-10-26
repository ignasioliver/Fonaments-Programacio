package Exercici2;

import Keyboard.*;

public class Exercici2 {
	public static void main (String args[]){
		int un, dos, tres;
		System.out.println("Especifica els 3 valors\n***********************");
		System.out.print("Valor 1: ");
		un = Keyboard.readInt();
		System.out.print("Valor 2: ");
		dos = Keyboard.readInt();
		System.out.print("Valor 3: ");
		tres = Keyboard.readInt();
		System.out.print("Ordenació de petit a gran: ");
		if (un <= dos && un <= tres){
			if (dos <= tres) System.out.print(un + " " + dos + " " + tres);
			else System.out.print(un + " " + tres + " " + dos);
		}else if (dos <= un && dos <= tres){
			if (un < tres) System.out.print(dos + " " + un + " " + tres);
			else System.out.print(dos + " " + tres + " " + un);
		}else if (tres <= un && tres <= dos){
			if (un < dos) System.out.print(tres + " " + un + " " + dos);
			else System.out.print(tres + " " + dos + " " + un);
		}else System.out.print("S'ha produït un error.");
	}
}