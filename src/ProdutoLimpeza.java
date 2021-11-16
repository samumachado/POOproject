public class ProdutoLimpeza extends Produto {
    private int grau_toxicidade;
    public int getGrau_toxicidade() {
        return grau_toxicidade;
    }
    public void setGrau_toxicidade(int grau_toxicidade) {
        this.grau_toxicidade = grau_toxicidade;
    }
    public ProdutoLimpeza(String identificador, String nome, int preco_unitario, int stock, int grau_toxicidade) {
        super(identificador, nome, preco_unitario, stock);
        this.grau_toxicidade = grau_toxicidade;
    }
}
