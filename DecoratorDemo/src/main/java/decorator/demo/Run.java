package decorator.demo;

import decorator.demo.model.Beverage;
import decorator.demo.model.Chocolate;
import decorator.demo.model.Espresso;
import decorator.demo.model.Koriandr;

/**
 * Created by User on 8/20/2017.
 */
public class Run {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

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
                + beverage.cost());
    }

}
