import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
public class Aeroporto
{
    private String codigo;
    private String nome;
    private Geo local;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }
}