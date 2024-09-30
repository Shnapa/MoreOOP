package lotr.kickstrategy;

import lotr.Character;

public class KingKickStrategy extends KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        // The King deals a random amount of damage between 0 and the King's power
        int damage = (int) (Math.random() * attacker.getPower());
        defender.setHp(defender.getHp() - damage);
        System.out.println(attacker.getClass().getSimpleName() + " deals " + damage + " damage to " + defender.getClass().getSimpleName() + "!");
    }
}