
public class Piramide extends Solido {
	
	
	public Piramide(double altura, double largura, double comprimento) {
		super(altura, largura, comprimento);
	}
	
	public double volume() {
		return (largura * altura * comprimento) / 3;
	}
}
