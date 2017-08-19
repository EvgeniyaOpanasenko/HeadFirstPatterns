package model;

import model.flyBehavior.FlyBehavior;

/**
 * Created by User on 8/18/2017.
 */
public class RocketBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying like a rocket!!!");
    }
}
