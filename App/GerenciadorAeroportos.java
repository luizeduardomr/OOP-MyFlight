import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class GerenciadorAeroportos
{
    private ArrayList<Aeroporto> listaAeroportos;

    public GerenciadorAeroportos(){
        listaAeroportos = new ArrayList();
    }

    public void adicionar(Aeroporto aero){
        listaAeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return listaAeroportos;
    }

    public ArrayList<Aeroporto> buscarPorCodigo(String codigo){  //Check if LocalDateTime can be used instead of LocalDate
        ArrayList<Aeroporto> lista = new ArrayList();
        for (Aeroporto aero : listaAeroportos) {
            if(aero.getCodigo() == codigo){
                lista.add(aero);
            }
        }
        return lista;
    }
}