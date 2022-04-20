import java.util.ArrayList;

public class Box implements Packable{

    private double maximumCapacity;
    private ArrayList<Packable> packables;

    public Box (double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() > maximumCapacity) {
            return;
        }
        this.packables.add(packable);
    }

    @Override
    public double weight() {
        double totalWeight = 0;

        for (Packable packable : this.packables) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight " + this.weight() + " kg";
    }

}
