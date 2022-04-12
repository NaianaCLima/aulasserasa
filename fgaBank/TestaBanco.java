package fgaBank;

import java.time.LocalDate;
import java.util.Locale;

public class TestaBanco {

	public static void main(String[] args) {

		// Pessoa pessoa = new Pessoa("José Francisco", "Programador", "716.778.724-89",
		// "6250189", "jose@gmail.com",
		// "81992789614");
		// Conta conta = new Conta();

		// System.out.println("Nome: " + pessoa.getNome());
		// System.out.println("Profissão: " + pessoa.getProfissao());
		// System.out.println("Cpf: " + pessoa.getCpf());

		// Pessoa pessoa2 = pessoa; // Sobrescrita da informação
		// pessoa2.setNome("João do Tomate");

		// System.out.println("Nome pessoa 1: " + pessoa.getNome());
		// System.out.println("Nome pessoa 2: " + pessoa2.getNome());

//		PessoaFisica naiana = new PessoaFisica();
//		naiana.setNome("Naiana Lima");
//		naiana.setEmail("nai@gmail.com");
//		naiana.setTelefone("81992970017");
//		naiana.setCpf("017.982.550-06");
//		naiana.setProfissao("Dev");
//		naiana.setRg("6258967");
//
//		Conta conta = new Conta();
//		conta.setAgencia(1234);
//		conta.setNumConta(7889);
//		conta.setTitular(naiana);
//
//		conta.depositar(100.0);
//
//		System.out.println("Agência: " + conta.getAgencia());
//		System.out.println("Conta: " + conta.getNumConta());
//		System.out.println("Titular: " + conta.getTitular().getNome());
//		System.out.printf("Saldo R$: %.2f\n", conta.getSaldo());
//
//		if (conta.sacar(20.35)) {
//			System.out.println("Saque efetuado com sucesso!");
//		} else {
//			System.out.println("Verifique o valor do saldo!");
//		}
//
//		System.out.printf("\nSaldo atual R$: %.2f", conta.getSaldo());
//
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);

		
		Locale.setDefault(new Locale("pt", "BR"));
		Gerente funcionario = new Gerente("Naiana Lima", "001.122.348-92", "87759", 2500.0, LocalDate.now());
		
		System.out.println(funcionario.toString());
		
		boolean resposta = funcionario.autenticar("usuariopadrao", "mudar123");
		boolean respostaSenhaNova = funcionario.alterarSenha("mudar123", "123mudar");
		boolean respostaNovoUsuario = funcionario.alterarUsuario("usuariopadrao", "adm");
		
		if(resposta)
			System.out.println("Bem-vindo(a) " + funcionario.getNome());
		else
			System.out.println("Usuário ou senha inválidos");
		
		if(respostaSenhaNova)
			System.out.println("Senha alterada com sucesso!");
		else
			System.out.println("Senha inválida!");
		
		if(respostaNovoUsuario)
			System.out.println("Usuário alterado com sucesso!");
		else
			System.out.println("Usuário inválido");

	}

}
