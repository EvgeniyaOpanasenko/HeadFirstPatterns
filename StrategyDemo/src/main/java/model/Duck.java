package model;

import model.flyBehavior.FlyBehavior;
import model.quackBehavior.QuakBehaviour;

/**
 * Created by User on 8/18/2017.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuakBehaviour quakBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quakBehaviour.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All duck can swim, even toys!");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuakBehaviour getQuakBehaviour() {
        return quakBehaviour;
    }

    public void setQuakBehaviour(QuakBehaviour quakBehaviour) {
        this.quakBehaviour = quakBehaviour;
    }
}
