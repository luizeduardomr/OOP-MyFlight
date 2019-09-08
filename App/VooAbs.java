import java.time.LocalDate;
import java.time.LocalDateTime;
public abstract class VooAbs
{
    private LocalDateTime dataHora;
    private Duration duracao;
    private Rota rota;

    public VooAbs(Rota rota, LocalDateTime dataHora, Duration duracao){
        this.rota = rota;
        this.dataHora = dataHora;
        this.duracao = duracao;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }

    public LocalDateTime getDataHora(){
        return this.dataHora;
    }

    public String toString(){
        return "Voo: " + this.dataHora + ", " + this.duracao + ", " + this.rota;
    }
}
