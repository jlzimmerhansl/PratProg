
public class Retangulo extends Poligono implements Diagonal {
	
	public Retangulo(int lado2, int lado) {
		super(lado2, lado);
	}
	
	@Override
	public double arearet() {
		return lado2 * lado;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt((Math.pow(lado, 2)) + (Math.pow(lado2, 2)));
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (2 * lado) + (2 * lado2);
	}
}
