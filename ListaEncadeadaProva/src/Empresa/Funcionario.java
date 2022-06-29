package Empresa;

public class Funcionario {
	private String nome;
	private int rg;
	private int cpf;
	private int idade;

	public Funcionario() {

	}

	public Funcionario(String nome, int rg, int cpf, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return ("Dados do Funcionario - Nome: " + nome + ", Rg: " + rg + ", Cpf: " + cpf + ", Idade: " + idade +"\"");
	}

}
