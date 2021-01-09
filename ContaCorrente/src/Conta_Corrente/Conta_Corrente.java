package Conta_Corrente;

import java.util.Scanner;

public class Conta_Corrente {
	public Scanner sc = new Scanner(System.in);
	
	

	public String numero;
	public String agencia;
	public boolean especial;
	public double valorEspecialUsado;
	public double saldo;
	public double limiteEspecial;

	
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
