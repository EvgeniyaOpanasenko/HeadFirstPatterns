package model;

import model.flyBehavior.FlyWithWings;
import model.quackBehavior.QuackRealDuck;

/**
 * Created by User on 8/18/2017.
 */
public class RealDuck extends Duck {

    public RealDuck() {
        flyBehavior = new FlyWithWings();
        quakBehaviour = new QuackRealDuck();
    }

    @Override
    public void display() {
        System.out.println("I am a real duck!!!!");
    }
}
