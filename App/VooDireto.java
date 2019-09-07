import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class VooDireto extends VooAbs{

        private Rota rota;

    public VooDireto(LocalDateTime local, Rota rota){
        super(local);
        this.rota = rota;
    }
    
    public Rota getRota(){
        return this.rota
    }

    public Duration getDuration(){
        return super.getDuration();
    }

    @Override
    public String toString(){
            return super.toString() + "Rotas: " + rotas;
    }
    }
