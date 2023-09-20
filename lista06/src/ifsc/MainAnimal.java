package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();

		cachorro.setEcossitema("casa");
		cachorro.setComprimento(30f);
		cachorro.setNumeroDePatas(4);
		cachorro.setCor("caramelo");
		cachorro.setNome("Donovan");
		cachorro.setRaca("vira lata");

		cachorro.caminha();
		cachorro.late();

		Gato gato = new Gato();

		gato.setEcossitema("casa");
		gato.setComprimento(25f);
		gato.setNumeroDePatas(4);
		gato.setCor("rajado");
		gato.setNome("Frajola");
		gato.setRaca("Siames");

		gato.caminha();
		gato.mia();

		System.out.println("Informações sobre o Cachorro:");

		System.out.println("Comprimento: " + cachorro.getComprimento() + " cm");

		System.out.println("Número de Patas: " + cachorro.getNumeroDePatas());

		System.out.println("Cor: " + cachorro.getCor());

		System.out.println("Ecossistema: " + cachorro.getEcossitema());

		System.out.println("Raça: " + cachorro.getRaca());
		

		System.out.println("\nInformações sobre o Gato:");

		System.out.println("Comprimento: " + gato.getComprimento() + " cm");

		System.out.println("Número de Patas: " + gato.getNumeroDePatas());

		System.out.println("Cor: " + gato.getCor());

		System.out.println("Ecossistema: " + gato.getEcossitema());

		System.out.println("Raça: " + gato.getRaca());

	}
}
