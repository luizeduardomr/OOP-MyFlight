
public class Geo {
    private double longitude;
    private double latitude;

    public void Geo(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String toString(){
        return "longitude: " + this.longitude + ", latitude: " + this.latitude;
    }

}
