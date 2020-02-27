package orepaste;

public class Ore {
    private String name;
    private int count;
    private double ratio;

    public Ore(String name, int count, double ratio) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getVolume() {
        return count * ratio;
    }

    public Double getSell() {
        return 0.0;
    }

    public Double getBuy() {
        return 0.0;
    }
}