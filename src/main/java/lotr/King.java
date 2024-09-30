package lotr;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;
import lotr.kickstrategy.KickStrategy;
import lotr.kickstrategy.KingKickStrategy;

@Getter
@Setter
public class King extends Character {
    private KickStrategy kickStrategy;

    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
        this.kickStrategy = new KingKickStrategy();
    }

    public King(KickStrategy kickStrategy) {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
        this.kickStrategy = kickStrategy;
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}
