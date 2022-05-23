import java.util.ArrayList;

public class Herd implements Moveable {
    private ArrayList<Moveable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Moveable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Moveable critter : herd) {
            critter.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String allPositions = "";
        for (Moveable critter : herd) {
            allPositions += critter.toString() + "\n";
        }
        return allPositions;
    }
}