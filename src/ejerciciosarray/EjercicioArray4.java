package ejerciciosarray;

import java.util.Scanner;

public class EjercicioArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[]nombre = new String [6];
		int[]edades = new int [6];
		int menu;
		boolean enc=false;
		nombre[0]="Jon";
		nombre[1]="Sara";
		nombre[2]="Ander";
		nombre[3]="Marta";
		nombre[4]="Jone";
		nombre[5]="Mikel";
		edades[0]=18;
		edades[1]=20;
		edades[2]=26;
		edades[3]=21;
		edades[4]=17;
		edades[5]=24;

		System.out.println("Elige que quieres hacer");
		System.out.println("1. 1. El nombre y edad del más joven.");
		System.out.println("2. El nombre y edad del mayor");
		menu = teclado.nextInt();
		switch (menu) {
		case 1:
			for( int i=0;i<edades.length;i++) {
				if (edades[i]<Math.min(edades[0], edades[5])&&  enc==false) {
					System.out.println("La persona mas joven es " +nombre[i] +" con " +edades[i] +" años");
				}
			}
			break;
		case 2: 
			for( int i=0;i<edades.length;i++) {
				if (edades[i]>Math.max(edades[0], edades[5])&&  enc==false) {
					System.out.println("La persona mas mayor es " +nombre[i] +" con " +edades[i] +" años");
				}
			}

			break;
			default: 
			System.out.println("Escribe una opcion valida");
			
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
