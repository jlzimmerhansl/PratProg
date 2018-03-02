
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo cir = new Circulo(7.2);
				
		System.out.println("A areao do circulo e: " + cir.area() + " \n");
		
		Circulo cir2 = new Circulo(7.2);
		
		System.out.println("O perimetro do circulo e: " + cir2.perimetro() + " \n");
		
		Triangulo tri = new Triangulo(10,22);
		
		System.out.println("A area do triangulo é: " + tri.area() + " \n");
		
		System.out.println("O perimetro do triangulo é: " + tri.perimetro() + "\n");
		
		Losango los = new Losango(10,22);
		
		System.out.println("A área do Losango é: " + los.area() + " \n");
		
		System.out.println("O perimetro Losango é: " + los.perimetro() + " \n");
		
		Retangulo ret = new Retangulo(5,2);
		
		System.out.println("A área do retangulo é: " + ret.arearet() + " \n");
		
		Retangulo ret2 = new Retangulo(2,4);
		
		System.out.println("A diagonal do retangulo é: " + ret2.diagonal() + " \n");
		
		Retangulo ret3 = new Retangulo(2,4);
		
		System.out.println("O perimetro do retangulo é: " + ret3.perimetro() + " \n");
		
		Quadrado qua = new Quadrado(5);
		
		System.out.println("A área do quadrado é: " + qua.areaqua() + " \n");
		
		Quadrado qua2 = new Quadrado(5);
		System.out.println("A diagonal do quadrado é: " + qua2.diagonal() + " \n");
		
		Quadrado qua3 = new Quadrado(5);
		System.out.println("O perimetro do quadrado é: " + qua3.perimetro() + " \n");
		
		Trapezio tra = new Trapezio(4,2,10);
		System.out.println("A área do Trapezio é: " + tra.area() + "\n");
		
		Trapezio tra2 = new Trapezio(4, 2, 6, 6);
		System.out.println("O perimetro do trapezio é: " + tra2.perimetro() + "\n");
		
		Cubo cubo = new Cubo(2,3,2);
		System.out.println("O volume do cubo é: " + cubo.volume() + "\n");
		
		Esfera esfera = new Esfera(5);
		System.out.println("O volume da esfera é: " + esfera.volume() + "\n");
		
		Cilindro cilindro = new Cilindro(5, 12);
		System.out.println("O volume da cilindro é: " + cilindro.volume() + "\n");
		
		Piramide piramide = new Piramide(3.8, 10, 20);
		System.out.println("O volume da piramide é: " + piramide.volume() + "\n");
		
	}

}
