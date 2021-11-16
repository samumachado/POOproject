public class Dimensao {
    private int altura;
    private int largura;
    private int profundidade;
    public Dimensao(int altura, int largura, int profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }
    public int getAltura() {
        return altura;
    }
    public int getLargura() {
        return largura;
    }
    public int getProfundidade() {
        return profundidade;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }
}
