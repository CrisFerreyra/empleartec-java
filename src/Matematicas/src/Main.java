
public class Main {

	public static void main(String[] args) {
		Operacion cal = new Suma(10,4);
		System.out.println(cal.calcular());
		cal = new Resta(29,4);
		System.out.println(cal.calcular());
	}

}
