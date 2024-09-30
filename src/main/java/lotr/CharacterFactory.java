package lotr;

import java.util.Random;

import lotr.Character;

public class CharacterFactory {
    private Random random = new Random();
    private String[] characterClasses = { "lotr.Hobbit", "lotr.Elf", "lotr.King", "lotr.Knight" };

    public Character createCharacter() {
        int index = random.nextInt(characterClasses.length);
        String className = characterClasses[index];

        try {
            Class<?> clazz = Class.forName(className);
            return (Character) clazz.getDeclaredConstructor(int.class, int.class).newInstance(5, 15); // Adjust constructor params as needed
        } catch (Exception e) {
            throw new RuntimeException("Character creation failed", e);
        }
    }
}

