public class Warehousing {

    private double capacity;
    private double balance;

    public Warehousing(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getBal() {
        return this.balance;
    }

    public double getCapac() {
        return this.capacity;
    }

    public double spaceLeft() {
        return this.capacity - this.balance;
    }

    public void forWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= spaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double fromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    public String toString() {
        return "balance is" + this.balance + ", space left over" + spaceLeft();
    }
}