import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;

    public GerenciadorCias(){
        empresas = new ArrayList();
    }

    public static void adicionar(CiaAerea cia){
        empresas.add(cia);
    }

    public static ArrayList<CiaAerea> listarTodas(){
        return empresas;
    }

    public ArrayList<CiaAerea> buscarPorCodigo(String cod){
        ArrayList<CiaAerea> lista = new ArrayList();
        for (CiaAerea cia : empresas) {
            if(cia.getCodigo().equals(cod)){
                lista.add(cia);
            }
        }
        return lista;
    }

    public ArrayList<CiaAerea> buscarPorNome(String nome){
        ArrayList<CiaAerea> lista = new ArrayList();
        for (CiaAerea cia : empresas) {
            if(cia.getNome().equals(nome)){
                lista.add(cia);
            }
        }
        return lista;
    }
}
