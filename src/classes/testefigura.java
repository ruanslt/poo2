package classes;

public class testefigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura quadrado = new Figura(50, 50);
		quadrado.setLargura(70);
		quadrado.setAltura(70);
		System.out.printf("\nQuadrado: largura = %d x altura = %d ", quadrado.getLargura(), quadrado.getAltura());

		Figura retangulo = new Figura(100, 50);
		System.out.printf("\nRetangulo: largura = %d x altura = %d ", retangulo.getLargura(), retangulo.getAltura());

		System.out.printf("\n" + Figura.nomeClasse);

		System.out.printf("\nArea do quadrado: %d", quadrado.calculaArea());
		System.out.printf("\nArea do retangulo: %d", retangulo.calculaArea());

		/// usando getter sem parenteses
		System.out.printf("\nArea do quadrado: %d", quadrado.getArea());
		System.out.printf("\nArea do retangulo: %d", retangulo.getArea());

	}

}
