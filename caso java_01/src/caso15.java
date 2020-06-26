

import java.text.DecimalFormat;
import java.util.Scanner;
public class caso15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		
		System.out.println("ingrese precio:");
          float precio=sc.nextFloat();
  		System.out.println("ingrese cantidad:");

          float cantidad=sc.nextFloat();
          float importe1= cantidad*precio;
          float importe2= (float)(importe1 /3.24);
          float importe3=(float) (importe1 /3.75);
          
         System.out.println("resulatdos:");
 		System.out.println("resulatados en soles....:"+importe1);
 		System.out.println("convertido a dolar....."+df.format(importe2));
          System.out.println("importe en euros:....."+df.format(importe3));

	}

}
