
public class Resta extends Operacion {

	public Resta(int num1, int num2) {
			setNum1(num1);
			setNum2(num2);
	}

	@Override
	public int calcular() {
		return (getNum1() - getNum2());
	}

}
