import java.util.Scanner;


public class caso13 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
         
         String n=" " , a=" ";
         
         System.out.print("INGRESE UN NOMBRE: ");
         n= sc.nextLine();
         System.out.print("INGRESE EL APELLIDO:");
         a= sc.nextLine();
         System.out.println("respuesta:");
         System.out.println("-----------------------");
         System.out.println("NOMBRE COMPLETO ES: "+ n+" "+a);
         

	}

}
