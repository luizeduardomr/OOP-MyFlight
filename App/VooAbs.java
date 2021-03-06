import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

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

    public VooAbs(LocalDateTime dataHora, Duration duracao){
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
        String retorno = "Voo: Data e Hora: " + this.dataHora + ", Duração: " + this.duracao;
        if(this.rota != null){
            retorno = retorno + ", " + this.rota;
        }
        return retorno;
    }
}
