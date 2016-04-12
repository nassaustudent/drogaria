public class Funcionario extends Pessoa {
	private double salario; 
	private double salarioFinal; 
	private double salarioBase;
	
	public Funcionario(String nome, String cpf, String endereco, String telefone, double comissao, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
		System.out.println("");
	}	

	//public double SalarioFinal() {
		//return salarioBase + gratificacao();
	//}
	
	//private double gratificacao() {
		//double gratificacaoBase = 1.24 * funcao;
		//return getTempoDeServico() * gratificacaoBase;
	//}
	
	
}
