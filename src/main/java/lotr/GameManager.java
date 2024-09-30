package lotr;

import java.util.Scanner;

import lotr.Character;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1 + " vs " + c2);
        Scanner scanner = new Scanner(System.in);

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("\nPress Enter to continue the fight...");
            scanner.nextLine();

            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2 + " has been defeated!");
                break;
            }

            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c1 + " has been defeated!");
                break;
            }
        }

        scanner.close();
    }
}

