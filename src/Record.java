public class Record {
    private int x;
    private int y;
    private double latitude;
    private double longitude;
    private double pressure;
    private double temperature;

    public Record() {
    }

    public Record(int x, int y, double latitude, double longitude, double pressure, double temperature) {
        this.x = x;
        this.y = y;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Record{" +
                "x=" + x +
                ", y=" + y +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                '}';
    }
}
