package ifsc;

public class Animal {

	private String ecossitema;
	private Float comprimento;
	private Integer numeroDePatas;
	private String cor;
	private String nome;
	private String raca;

	public void caminha() {
		System.out.println("Caminhando");
	}

	public String getEcossitema() {
		return ecossitema;
	}

	public void setEcossitema(String ecossitema) {
		this.ecossitema = ecossitema;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public Integer getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(Integer numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
