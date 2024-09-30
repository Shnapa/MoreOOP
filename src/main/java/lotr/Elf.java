package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;
import lotr.kickstrategy.ElfKickStrategy;
import lotr.kickstrategy.KickStrategy;

@Getter
@Setter
public class Elf extends Character {
    private KickStrategy kickStrategy;

    public Elf() {
        super(10, 10);
        this.kickStrategy = new ElfKickStrategy();
    }

    public Elf(KickStrategy kickStrategy) {
        super(10, 10);
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
