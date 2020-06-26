import java.util.Scanner;
public class caso19 {

	public static void main(String[] args) {
		 //Calcule el perímetro de un triángulo. 
		Scanner sc= new Scanner(System.in);
		float l1=0,l2=0,l3=0;
		System.out.println("ingrese lado1: ");
		l1=sc.nextFloat();
	
		System.out.println("ingrse lado2: " );
		l2=sc.nextFloat();
		System.out.println("ingrese lado2: ");
		l3=sc.nextFloat();
		System.out.println("resultados:");
		System.out.println("--------------------");
		System.out.println("perimetro: "+(l1+l2+l3));
	
	}

}
