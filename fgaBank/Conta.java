package fgaBank;

public class Conta {

	private int agencia;
	private int numConta;
	protected double saldo;
	private PessoaHeranca titular;

	public Conta() {

	}

	public Conta(int agencia, int numConta, PessoaHeranca titular) {
		this.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = 0;

	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;			
		}		
		
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta destinatario) {
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		
		return false;
	}

	public PessoaHeranca getTitular() {
		return titular;
	}

	public void setTitular(PessoaHeranca titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

}
