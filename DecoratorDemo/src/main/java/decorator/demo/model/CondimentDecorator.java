package decorator.demo.model;

import decorator.demo.model.Beverage;


public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
