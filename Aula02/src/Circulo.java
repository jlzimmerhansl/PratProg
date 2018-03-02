
public class Circulo extends Figura {
	
	
	private double raio;
	
	public Circulo(double raio) {
		// TODO Auto-generated constructor stub
		
		this.raio = raio;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio;
	}

}


