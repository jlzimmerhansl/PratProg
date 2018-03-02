
public class Esfera extends Solido2 {
	
	
	public Esfera(double raio) {
		super(raio);
	}
	
	public double volume() {
		return ((4 * Math.PI * Math.pow(raio, 3)) / 3);
	}

}
