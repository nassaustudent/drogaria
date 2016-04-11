public class Item {
	private String nomeDoMedicamento;
	private String fabricante;
	private String fornecedor;
	private double Preco;
	
	
	public Item(String nomeDoMedicamento, String fabricante, String fornecedor, double preco) {
		super();
		this.nomeDoMedicamento = nomeDoMedicamento;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
		Preco = preco;
	}


	public String getNomeDoMedicamento() {
		return nomeDoMedicamento;
	}


	public void setNomeDoMedicamento(String nomeDoMedicamento) {
		this.nomeDoMedicamento = nomeDoMedicamento;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}


	public double getPreco() {
		return Preco;
	}


	public void setPreco(double preco) {
		Preco = preco;
	}
	
	
	
	

}