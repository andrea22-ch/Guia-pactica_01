import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
		//  Ingrese el radio de un círculo
		//, calcule y muestre su área. Considere el valor de PI en 3.1416.  
		Scanner sc= new Scanner(System.in);
		float radio=0;
		System.out.print("Ingrese el radio de un círculo");
		radio= sc.nextFloat();
		System.out.println("resultados:");
		System.out.println("el area del circulo es: " + (2*3.1416)*(radio*radio));
	   

	}

}
