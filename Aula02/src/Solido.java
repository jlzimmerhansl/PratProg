
public abstract class Solido extends Formas {
	
	double largura;
	double comprimento;
	double altura;

	
	public Solido(double largura, double comprimento, double altura) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.altura = altura;
	}
	

	
	@Override
	public double volume() {
		return largura * comprimento * altura;
	}
	
	
	
}
