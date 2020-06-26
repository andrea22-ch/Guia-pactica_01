import java.util.Scanner;
import java.text.DecimalFormat;

public class caso21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		float gasto=0;
		System.out.println("Ingrese el gasto: ");
		gasto=sc.nextFloat();
		System.out.println("RESULATADOS:");
		System.out.println("------------------");
		System.out.println("El gasto disminuido en 12% es:"+df.format(gasto-gasto*0.12));
		
	}

}
