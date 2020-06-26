import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
	
				Scanner sc= new Scanner(System.in);
				float n1=0,n2=0;
				System.out.print("ingrese un numero:");
				n1= sc.nextFloat();
				System.out.print("ingrese otro numero:");
				n2= sc.nextFloat();
				System.out.println("el prmedio de los dos numeros es:"+ ((n1+n2)/2));
				System.out.println("el primer numero aumentado en 20% es:"+(n1+(n1*0.2)));
				System.out.println("disminuya el segundo número en 30%."+(n2-(n2*0.3)));

	}

}
