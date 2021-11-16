public class Cliente {
    private String nome;
    private String morada;
    private String email;
    private int nTelefone;
    private Data data;
    public Cliente(String nome,String email, String morada, int nTelefone, Data data) {
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.nTelefone = nTelefone;
        this.data = data;

    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public int getnTelefone() {
        return nTelefone;
    }

    public Data getData() {
        return data;
    }
}
