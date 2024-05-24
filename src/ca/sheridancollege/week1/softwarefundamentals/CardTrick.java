/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author skaif
 * 
 * CardTrick class to perform card trick operations.
 * 
 * Modifier: MohammedKaif Shaikh
 * Student Number: 991766447
 * Date Modified: 24-05-2024
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int i = 0; i < magicHand.length; i++) {
            int value = rand.nextInt(13) + 1; 
            String suit = suits[rand.nextInt(4)];
            magicHand[i] = new Card(value, suit);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card (value and suit):");
        int userValue = scanner.nextInt();
        String userSuit = scanner.next();

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}

class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}

