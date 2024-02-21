package classes;

public class Figura {
	
	 // # = variaveis sao privadas 
    private int largura;  
    private int altura; 


    // construtopr da classe

    public Figura(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }


    //variavel estatica = compartilahda da classe 
    public static String nomeClasse = "ClasseFigura";

    // método ou função 
    public int calculaArea() {
        return this.largura * this.altura;
    }

    // método ou função getter 
    public int getArea() {

        return this.calculaArea();

    }

    // método ou função setter 

    public void setLargura(int largura){
        this.largura = largura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
    
    
    public int getLargura() {
		return largura;
	}
    
    public int getAltura() {
		return altura;
	}
}

