import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class VooVariasEscalas extends Voo{

        private ArrayList<Rota> rotas;

    public VooVariasEscalas(Rota r, LocalDateTime l , Duration d){
        super(r, l, d); // chama o construtor de Voo
        this.rotas  = new ArrayList();
        this.rotas.add(r);
    }

    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    public Rota getRotaFinal(){
        return rotas.get(rotas.size() -1);
    }

    @Override
    public String toString(){
            return super.toString() + "Rotas: " + rotas;
    }
    }
