import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class GerenciadorVoos
{
    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList();
    }

    public void adicionar(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    public ArrayList<Voo> buscarData(LocalDateTime data){  //Check if LocalDateTime can be used instead of LocalDate
        ArrayList<Voo> lista = new ArrayList();
        for (Voo voo : voos) {
            if(voo.getDataHora() == data){
                lista.add(voo);
            }
        }
        return lista;
    }
}
