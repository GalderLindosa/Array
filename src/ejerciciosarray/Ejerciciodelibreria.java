package ejerciciosarray;
import java.util.Scanner;
public class Ejerciciodelibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		String[] a= new String[20];
		int menu,salir,nuevoP = 0;
		boolean encontrado;
		String opcion,si,no,librob,nuevoN;
		si = "Si";
		no = "No";
		salir = 0;
		a [0] = "Nada";
	    a [1] = "Tímidamente de la oscuridad a la luz";
	    a [2] = "Pájaros a golpes";
	    a [3] = "Caperucita Roja";
		a [4] = "12 cuentos clásicos";
	    a [5] = "Pepe y Mila";
	    a [6] = "Enojaos";
	    a [7] = "En casa vacía";
		a [8] = "123";
	    a [9] = "Día Negro";
	    a [10] = "El Hobbit";
	    a [11] = "Calle Judía";
	    int[] b= new int[20];
		b [0] = 15;
	    b [1] = 12;
	    b [2] = 15;
	    b [3] = 25;
		b [4] = 19;
	    b [5] = 17;
	    b [6] = 25;
	    b [7] = 13;
		b [8] = 11;
	    b [9] = 18;
	    b [10] = 25;
	    b [11] = 35;
	    System.out.println("Bienvenido usuario");
		do {
			System.out.println("--------Menu-------\n1.-Mostrar el título de todos los libros.\n2.-Mostrar el título y el precio de todos los libros.\n3.-Mostrar el precio de un libro.\n4.-Introducir un nuevo libro\n5.-Eliminar un libro\n6.-Modificar el precio de un libro\n7.-Modificar el título de un libro\n8.-Salir del programa.");
			menu=teclado.nextInt();
		switch(menu) {
		case 1:
			  for (int i=0;i<a.length;i++) {
		        	System.out.println(a[i] + "");
		        	}
			  do {
		        	System.out.println("¿Quieres continuar en el programa? SI / NO");
		        	opcion=teclado.next();
		        	if (opcion.equalsIgnoreCase(si)) {
		        	} if (opcion.equalsIgnoreCase(no)) {
		        		
		        		System.out.println("Adios");
		        		salir ++;
		        	}
		        	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
			break;
		case 2:
			 for (int i=0;i<a.length;i++) {
		        	System.out.println("El precio del libro " + a[i] + " son " + (b[i] + " euros"));
		        	}
			 do {
		        	System.out.println("¿Quieres continuar en el programa? SI / NO");
		        	opcion=teclado.next();
		        	if (opcion.equalsIgnoreCase(si)) {
		        	} if (opcion.equalsIgnoreCase(no)) {
		        		
		        		System.out.println("Adios");
		        		salir ++;
		        	}
		        	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
			break;
       case 3:
    	   encontrado=false;
       	System.out.println("Di el titulo del libro que estas buscando");
		teclado.nextLine();
       	librob = teclado.nextLine();
       	
       	 for (int i=0;i<a.length;i++) {
       		 if (librob.equalsIgnoreCase(a[i])) {
       			 
       		 	System.out.println("El precio del libro " + a[i] + " son " + b[i] + " euros" );
       		 }
		        	}
       	 do {
            	System.out.println("¿Quieres continuar en el programa? SI / NO");
            	opcion=teclado.next();
            	if (opcion.equalsIgnoreCase(si)) {
            	} if (opcion.equalsIgnoreCase(no)) {
            		
            		System.out.println("Adios");
            		salir ++;
            	}
            	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
			break;
		case 4:
			int k = 0;
	         do {

	             if ((a[19]) != null) {
	                System.out.println("Tienes muchos libros en la tienda, elimina un libro.");
	                do {
	                    System.out.println("¿Quieres continuar en el programa? SI / NO");
	                    opcion=teclado.next();
	                    if (opcion.equalsIgnoreCase(si)) {
	                    } if (opcion.equalsIgnoreCase(no)) {

	                        System.out.println("Adios");
	                        salir ++;
	                    }
	                    } while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
	             }
	                if ((a[k]) == null) {
	                       System.out.println("¿Cuál es el título del libro?");
	                       nuevoN=teclado.next();
	                       a [k] = nuevoN;
	                       System.out.println("¿Cuál es el precio?");
	                       nuevoP=teclado.nextInt();
	                       b [k] = nuevoP;
	                       System.out.println("El precio del libro " + a[k] + " son " + b[k] + " euros");
	                       k = 20;
	                    }

	                 k++;
	                 } while (k <a.length);
	        do {
	          System.out.println("¿Quieres continuar en el programa? SI / NO");
	          opcion=teclado.next();
	          if (opcion.equalsIgnoreCase(si)) {
	          } if (opcion.equalsIgnoreCase(no)) {

	              System.out.println("Adios");
	              salir ++;
	          }
	          } while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
	        break;
		
	    case 5:
	    	System.out.println("¿Cuál es el título del libro?");
 			teclado.nextLine();
	       	librob = teclado.nextLine();
	       	 for (int i=0;i<a.length;i++) {
	       		 if (librob.equalsIgnoreCase(a[i])) {
	       			 a [i] = null;
	       			 b [i] = 0; 
	       		 	System.out.println("El libro ha sido eliminado");
	       		 	for (int o = i + 1; o < a.length; o++) {
						a[o - 1] = a[o];
						b[o - 1] = b[o];
	       		 }
			        	}
	       	 }
	       	a[a.length-1]=null;
			b[a.length-1]=0;
	    	do {
	        	System.out.println("¿Quieres continuar en el programa? SI / NO");
	        	opcion=teclado.next();
	        	if (opcion.equalsIgnoreCase(si)) {
	        	} if (opcion.equalsIgnoreCase(no)) {
	        		
	        		System.out.println("Adios");
	        		salir ++;
	        	}
	        	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
			break;
		case 6:
			System.out.println("¿Cuál es el título del libro?");
 			teclado.nextLine();
	       	librob = teclado.nextLine();
	       	 for (int i=0;i<a.length;i++) {
	       		 if (librob.equalsIgnoreCase(a[i])) {
	       			System.out.println("El precio del libro " + a[i] + " son " + b[i] + " euros");
	       			System.out.println("¿Cuál es el nuevo precio?");
	       			nuevoP = teclado.nextInt();
	       			 b [i] = nuevoP; 
	       			System.out.println("El precio ha sido cambiado.");
	       			System.out.println("El nuevo precio del libro " + a[i] + " son " + b[i] + " euros");
	       		 }
			        	}
			do {
	        	System.out.println("¿Quieres continuar en el programa? SI / NO");
	        	opcion=teclado.next();
	        	if (opcion.equalsIgnoreCase(si)) {
	        	} if (opcion.equalsIgnoreCase(no)) {
	        		
	        		System.out.println("Adios");
	        		salir ++;
	        	}
	        	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
			break;
       case 7:
    	   System.out.println("¿Cuál es el título del libro?");
			teclado.nextLine();
	       	librob = teclado.nextLine();
	       	
	       	 for (int i=0;i<a.length;i++) {
	       		 if (librob.equalsIgnoreCase(a[i])) {
	       			System.out.println("¿Cuál es el nuevo título del libro?");
	       			
	       			nuevoN = teclado.nextLine();
	       			System.out.println("El titulo ha sido modificado.");
	       			System.out.println("El nuevo título del libro " + a[i] +  " es " + nuevoN);
	       		     a [i] = nuevoN; 
	       		 }     	
	       	 }
       	do {
       	System.out.println("¿Quieres continuar en el programa? SI / NO");
       	opcion=teclado.next();
       	if (opcion.equalsIgnoreCase(si)) {
       	} if (opcion.equalsIgnoreCase(no)) {
       		System.out.println("Adios");
       		salir ++;
       	}
       	} while (!opcion.equalsIgnoreCase(si) && !opcion.equalsIgnoreCase(no));
			break;
		case 8:
			salir ++;
			System.out.println("Adios");
			break;
		}
		   } while (salir == 0);
		teclado.close();
		}
	}