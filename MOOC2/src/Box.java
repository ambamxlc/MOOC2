import java.util.ArrayList;

public abstract class Box {
    public abstract void add(Items item);

    public void add(ArrayList<Items> items) {
        for (Items item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Items item);
}