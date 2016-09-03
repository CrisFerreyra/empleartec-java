import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		System.out.println("Escriba los numero que desea sumar/restar");
		Operacion op=new Suma (s.nextInt(),s.nextInt());
		
		System.out.println("El resutaldo de su suma es:  "+ op.opera());
		op=new Resta (s.nextInt(),s.nextInt());
		System.out.println("El resultado de su resta es: "+ op.opera());
		

	}

}
