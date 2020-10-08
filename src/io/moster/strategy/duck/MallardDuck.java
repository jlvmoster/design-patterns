package io.moster.strategy.duck;

import io.moster.strategy.fly.FlyWithWings;
import io.moster.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
