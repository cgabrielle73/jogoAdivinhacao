package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Machine machine = new Machine();
        User user;
        Integer chances = 3;
        Integer tryOut = 3;

        for(int i = 1; i <= chances; i++) {
            System.out.print("Enter your guess: ");
            Integer guess = sc.nextInt();

            user = new User(guess);
            user.setGuess(guess);

            if (machine.getRandomNumber().equals(user.getGuess())) {
                System.out.println("You got it!!!");
            } else {
                tryOut--;
                if(tryOut == 0) {
                    throw new RuntimeException("Game over!!!");
                }
                System.out.println("Try again! The number you typed is wrong.");
            }
        }

        sc.close();
    }
}