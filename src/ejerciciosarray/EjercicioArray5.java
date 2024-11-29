package ejerciciosarray;
import java.util.Scanner;
public class EjercicioArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[] dias = new String[7];
		int[] temp = new int[7];
		int sumfar,sum=0,media=0, min=0,max=0;
		boolean enc=false;
		dias[0]="Lunes";
		dias[1]="Martes";
		dias[2]="Miercoles";
		dias[3]="Jueves";
		dias[4]="Viernes";
	    dias[5]="Sabado";
		dias[6]="Domingo";
		for (int i=0; i<dias.length;i++) {
			if (dias[i]!=null){
				System.out.println("Escribe la temperatura del "+dias[i]);
			temp[i]=teclado.nextInt();
			}
		}
		for (int i=0; i<dias.length;i++) {
			System.out.println("La temperatura del "+dias[i]+" es de: "+temp[i]+"ºC");
		}
		
		System.out.println("1.La media de la semana en ºF: ");
		for(int i=0;i<temp.length;i++) {
			sum=sum+temp[i];
		}
		sum=(sum*9/5)+32;
		System.out.println(sum);
		
		
		
		System.out.println("2.El día más caluroso y más frio");
		
		

		teclado.close();
	}

}
