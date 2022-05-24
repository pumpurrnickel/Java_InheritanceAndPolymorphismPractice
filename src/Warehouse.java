public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {

        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }

    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if(amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double maximum = this.balance;
            this.balance = 0.0;
            return maximum;
        }
        this.balance = this.balance - amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }


}