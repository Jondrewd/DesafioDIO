import java.util.List;

public class Banco {
    
    private String user;
    private List<Conta> listaContas;
    
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public List<Conta> getContas() {
        return listaContas;
    }
    public void setContas(List<Conta> contas) {
        this.listaContas = contas;
    }

    
}
