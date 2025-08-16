public class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount;  // new variable to track items

    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++; // increment each time a purchase is recorded
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0; // reset after transaction
        return change;
    }

    // (a) Instance method to return item count
    public int getItemCount() {
        return itemCount;
    }

    // Assume toString is implemented like this:
    @Override
    public String toString() {
        return "Purchase: " + purchase + ", Payment: " + payment + ", Items: " + itemCount;
    }

    // (b) Static method to count total items across multiple registers
    public static int countTotal(CashRegister[] registers) {
        int total = 0;
        for (CashRegister reg : registers) {
            total += reg.getItemCount();
        }
        return total;
    }
}
