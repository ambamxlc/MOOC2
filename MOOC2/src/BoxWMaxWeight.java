import java.util.ArrayList;

public class BoxWMaxWeight extends Box {
    private int capacity;
    private ArrayList<Items> items;

    public BoxWMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Items item) {
        if (item.getWeight() <= this.capacity) {
            this.items.add(item);
            this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Items item) {
        return (this.items.contains(item));
    }
}