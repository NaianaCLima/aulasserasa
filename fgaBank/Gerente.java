package fgaBank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno {

	private String usuario = "usuariopadrao";
	private String senha = "mudar123";

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super(nome, cpf, ctps, salario, dataAdmissao);

	}

	@Override
	public double getBonus() {
		return this.getSalario() * 0.1;
	}

	@Override
	public boolean autenticar(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {// comparar textos e objetos é equals.
			return true;
		}
		return false;
	}

	@Override
	public boolean alterarSenha(String senha, String senhaNova) {
		if (this.senha.equals(senha) && senhaNova.length() <= 8) {
			this.senha = senhaNova;
			return true;
		}

		return false;
	}

	@Override
	public boolean alterarUsuario(String usuario, String usuarioNovo) {
		if (this.usuario.equals(usuario) && usuarioNovo.length() <= 12) {
			this.usuario = usuarioNovo;
			return true;
		}

		return false;
	}

}
