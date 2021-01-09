package Conta_Corrente;

public class Conta {
	
	private String numero;
	private String agencia;
	private	 boolean especial;
	private double valorEspecialUsado;
	private double saldo;
	private double limiteEspecial;
	
	
	
	public Conta(String numero, String agencia, boolean especial, double valorEspecialUsado, double saldo,
			double limiteEspecial) {
		
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
	}



	public Conta() {
		
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getAgencia() {
		return agencia;
	}



	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}



	public boolean isEspecial() {
		return especial;
	}



	public void setEspecial(boolean especial) {
		this.especial = especial;
	}



	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}



	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getLimiteEspecial() {
		return limiteEspecial;
	}



	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	
	
	      //* Métodos *//
	public boolean realizarSaque(double quantiaSacar) {

		// * Verifica se Tem saldo na conta *//
		if (saldo >= quantiaSacar) {

			saldo -= quantiaSacar;
			return true;
		} else { // * Se não tem saldo na conta *//

			if (especial) { // * Verificar se o limite especial tem saldo *//

				double limite = limiteEspecial + saldo;
				if (limite >= quantiaSacar) {
					saldo -= quantiaSacar;
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		}
	}

	public void depositar(double valorDepositado) {

		saldo += valorDepositado;
	}

	public void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}

	public boolean usoChequeEspecial() {
		return saldo < 0; //* Retorna true se o saldo normal estiver zerado *// 

	}

	
	
	
	

}
