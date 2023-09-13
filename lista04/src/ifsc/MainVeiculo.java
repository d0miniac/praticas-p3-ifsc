package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<>();

		Veiculo veiculo1 = new Veiculo();

		veiculo1.setNumerorodas(4);

		veiculo1.setFabricante("Toyota");

		veiculo1.setcor("Azul");

		veiculos.add(veiculo1);

		Veiculo veiculo2 = new Veiculo();

		veiculo2.setNumerorodas(4);

		veiculo2.setFabricante("Impala");

		veiculo2.setcor("Preto");

		veiculos.add(veiculo2);

		Veiculo veiculo3 = new Veiculo();

		veiculo3.setNumerorodas(12);

		veiculo3.setFabricante("volkswagen");

		veiculo3.setcor("Prata");

		veiculos.add(veiculo3);

		for (Veiculo veiculo : veiculos) {

			System.out.println("Número de Rodas: " + veiculo.getNumerorodas());

			System.out.println("Fabricante: " + veiculo.getFabricante());

			System.out.println("Cor: " + veiculo.getcor());

			System.out.println();

		}

	}

}
