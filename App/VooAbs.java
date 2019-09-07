import java.time.LocalDate;
import java.time.LocalDateTime;
public abstract class VooAbs
{
    private LocalDateTime dataHora;
    private Duration duracao;
    private Rota rota;

    public VooAbs(LocalDateTime dataHora){
        this.dataHora = dataHora;
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
}
