package fgaBank;

import java.time.LocalDate;

public class Diretor extends Funcionario{

	public Diretor() {
		super();
		
	}

	public Diretor(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super(nome, cpf, ctps, salario, dataAdmissao);
		
	}
	
	@Override
	public double getBonus() {
		return getSalario() * 0.15;
	}

}
