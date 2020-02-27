package orepaste;

public class Ore {
    private String name;
    private int count;
    private Double volume;

    public Ore(String name, int count, Double volume) {
        this.name = name;
        this.count = count;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public Double getVolume() {
        return volume;
    }

    public Double getSell() {
        return 0.0;
    }

    public Double getBuy() {
        return 0.0;
    }
}