import java.util.Scanner;
public class caso4 {

			public static void main(String[] args) {
				Scanner leer = new Scanner(System.in);
				float n1=0,n2=0;
				System.out.print("ingrese un numero:");
				n1= leer.nextFloat();
				System.out.print("ingrese otro numero:");
		         n2=leer.nextFloat();
		         
		         System.out.println("RESULTADOS:");
		         System.out.println("=========================");
		         System.out.println("LA SUMA DE ESOS NUMERO ES:"+(n1+n2));
		         System.out.println("LA RESTA DE ESOS NUMEROS ES:"+(n1-n2));
			}

	}

