package io.moster.strategy;

import io.moster.strategy.duck.Duck;
import io.moster.strategy.duck.MallardDuck;
import io.moster.strategy.duck.ModelDuck;
import io.moster.strategy.fly.FlyNoWay;
import io.moster.strategy.fly.FlyRocketPowered;
import io.moster.strategy.quack.MuteQuack;

/**
 * This simulator applies the STRATEGY design pattern.
 * <p>
 * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 * <p>
 * - Freeman, Eric. Head First Design Patterns (p. 79). O'Reilly Media. Kindle Edition.
 *
 * @author Jalo Moster <jlvmoster@gmail.com>
 * @version 1.0
 * @since 10/8/2020
 */
public class DuckSimulator {
    public static void main(String[] args) {
        System.out.println("Starting simulator...");
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("Changing Mallard behaviors...");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
        mallard.performFly();

        System.out.println("Creating duck model...");
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        System.out.println("Changing Model fly behavior...");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
