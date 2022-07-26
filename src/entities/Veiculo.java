package entities;

public class Veiculo {

	private String fabricante;
	private String modelo;
	private int ano;
	private double preco;
	
	private double seguro;
	private double ipva;
	private double licenciamento;
	private double documento;

	public Veiculo(String fabricante, String modelo, int ano, double preco, double seguro, double ipva, double licenciamento, double documento) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.seguro = seguro;
		this.ipva = ipva;
		this.licenciamento = licenciamento;
		this.documento = documento;
	}
	
	
	
	
	public Veiculo(String fabricante, String modelo, int ano, double preco) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}




	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

	public double getSeguro() {
		return seguro;
	}


	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}


	public double getIpva() {
		return ipva;
	}


	public void setIpva(double ipva) {
		this.ipva = ipva;
	}


	public double getLicenciamento() {
		return licenciamento;
	}


	public void setLicenciamento(double licenciamento) {
		this.licenciamento = licenciamento;
	}


	public double getDocumento() {
		return documento;
	}


	public void setDocumento(double documento) {
		this.documento = documento;
	}


	public String toString() {
		return "Veiculo " 
				+ fabricante 
				+ modelo 
				+ ano 
				+ " - R$" 
				+ String.format("%.2f", preco);

	}

}
