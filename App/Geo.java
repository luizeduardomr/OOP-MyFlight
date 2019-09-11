
public class Geo {
    private double longitude;
    private double latitude;


    public  Geo(int longitude, int latitude){
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

}
