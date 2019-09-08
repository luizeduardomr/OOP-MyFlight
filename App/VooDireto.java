import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class VooDireto extends VooAbs{


    public VooDireto(Rota origem, LocalDateTime datahora, Duration duracao) {
        super();
    }

    public Rota getRota(){
        return this.rota;
    }

    public Duration getDuration(){
        return super.getDuration();
    }

    @Override
    public String toString(){
            return super.toString() + "Rotas: " + rotas;
    }
    }
