public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    @Override
    public void Extrato(){
        System.out.println("Extrato da conta Corrente");
        super.getInfos();
    }
}

