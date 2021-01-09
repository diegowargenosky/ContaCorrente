package Conta_Corrente;

public class Teste_Conta_Corrente {

	public static void main(String[] args) {

	
		Conta_Corrente conta = new Conta_Corrente();

		conta.numero = "3456";
		conta.agencia = "Caixa";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0.0;
		conta.saldo = 1000;

		boolean saqueEfetuado = conta.realizarSaque(1500);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta: "+conta.saldo);
		} 
		else {
			System.out.println("Não foi possível realizar o saque, saldo insuficiente.");
		}
		conta.depositar(100);
		conta.consultarSaldo();
		
		if (conta.usoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}
		else {
			System.out.println("Não está usando cheque especial");
		}
		
	
	}
	

}
