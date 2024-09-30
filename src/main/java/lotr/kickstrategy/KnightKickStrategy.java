package lotr.kickstrategy;

import java.util.Random;

import lotr.Character;

public class KnightKickStrategy extends KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        // Damage calculation from 1 to the attacker's power
        int damage = new Random().nextInt(attacker.getPower()) + 1; // Ensure at least 1 damage
        System.out.println(attacker + " attacks " + defender + " and deals " + damage + " damage!");
        defender.decreaseHp(damage); // Apply damage to the defender
    }
}
