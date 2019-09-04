import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class GerenciadorAeroportos
{
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList();
    }

    public void adicionar(Aeroporto aero){
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return aeroportos;
    }

    public ArrayList<Aeroporto> buscarPorCodigo(String codigo){  //Check if LocalDateTime can be used instead of LocalDate
        ArrayList<Aeroporto> lista = new ArrayList();
        for (Aeroporto aero : aeroportos) {
            if(aero.getCodigo().equals(codigo)){
                lista.add(aero);
            }
        }
        return lista;
    }
}