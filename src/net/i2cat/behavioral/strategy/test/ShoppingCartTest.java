package net.i2cat.behavioral.strategy.test;

import net.i2cat.behavioral.strategy.CreditCardStrategy;
import net.i2cat.behavioral.strategy.Item;
import net.i2cat.behavioral.strategy.PaypalStrategy;
import net.i2cat.behavioral.strategy.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("ABC1234", 40);
        Item item2 = new Item("DEF1234", 10);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("mymail@paypal.com", "pasguor"));
        shoppingCart.pay(new CreditCardStrategy("Ricardo", "1234-5678-9012-3456",
                "123", "Aug-19"));
    }
}
