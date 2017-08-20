package decorator.demo.model;

public class Koriandr extends CondimentDecorator {

    Beverage beverage;

    public Koriandr(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Koriandr";
    }

    @Override
    public double cost() {
        return 2.20 + beverage.cost();
    }
}
