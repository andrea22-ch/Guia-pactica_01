import java.text.DecimalFormat;
import java.util.Scanner;

public class caso24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		float m1=0,m2=0,m3=0;
		System.out.print("ingrese monto 1: ");
		m1=sc.nextFloat();
		System.out.print("ingrese monto 2:");
		m2=sc.nextFloat();
		System.out.print("ingrese monto 3: ");
		m3=sc.nextFloat();
		System.out.println("Resultados: ");
		 System.out.println("--------------------------------");
		 System.out.println("la quinta parte del monto 1 + el 20% del monto 2: "+df.format(((m1/5)+(0.20*m2))));
		 System.out.println("La mitad del aumento en 60% del tercer monto: "+df.format((m3+(m3*0.6))/2));
		 System.out.println("Disminuya en 8% la suma de los tres montos.: "+df.format((m1+m2+m3)-(m1+m2+m3)*0.08));
		}

	}


