import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
public class Voo
{
    private LocalDateTime dataHora;
    private Duration duracao;
    private Rota rota;

    public Voo(Rota rota, LocalDateTime dataHora, Duration duracao){
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

    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora(){
        return this.dataHora;
    }
}
