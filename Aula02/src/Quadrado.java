
public class Quadrado extends Poligono implements Diagonal {
	
	public Quadrado(int lado) {
		super(lado);
	}
	
	@Override
	public double areaqua() {
		
		return(lado * lado);
		
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return lado * Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4 * lado;
	}

}
