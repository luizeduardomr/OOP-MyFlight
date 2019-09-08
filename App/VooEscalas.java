import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class VooEscalas extends VooAbs{

        private ArrayList<Rota> rotas;

    public VooEscalas(Rota rota, LocalDateTime dataHora, Duration duracao){
        super(rota, dataHora, duracao);
    }

    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    public Rota getRota(){
        return rotas.get(rotas.size() -1);
    }

    public void adicionarRota(Rota rota){
        rotas.add(rota);
    }

    public Duration getDuration(){
        return super.getDuracao();
    }

    @Override
    public String toString(){
            return super.toString() + "Rotas: " + rotas;
    }
    }
