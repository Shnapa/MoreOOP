package lotr.kickstrategy;

import lotr.Character;

public class ElfKickStrategy extends KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (defender.getPower() < attacker.getPower()) {
            // Kill the weaker character
            defender.setHp(0);
        } else {
            // Decrease the defender's HP by 1
            defender.setHp(defender.getHp() - 1);
        }
    }
}
