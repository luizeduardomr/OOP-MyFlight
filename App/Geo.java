
public class Geo {
    private double longitude;
    private double latitude;


    public  Geo(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String toString(){
        return "longitude: " + this.longitude + ", latitude: " + this.latitude;
    }



    public static double distancia(double latX, double latY, double longX, double longY) {

        //raio Terra
        double raioTerra = 6371;

        //converte para radianos as coordenadas dos aeroportos de origem e destino
        double latitudeRadX = latX;
        double longitudeRadX = longX;
        double latitudeRadY = latY;
        double longitudeRadY = longY;

        //calcula senos e cossenos
        double senoLatitudes = Math.sin((latitudeRadX-latitudeRadY)*1.0)/2;
        double senoLongitudes = Math.sin((longitudeRadX-longitudeRadY)*1.0)/2;
        double cossenoLatOrigem = Math.cos(latitudeRadX);
        double cossenoLatDestino = Math.cos(latitudeRadY);

        //calcula a parte interna da raiz da fórmula de haversine
        double raiz = senoLatitudes*senoLatitudes + senoLongitudes*senoLongitudes*cossenoLatOrigem*cossenoLatDestino;

        //calcula a distância
        double distancia = 2*raioTerra*Math.asin(Math.sqrt(raiz));

        return distancia;
    }


    public static double distancia(Geo origem, Geo destino) {

        //raio Terra
        double raioTerra = 6371;

        //converte para radianos as coordenadas dos aeroportos de origem e destino
        double latitudeRadOrigem = Math.toRadians(origem.getLatitude());
        double longitudeRadOrigem = Math.toRadians(origem.getLongitude());
        double latitudeRadDestino = Math.toRadians(destino.getLatitude());
        double longitudeRadDestino = Math.toRadians(destino.getLongitude());

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

    public double distancia(Geo geoLocal) {
        Geo dados = new Geo(this.longitude, this.latitude);
        return Geo.distancia(dados, geoLocal);
    }

}
