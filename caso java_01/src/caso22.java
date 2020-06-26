import java.util.Scanner;
import java.text.DecimalFormat;


public class caso22 {

	public static void main(String[] args) {
        //22: Ingrese el nombre de un alumno y sus notas, luego calcule 
		//y muestre el promedio considerando: nota1 * 20% + nota2 * 30% + nota3 * 50%
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		 String nom=" ";
		float n1=0,n2=0,n3=0;
		System.out.println("ingrese el nonmbre: ");
		nom=sc.nextLine();
		System.out.println("Ingrese nota1:");
		n1= sc.nextFloat();
		System.out.println("ingrese nota2: ");
		n2= sc.nextFloat();
		System.out.println("ingrese nota3; ");
	    n3=sc.nextFloat();
	    System.out.println("nota 1= 20%");
	    System.out.println("nota 2=30%");
	    System.out.println("nota 3= 50%");
      
	    System.out.println("-----------------------");
	    System.out.println("promedio total de "+nom+" es: "+df.format((n1*0.2)+(n2*0.3)+(n3*0.5)));
	}// TODO Auto-generated method stub

	}


