import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item temp : this.items) {
            sum += temp.getWeight();
        }
        if (sum + item.getWeight() > capacity) {
            return;
        }
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }
}
