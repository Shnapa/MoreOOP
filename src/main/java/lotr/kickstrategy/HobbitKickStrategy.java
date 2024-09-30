package lotr.kickstrategy;

import lotr.Character;

public class HobbitKickStrategy extends KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        // Hobbit does not deal damage but cries
        System.out.println(attacker.getClass().getSimpleName() + " cries!");
    }
}