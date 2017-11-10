package net.i2cat.behavioral.chainresponsability;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain c1;

    public ATMDispenseChain() {
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atm = new ATMDispenseChain();
        while(true) {
            int amount;
            System.out.println("Enter amount to dispose: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 10 != 0) {
                System.out.println("Quantity must be multiple of 10.");
                return;
            }
            atm.c1.dispense(new Currency(amount));
        }
    }
}