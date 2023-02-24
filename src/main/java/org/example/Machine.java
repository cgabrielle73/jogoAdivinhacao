package org.example;

import java.util.Random;

public class Machine {
    private final Random generator = new Random();
    private final Integer randomNumber = generator.nextInt(51);

    public Machine() {}

    public Integer getRandomNumber() {
        return randomNumber;
    }
}
