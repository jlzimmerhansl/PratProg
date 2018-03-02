import java.util.ArrayList;
import java.util.List;

public class Geometria {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(7));
		figuras.add(new Triangulo(10,22));
		figuras.add(new Losango(10,22));
		figuras.add(new Retangulo(5,22));
		figuras.add(new Quadrado(5));
	
	
	for(Figura fig:figuras) {
		System.out.println(fig.area());
		
	}
	
	List<Figura> figurasperi = new ArrayList<>();
	figuras.add(new Circulo(5));
	figuras.add(new Triangulo(12,30));
	figuras.add(new Losango(15,20));
	figuras.add(new Retangulo(2,50));
	figuras.add(new Quadrado(4));


for(Figura figp:figurasperi) {
	System.out.println(figp.perimetro());
	
}
	
	}

}
