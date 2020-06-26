import java.util.Scanner;
import java.text.DecimalFormat;
public class caso17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println();
		int apro=0,desp=0,reti=0,total=0;
		System.out.print("Ingrese numeros de aprobados: ");
		apro= sc.nextInt();
		System.out.println("Ingrese numero de desaprobados :");
		desp=sc.nextInt();
		System.out.println("Ingrese numero de retirados: ");
		reti=sc.nextInt();
		total= apro+desp+reti;
		System.out.println("RESPUESTAS:");
		System.out.println("----------------------------------");
		System.out.println("Alumnos totales:\t"+total);
		System.out.println("Aprobados:"+df.format((apro*100)/total)+"%");
		System.out.println("Desaprobados:"+df.format((desp*100)/total)+"%");
		System.out.println("Retirados:"+df.format((reti*100)/total)+("%"));

	}

}
