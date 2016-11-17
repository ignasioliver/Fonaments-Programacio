package Exercici10;

public class Exercici10 {
	public static void main(String[] args) {
		int x,cont = 1;
	while(cont <= 2){
		//generem un valor aleatori entre 3 i 90
		x = (int) Math.round(Math.random()* (90-3 + 1) + 3);
		TAMBURET(x);
		cont++;
	}
	
}
	
	private static void TAMBURET(int x){
	int n, banda2, banda1;
	n = x;
	banda2 = 1;
	System.out.println("Dibuix del tamburet de " + n);
	while(banda2 <= n){
		banda1 = 1;
		while(banda1 <= n){
			if(banda2 == 1 || banda2 == 2){
				if(banda1 == n){
					System.out.println("*");
				} else System.out.print("*");
			} else {
				if(banda1 == 1){
					System.out.print("*");
				} else if(banda1 == n) {
					System.out.println("*");
				} else System.out.print(" ");
			}
			banda1++;
		}
		banda2 = banda2 + 1 ;
		}
	}
}