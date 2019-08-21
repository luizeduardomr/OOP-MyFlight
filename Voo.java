import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
public class Voo
{
    private LocalDateTime dataHora;
    private Duration duracao; 

    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora(){
        return this.dataHora;
    }
}
