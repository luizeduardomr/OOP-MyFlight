import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList();
    }

    public void adicionar(Aeronave aero){
        aeronaves.add(aero);
    }

    public ArrayList<Aeronave> listarTodas(){
        return aeronaves;
    }

    public ArrayList<Aeronave> buscarPorCodigo(String codigo){  //Check if LocalDateTime can be used instead of LocalDate
        ArrayList<Aeronave> lista = new ArrayList();
        for (Aeronave aero : aeronaves) {
            if(aero.getCodigo().equals(codigo)){
                lista.add(aero);
            }
        }
        return lista;
    }

    public void ordenaDescricao() {
        Collections.sort(aeronaves);
    }
}
