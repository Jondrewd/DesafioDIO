import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import entity.Cliente;

public class App {
    public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("cliente 1");
		
		Conta contaCorrente = new ContaCorrente(cliente1);
		Conta contaPoupanca = new ContaPoupanca(cliente1);

		contaCorrente.depositar(600);
		contaCorrente.tranferencia(500, contaPoupanca);
		
		contaCorrente.Extrato();
		contaPoupanca.Extrato();
	}

}

