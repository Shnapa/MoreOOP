package lotr.kickstrategy;

import lotr.Character;

public abstract class KickStrategy {
    public abstract void kick(Character whoKick, Character whoIsKicked);
}
