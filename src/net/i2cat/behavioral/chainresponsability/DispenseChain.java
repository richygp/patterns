package net.i2cat.behavioral.chainresponsability;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);

}
