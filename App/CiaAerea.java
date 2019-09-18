public class CiaAerea implements Contavel {
    private static int qtd = 0;
    private String codigo;
    private String nome;

    public  CiaAerea(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        qtd++;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Cia Aerea: nome: " + nome + ", código: " + codigo;
    }

    public static int getQtd() {
        return qtd;
    }

}
