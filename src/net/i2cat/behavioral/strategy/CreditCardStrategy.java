package net.i2cat.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpire;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpire) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpire = dateOfExpire;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying with ::Credit Card Strategy:: such quantity: " + amount);
    }
}
