import model.Duck;
import model.RealDuck;
import model.RocketBehavior;
import model.ToyDuck;

/**
 * Created by User on 8/18/2017.
 */
public class TestDucks {
    public static void main(String[] args) {
        Duck toy = new ToyDuck();
        toy.performFly();
        toy.performQuack();
        toy.display();

        toy.setFlyBehavior(new RocketBehavior());

        toy.performFly();

        Duck realDuck = new RealDuck();
        realDuck.performFly();
        realDuck.performQuack();
        realDuck.display();
    }
}
