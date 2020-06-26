import java.util.Scanner;

public class caso20 {

	public static void main(String[] args) {
		//Incremente el valor de una venta en 42%. 
				Scanner sc=new Scanner(System.in);
				float precio=0;
				System.out.println("ingrese el valor de la venta:");
				precio= sc.nextFloat();
				System.out.println("Resultados:");
				System.out.println("--------------------------------");
		        System.out.println(" valor de la venta incremntado al 42% es:"+(precio+precio*0.42));

	}

}
