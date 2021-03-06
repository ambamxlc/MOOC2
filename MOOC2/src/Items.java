import java.util.Objects;

public class Items {
    private String name;
    private int weight;

    public Items(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Items(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
}