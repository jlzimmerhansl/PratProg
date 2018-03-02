
public  abstract class Poligono extends Figura {
	
	 double altura;
	 double base;
	 int lado;
	 int lado2;
	
	public Poligono (double altura, double base) {
		
		this.altura = altura;
		this.base = base;
	}
	
	public Poligono (int lado){
		this.lado = lado;
	}

	public Poligono (int lado2, int lado){
		this.lado2 = lado2;
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return altura * base;
	}
	

	public double arearet() {
		return lado2 * lado;
	}

	public double areaqua() {
		return lado;
	}
	

}
