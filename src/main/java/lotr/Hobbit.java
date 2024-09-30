package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;
import lotr.kickstrategy.HobbitKickStrategy;
import lotr.kickstrategy.KickStrategy;

@Getter
@Setter
public class Hobbit extends Character {
    private KickStrategy kickStrategy;

    public Hobbit() {
        super(0, 3);
        this.kickStrategy = new HobbitKickStrategy();
    }

    public Hobbit(KickStrategy kickStrategy) {
        super(0, 3);
        this.kickStrategy = kickStrategy;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
    
    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}
