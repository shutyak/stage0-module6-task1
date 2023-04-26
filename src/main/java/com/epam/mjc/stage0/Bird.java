package com.epam.mjc.stage0;

public class Bird extends Animal{
    //Bird: color - blue, numberOfPaws - 2, hasFur - false.
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Moreover, it has 2 wings and can fly.";
    }
}
