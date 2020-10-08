package io.moster.strategy.duck;

import io.moster.strategy.fly.FlyNoWay;
import io.moster.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
