package fgaBank;

import java.time.LocalDate;

public abstract class Funcionario {

	private final double INDICE = 0.05;

	private String nome;
	private String cpf;
	private String ctps;
	private double salario;
	private LocalDate dataAdmissao;

	public Funcionario() {

	}

	public Funcionario(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	/**
	 * Calculo de bonus para todos os funcionários
	 * 
	 * @since 01/04/22
	 * @author Naiana
	 * @return valor calculado para bonificação
	 */

	public double getBonus() {
		return this.salario * INDICE;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nCTPS: " + getCtps() + "\nData Admissão: "
				+ getDataAdmissao() + "\nSalário R$: " + getSalario() + "Bonus salarial R$: " + getBonus();
	}

}
