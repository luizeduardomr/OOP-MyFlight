import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;

    public GerenciadorCias(){

        empresas = new ArrayList();
    }

    public void adicionar(CiaAerea cia){
        empresas.add(cia);
    }

    public ArrayList<CiaAerea> listarTodas(){
        return empresas ;
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

    public void carregaDados() throws IOException {
        Path path2 = Paths.get("airlines.dat");
        try (Scanner sc = new Scanner(Files.newBufferedReader(path2, Charset.forName("utf8")))) {
            sc.useDelimiter("[;\n]"); // separadores: ; e nova linha
            String header = sc.nextLine(); // pula cabeçalho
            String airline_id, airline_name;
            while (sc.hasNext()) {
                airline_id = sc.next();
                airline_name = sc.next();
                System.out.format("%s - %s", airline_id, airline_name);
            }
        }
        catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
