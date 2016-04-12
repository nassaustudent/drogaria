public class Funcionario extends Pessoa {
	private double salario; 
	private double salarioFinal; 
	private double salarioBase;
	private double gratificacao;
	
	public Funcionario(String nome, String cpf, String endereco, String telefone, double comissao, double salarioBase) {
		super(nome, cpf, endereco, telefone);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}	

	public void setGratificacao(double valor) {
		gratificacao = gratificacao + valor;
	}
	
	public double salario(){
		return salarioBase + gratificacao;
	}
	
}
