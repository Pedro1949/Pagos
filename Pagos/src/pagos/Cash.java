
package pagos;


public class Cash implements Payment {
    
    private double cashAmount;
    private double deduction;

    @Override
    public String toString() {
        return "Cash{" + "cashAmount=" + cashAmount + ", deduction=" + deduction + '}';
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
        
    }
    public void calculateTotalAmount() {
        System.out.println("Estoy pagando con efectivo");
    
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
}
