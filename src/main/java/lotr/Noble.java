package lotr;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;
import lotr.kickstrategy.KickStrategy;

@Getter
@Setter
public class Noble extends Character {
    private KickStrategy kickStrategy;


    public Noble(int min, int max, KickStrategy kickStrategy) {
        super(new Random().nextInt(min, max + 1), new Random().nextInt(min, max + 1));
        this.kickStrategy = kickStrategy;
    }


    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}