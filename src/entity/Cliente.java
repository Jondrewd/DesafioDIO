package entity;
public class Cliente {
    public String nomeCliente;

    public Cliente(){}
    public String getNome(){
        return nomeCliente;
    }
    public void setNome(String nome){
        this.nomeCliente = nome;
    }
}
