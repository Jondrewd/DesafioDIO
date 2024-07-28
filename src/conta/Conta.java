public class Conta implements IntefaceConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(){}

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
    }

    @Override
    public void tranferencia(double valor, IntefaceConta conta) {
        this.saque(valor);
        conta.depositar(valor);
    }

    @Override
    public void Extrato() {
        System.out.println("Extrato da conta");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void getInfos(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
   
}
