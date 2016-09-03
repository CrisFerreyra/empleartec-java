
public class Suma extends Operacion {
	
	public Suma(int num1, int num2) {
			setNum1(num1);
			setNum2(num2);
	}

	public int calcular() {
		return (getNum1()+getNum2());
	}

}
