public class ProdutoMobiliario extends Produto{
    private int peso;
    private Dimensao dim;
    public ProdutoMobiliario(String identificador, String nome, int preco_unitario, int stock, int peso,Dimensao dim){
        super(identificador, nome, preco_unitario, stock);
        this.peso = peso;
        this.dim = dim;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Dimensao getDim() {
        return dim;
    }

    public void setDim(Dimensao dim) {
        this.dim = dim;
    }
}
