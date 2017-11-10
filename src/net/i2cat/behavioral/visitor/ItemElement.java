package net.i2cat.behavioral.visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor shoppingCartVisitor);

}
