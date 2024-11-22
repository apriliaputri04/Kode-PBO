package Quis2;

public class Monster extends DamageableObject {
    private int threatLevel;
    private String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    public String makeNoise() {
        return "[MONSTER NOISE] " + name + " growls menacingly!";
    }

    @Override
    protected void onKilled() {
        System.out.println("[DEFEAT] " + name + " was killed and drops loot.");
        despawn();
    }
}