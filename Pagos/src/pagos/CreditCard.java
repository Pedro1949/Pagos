
package pagos;


public class CreditCard implements Payment {

    @Override
    public String toString() {
        return "CreditCard{" + "name=" + name + ", type=" + type + ", authorized=" + authorized + ", cardNumber=" + cardNumber + ", expiryDate=" + expiryDate + ", cvv=" + cvv + '}';
    }
    private String name;
    private String type;
    private boolean authorized;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " with card number " + cardNumber);
       
    }
   
    public void calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de crédito");
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}