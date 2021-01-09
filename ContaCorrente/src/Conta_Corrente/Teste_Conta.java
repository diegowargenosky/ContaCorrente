package Conta_Corrente;

public class Teste_Conta {

	public static void main(String[] args) {
		
		//* Usando o construtor com os parâmetros *//
		Conta conta = new Conta("0524", "Caixa Econômica", true, 0, 4000, 500);
	
		
		boolean saqueEfetuado = conta.realizarSaque(4500);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta: "+conta.getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		if (conta.usoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}
		else {
			System.out.println("Não está usando cheque especial");
		}
		
		

	}

}
