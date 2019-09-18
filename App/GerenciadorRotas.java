import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas(){
        return rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
        ArrayList<Rota> lista = new ArrayList();
        for (Rota rota : rotas) {
            if(rota.getOrigem().equals(orig)){
                lista.add(rota);
            }
        }
        return lista;
    }
    public void ordenaCiaAerea() {
        Collections.sort(rotas);
    }
}
