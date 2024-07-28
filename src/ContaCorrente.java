public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    @Override
    public void Extrato(){
        System.out.println("Extrato da conta Corrente");
        super.getInfos();
    }
}
