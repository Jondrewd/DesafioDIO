public class App {
    public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("cliente 1");
		
		Conta contaCorrente = new ContaCorrente(cliente1);
		Conta contaPoupanca = new ContaPoupanca(cliente1);

		contaCorrente.depositar(100);
		contaCorrente.tranferencia(100, contaPoupanca);
		
		contaCorrente.Extrato();
		contaPoupanca.Extrato();
	}

}

