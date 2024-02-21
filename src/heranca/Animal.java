package heranca;

public class Animal {
	
	private String especie;
	private String nome;
	private String barulho;
	public Animal(String especie, String nome, String barulho) {
		
		this.especie = especie;
		this.nome = nome;
		this.barulho = barulho;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBarulho() {
		return barulho;
	}
	public void setBarulho(String barulho) {
		this.barulho = barulho;
	}
	public void fazerBarulho() {
		System.out.println(nome+ " " + barulho);
	}
	
	 private String montarJSON(){
	 return"\n{"+
	            "\n\tespecie:" +  this.especie + "," +
	            "\n\tnome:" + this.nome + "," +
	            "\n\tbarulho:" +  this.barulho +
	        "\n}";
	    }

	
	public void mostrarJSON() {
		System.out.println("\nDados em formato JSON: " + montarJSON());
	}
	
	@Override
	public String toString() {
		return "nome do animal: "+nome;
	}
}
