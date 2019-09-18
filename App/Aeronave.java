public class Aeronave implements Imprimivel, Contavel {
    private String codigo;
    private String descricao;
    private int capacidade;
    private static int qtd = 0;

    public void imprimir(){

    }

    public Aeronave(String codigo, String descricao, int capacidade){
        this.capacidade = capacidade;
        this.codigo = codigo;
        this.descricao = descricao;
        qtd++;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public static int getQtd() {
        return qtd;
    }
}
