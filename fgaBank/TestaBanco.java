package fgaBank;

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

		Conta conta = new Conta();
		conta.setAgencia(1234);
		conta.setNumConta(7889);
		// conta.setSaldo(10000.0);
		conta.setTitular("Naiana Lima");

		conta.depositar(100.0);

		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getNumConta());
		System.out.println("Titular: " + conta.getTitular());
		System.out.printf("Saldo R$: %.2f\n", conta.getSaldo());
		
				
		if (conta.sacar(20.35)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Verifique o valor do saldo!");
		}

		System.out.printf("\nSaldo atual R$: %.2f", conta.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumConta(2234);
		
		conta.transferir(50.0, conta2);
		
		System.out.printf("\nSaldo atual conta 1 R$: %.2f", conta.getSaldo());
		System.out.printf("\nSaldo atual conta 2 R$: %.2f", conta2.getSaldo());

	}

}
