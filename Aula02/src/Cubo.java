
public class Cubo extends Solido {
	

	
	public Cubo(double largura, double comprimento, double altura) {
		super(largura,comprimento,altura);
	}
	
	public double volume() {
		return largura * comprimento * altura;
		
	}
}
