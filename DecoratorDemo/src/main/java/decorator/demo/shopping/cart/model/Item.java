package decorator.demo.shopping.cart.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String description = "Top level abstract item";
    //double total;

    // TODO move to service
    // part of Decorator structure
    public abstract double cost();

    public Item() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
