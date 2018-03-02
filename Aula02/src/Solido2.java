
public abstract class Solido2 extends Formas {
	
	double altura;
	double raio;
	
	
	
	public Solido2(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	
	public Solido2(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double volume() {
		return Math.PI * Math.pow(raio, 3) * altura;
	}

}
