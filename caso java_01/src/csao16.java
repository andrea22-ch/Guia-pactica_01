import java.text.DecimalFormat;
import java.util.Scanner;

public class csao16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		float hrs=0,tr=0,sl=0;
		System.out.println("ingrese de horas trabajdas:");
		hrs= sc.nextFloat();
		System.out.println("Ingrese la tarifa horaria: ");
		tr=sc.nextFloat();
	sl=hrs*tr;
	float bono=(float)0.05*sl;
	float total=sl+bono;
	float dolar = (float)(3.5*total);
	
		
		System.out.println("RESULTADOS:    ");
		System.out.println("----------------------");
		System.out.println("Su sueldo es: "+tr*hrs);
		System.out.println("su bono es : "+df.format(tr*hrs*0.05));
		System.out.println("el total es: "+df.format(total));
		System.out.println("su sueldo em dolar es: "+df.format(dolar));


	}

}
