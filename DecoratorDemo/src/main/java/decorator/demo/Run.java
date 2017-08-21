package decorator.demo;

import decorator.demo.model.Beverage;
import decorator.demo.model.Chocolate;
import decorator.demo.model.Espresso;
import decorator.demo.model.Koriandr;
import decorator.demo.shopping.cart.model.Basket;
import decorator.demo.shopping.cart.model.Item;
import decorator.demo.shopping.cart.model.PO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Run {
    public static void main(String[] args) {
      /*  Beverage beverage = new Espresso();

        System.out.println("beverage description "
                + beverage.getDescription()
                + "  cost = "
                + beverage.cost());

        beverage = new Chocolate(beverage);

        System.out.println("beverage description "
                + beverage.getDescription()
                + "total cost = "
                + beverage.cost());

        beverage = new Koriandr(beverage);

        System.out.println("beverage description "
                + beverage.getDescription()
                + "total cost = "
                + beverage.cost());*/
        SpringApplication.run(Run.class, args);

        Item basket = new Basket(0);

        System.out.println(basket.getDescription() + " price "
                + basket.cost());

        basket = new PO(basket, "Apple", 2.5, 1);
        basket = new PO(basket, "Apricot", 12.5, 2);
        basket = new PO(basket, "Melon", 8.5, 0.5);
        basket = new PO(basket, "Milk", 42.5, 2);

        System.out.println(basket.getDescription() + " price "
                + basket.cost());

    }

}
