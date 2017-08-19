package model;

import model.flyBehavior.FlyNoWay;
import model.quackBehavior.SquekBehavior;

/**
 * Created by User on 8/18/2017.
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        quakBehaviour = new SquekBehavior();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a toy a duck!!");
    }

}
