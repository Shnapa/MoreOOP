package lotr;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;
import lotr.kickstrategy.KickStrategy;
import lotr.kickstrategy.KnightKickStrategy;

@Getter
@Setter
public class Knight extends Character {
    private KickStrategy kickStrategy;

    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);
        this.kickStrategy = new KnightKickStrategy();
    }

    public Knight(KickStrategy kickStrategy) {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);
        this.kickStrategy = kickStrategy;
    }

    
    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}
