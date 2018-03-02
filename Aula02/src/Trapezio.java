
public class Trapezio extends Figura {
	
	double basemenor;
	double basemaior;
	double altura;
	double lado1;
	double lado2;
	
	public Trapezio(double basemaior, double basemenor, double altura) {
		this.basemaior = basemaior;
		this.basemenor = basemenor;
		this.altura = altura;
	}
	
	public Trapezio(double basemaior, double basemenor, double lado1, double lado2) {
		this.basemaior = basemaior;
		this.basemenor = basemenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (((basemaior + basemenor) * altura) / 2);
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return basemaior + basemenor + lado1 + lado2;
	}

}
