package fgaBank;

public class Conta {

	private int agencia;
	private int numConta;
	private double saldo;
	private String titular;

	public Conta() {

	}

	public Conta(int agencia, int numConta, String titular) {
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

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
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
