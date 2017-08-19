package model.flyBehavior;

/**
 * Created by User on 8/18/2017.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying using my wings!");
    }
}
