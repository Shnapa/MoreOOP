package lotr.kickstrategy;

import java.util.Random;

import lotr.Character;

public class NobleKickStrategy extends KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        Random random = new Random();
        int damage = random.nextInt(attacker.getPower()) + 1; // Ensure at least 1 damage
        System.out.println(attacker + " attacks " + defender + " and deals " + damage + " damage!");
        defender.decreaseHp(damage);
    }
}

