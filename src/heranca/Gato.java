package heranca;

public class Gato extends Animal {

	public Gato( String nome, String barulho) {
		super("Felino", nome, barulho);
		
	}
	
	@Override
	public void fazerBarulho() {
		// TODO Auto-generated method stub
		System.out.println("Gato "+ getNome() + " miando" );
	}
		
	
}
