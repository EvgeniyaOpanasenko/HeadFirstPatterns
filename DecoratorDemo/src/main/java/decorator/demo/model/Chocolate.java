package decorator.demo.model;

public class Chocolate extends CondimentDecorator {

    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
