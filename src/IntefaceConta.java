public interface IntefaceConta {

    void saque(double valor);

    void depositar(double valor);

    void tranferencia(double valor, IntefaceConta conta);

    void Extrato();
}
