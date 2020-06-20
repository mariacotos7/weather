import java.util.List;

public class Day {
    private String date;
    private double minTemp;
    private double msxTemp;
    private List<Record> records;

    public Day() {
    }

    public Day(String date, double minTemp, double maxTemp) {
        this.date = date;
        this.minTemp = minTemp;
        this.msxTemp = maxTemp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMsxTemp() {
        return msxTemp;
    }

    public void setMsxTemp(double msxTemp) {
        this.msxTemp = msxTemp;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
