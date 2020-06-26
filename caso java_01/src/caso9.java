import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float base=0,altura=0;
		
		System.out.println("ingrese la base:");
		base= sc.nextFloat();

		System.out.println("ingrese la altura:");
		altura=sc.nextFloat();
		
		System.out.println("el area es:"+base*altura);
		System.out.println("el perimitro es:"+(2*(base+altura)));

	}

}
