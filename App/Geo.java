
public class Geo {
    private int longitude;
    private int latitude;


    public  Geo(int longitude, int latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String toString(){
        return "longitude: " + this.longitude + ", latitude: " + this.latitude;
    }

}
