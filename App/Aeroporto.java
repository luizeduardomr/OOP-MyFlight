import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
public class Aeroporto
{
    private String codigo;
    private String nome;
    private Geo local;

    public Aeroporto(String codigo, String nome, Geo local){
        this.codigo =codigo;
        this.nome = nome;
        this.local = local;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public Geo getLocal(){return this.local; }

    public String toString(){
        return "Aeroporto de " + this.nome + " (" + this.codigo + "), Geo Localização: " + this.local;
    }
}