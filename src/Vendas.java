public class Vendas extends Item {
	private double item;
	private int quantidade;
	
	public Vendas(String nomeDoMedicamento, String fabricante, String fornecedor, double preco, double item,
			int quantidade) {
		super(nomeDoMedicamento, fabricante, fornecedor, preco);
		this.item = item;
		this.quantidade = quantidade;
	}

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
}