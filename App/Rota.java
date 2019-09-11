public class Rota {
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



    public double calculaDistancia() {

        //raio Terra
        double raioTerra = 6371;

        //converte para radianos as coordenadas dos aeroportos de origem e destino
        double latitudeRadOrigem = Math.toRadians(origem.getLocal().getLatitude());
        double longitudeRadOrigem = Math.toRadians(origem.getLocal().getLongitude());
        double latitudeRadDestino = Math.toRadians(destino.getLocal().getLatitude());
        double longitudeRadDestino = Math.toRadians(destino.getLocal().getLongitude());

        //calcula senos e cossenos
        double senoLatitudes = Math.sin((latitudeRadOrigem-latitudeRadDestino)*1.0)/2;
        double senoLongitudes = Math.sin((longitudeRadOrigem-longitudeRadDestino)*1.0)/2;
        double cossenoLatOrigem = Math.cos(latitudeRadOrigem);
        double cossenoLatDestino = Math.cos(latitudeRadDestino);

        //calcula a parte interna da raiz da fórmula de haversine
        double raiz = senoLatitudes*senoLatitudes + senoLongitudes*senoLongitudes*cossenoLatOrigem*cossenoLatDestino;

        //calcula a distância
        double distancia = 2*raioTerra*Math.asin(Math.sqrt(raiz));

        return distancia;
    }


    public String toString(){
        return "Rota: origem: " + this.origem + ", destino: " + this.destino;
    }

}
