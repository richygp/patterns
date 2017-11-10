package net.i2cat.behavioral.chainresponsability;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50) {
            int quantity = currency.getAmount() / 50;
            int rest = currency.getAmount() % 50;
            System.out.println("Dispensing " + quantity + " 50$ note");
            if(rest != 0) {
                this.dispenseChain.dispense(new Currency(rest));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
