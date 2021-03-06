import java.util.ArrayList;

public class Rota implements Comparable<Rota>{
    private Aeroporto destino;
    private Aeroporto origem;
    private Aeronave aeronave;
    private CiaAerea ciaAerea;



    public  Rota(Aeroporto d, Aeroporto o, Aeronave a, CiaAerea c){
        this.destino = d;
        this.origem = o;
        this.aeronave = a;
        this.ciaAerea = c;
    }
    public Aeroporto getOrigem(){return origem;}
    public Aeroporto getDestino(){return destino;}
    public void setOrigem(Aeroporto origem){this.origem = origem;}
    public void setDestino(Aeroporto destino){this.destino = destino;}

    public Aeronave getAeronave(){return aeronave;}
    public void setAeronave(Aeronave aeronave){this.aeronave = aeronave;}


    public String toString(){
        return "Rota: origem: " + this.origem + ", destino: " + this.destino;
    }

    public int compareTo(Rota outraRota){
        return this.ciaAerea.getNome().compareTo(outraRota.ciaAerea.getNome());
    }
}
