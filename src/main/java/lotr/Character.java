package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.Character;

@Getter
@Setter
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getPower() {
        return power;
    }

    public void decreaseHp(int amount) {
        this.hp -= amount;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Power: " + power + ", HP: " + hp + "]";
    }
}

