
public class Cilindro extends Solido2 {
	
	public Cilindro(double raio, double altura) {
		super(raio, altura);	
	}
	
	public double volume() {
		
		return Math.PI * Math.pow(raio, 3) * altura;
	}
	
}
