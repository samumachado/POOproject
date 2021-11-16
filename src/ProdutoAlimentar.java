public class ProdutoAlimentar extends Produto {
    private int num_cal_cem_gramas;
    private int percentagem_gordura;
    public int getNum_cal_cem_gramas() {
        return num_cal_cem_gramas;
    }
    public int getPercentagem_gordura() {
        return percentagem_gordura;
    }
    public void setNum_cal_cem_gramas(int num_cal_cem_gramas) {
        this.num_cal_cem_gramas = num_cal_cem_gramas;
    }
    public void setPercentagem_gordura(int percentagem_gordura) {
        this.percentagem_gordura = percentagem_gordura;
    }
    public ProdutoAlimentar(String identificador, String nome, int preco_unitario, int stock, int num_cal_cem_gramas, int percentagem_gordura) {
        super(identificador, nome, preco_unitario, stock);
        this.num_cal_cem_gramas = num_cal_cem_gramas;
        this.percentagem_gordura = percentagem_gordura;
    }
}
