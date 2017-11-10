package net.i2cat.behavioral.chainresponsability;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10) {
            int quantity = currency.getAmount() / 10;
            int remaining = currency.getAmount() % 10;
            System.out.println("Dispensing " + quantity + " 10$ note");
            if(remaining != 0) {
                this.dispenseChain.dispense(new Currency(remaining));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
