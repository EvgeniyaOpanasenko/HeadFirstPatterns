package decorator.demo.shopping.cart.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasketDecorator extends Item {

    public abstract String getDescription();
}
