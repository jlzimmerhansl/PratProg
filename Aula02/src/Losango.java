
public class Losango extends Poligono {
	
	public Losango(double altura, double base) {
		super(altura,base);
	}
	
	@Override
	public double area() {
		return(altura*base);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4 * base;
	}

}
