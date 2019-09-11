import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class VooEscalas extends VooAbs{
        private ArrayList<Rota> rotas;

    public VooEscalas(LocalDateTime dataHora, Duration duracao){
        super(dataHora, duracao);
        rotas = new ArrayList<>();
    }

    public ArrayList<Rota> getRotas() {
        return this.rotas;
    }

    public Rota getRota(){
        return this.rotas.get(this.rotas.size() -1);
    }

    public void adicionarRota(Rota rota){
        this.rotas.add(rota);
    }

    public Duration getDuration(){
        return super.getDuracao();
    }

    @Override
    public String toString(){
            return super.toString() + " Rotas: " + rotas;
    }
    }
