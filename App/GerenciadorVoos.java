import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class GerenciadorVoos
{
    private ArrayList<Voo> listaVoos;

    public GerenciadorVoos(){
        listaVoos = new ArrayList();
    }

    public void adicionar(Voo voo){
        listaVoos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return listaVoos;
    }

    public ArrayList<Voo> buscarData(LocalDateTime data){  //Check if LocalDateTime can be used instead of LocalDate
        ArrayList<Voo> lista = new ArrayList();
        for (Voo voo : listaVoos) {
            if(voo.getDataHora() == data){
                lista.add(voo);
            }
        }
        return lista;
    }
}
