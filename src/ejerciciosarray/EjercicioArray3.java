package ejerciciosarray;

import java.util.Scanner;
public class EjercicioArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[]arrMeses = new String [5];
		int[]arrNumeros = new int [5];
		int menu;
		boolean enc=false;
		arrMeses[0]="enero";
		arrMeses[1]="Febrero";
		arrMeses[2]="Marzo";
		arrMeses[3]="Abril";
		arrMeses[4]="Mayo";
		arrNumeros[0]=123;
		arrNumeros[1]=333;
		arrNumeros[2]=180;
		arrNumeros[3]=210;
		arrNumeros[4]=90;
		
		System.out.println("Elige que quieres hacer");
		System.out.println("1. Mostrar en cada mes cuantos litros han llovido.");
		System.out.println("2. Mostrar en pantalla el mes y los litros del mes más lluvioso.");
		menu = teclado.nextInt();
		switch (menu) {
		case 1:
			for ( int i = 0; i<arrMeses.length;i++) {
				if (arrMeses[i]!=null) { 
					System.out.println("En el mes "+arrMeses[i]+" han llovido "+arrNumeros[i]+" litros ");
				}
			}
			break;
		case 2: 
			for( int i=0;i<arrNumeros.length;i++) {
				if (arrNumeros[i]>Math.max(arrNumeros[0], arrNumeros[4])&&  enc==false) {
					System.out.println("El mes mas lluvioso ha sido: " +arrMeses[i] +" con " +arrNumeros[i] +" Litros");
					enc=true;
				}
			}

			break;
			default: 
			System.out.println("Escribe una opcion valida");
			
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
