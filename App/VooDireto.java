import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class VooDireto extends VooAbs{


    public VooDireto(Rota origem, LocalDateTime datahora, Duration duracao) {
        super(origem, datahora, duracao);
    }

    public Rota getRota(){
        return super.getRota();
    }

    public Duration getDuration(){
        return super.getDuracao();
    }

    @Override
    public String toString(){
            return super.toString() + "Rotas: " + getRota();
    }
    }
