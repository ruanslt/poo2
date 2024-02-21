import heranca.Animal;
import heranca.Cao;
import heranca.Gato;

public class TesteHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal scooby = new Cao("TOTO", "AU AU AU AU");
		Animal tom = new Gato("Tomcat", "Miau");

// usa o setter para trocar o nome
		scooby.setNome("Scooby");

// chama os métodos

		scooby.fazerBarulho();
		tom.fazerBarulho();
		tom.mostrarJSON();

	}

}
