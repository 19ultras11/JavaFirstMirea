package ru.mirea.task2.nomer9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of players: ");
        int numPlayers = scanner.nextInt();
        int cardsPerPlayer = 5;
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int totalCards = suits.length * ranks.length;
        if(cardsPerPlayer * numPlayers > totalCards){
            System.out.println("Too many players");
        }

        String[] deck = new String[totalCards];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < totalCards; i++) {
            int randomIndex = i + (int) (Math.random() * (totalCards - i));
            String temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < numPlayers * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }

        scanner.close();
    }
}