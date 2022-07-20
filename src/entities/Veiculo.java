package entities;

public class Veiculo {

	public String fabricante;
	public String modelo;
	public int ano;
	double preco;

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

	public int getPreco() {
		return ano;
	}

	public void setPreco(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Veiculo " 
				+ fabricante 
				+ modelo 
				+ ano 
				+ "  R$" 
				+ String.format("%.2f", preco);

	}

}
