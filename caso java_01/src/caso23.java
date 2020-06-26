import java.text.DecimalFormat;
import java.util.Scanner;


public class caso23 {

	public static void main(String[] args) {
		//Ingrese nombre de un producto, precio y cantidad, luego calcule
		//y muestre el importe, el IGV (18% del importe), descuento
//(3% del importe) y el total (importe - descuento + IGV). 
		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		String nombre =" ";
	 float cant=0,precio=0,importe=0;
	System.out.println("Ingrese nombre de producto: ");
	 nombre= sc.nextLine();
	System.out.println("precio del producto: ");
	precio=sc.nextFloat();
	System.out.println("cantidad :");
	cant= sc.nextFloat();
	importe=precio*cant;
	float igv=(float)0.18*importe;
	float desc=(float)0.03*importe;
	float total=(float)importe-desc+igv;
	System.out.println("Resultados: ");
	 System.out.println("--------------------------------");
	 System.out.println("importe: "+(precio*cant));
	 System.out.println("IGV: "+df.format(igv));
	 System.out.println("Descuento: "+df.format(desc));
	 System.out.println("Total: "+df.format(total));
		

	}

}
