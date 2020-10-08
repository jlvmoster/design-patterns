package io.moster.strategy.duck;

import io.moster.strategy.fly.FlyBehavior;
import io.moster.strategy.quack.QuackBehavior;

public abstract class Duck {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void display() {
        System.out.println("I'm a real duck");
    }
}
