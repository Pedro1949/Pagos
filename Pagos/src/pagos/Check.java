
package pagos;


public class Check implements Payment {
    private String name;
    private String bankID;
    private boolean authorized;

    @Override
    public String toString() {
        return "Check{" + "name=" + name + ", bankID=" + bankID + ", authorized=" + authorized + ", checkNumber=" + checkNumber + '}';
    }
    
    private String checkNumber;

    public Check(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing check payment of $" + amount + " with check number " + checkNumber);
        
    }
    
    public void calculateTotalAmount() {
        System.out.println("Estoy pagando con cheque");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}