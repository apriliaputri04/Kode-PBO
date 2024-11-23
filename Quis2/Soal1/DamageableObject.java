package Quis2;

public abstract class DamageableObject extends GameObject {
    protected int maxHealth;
    protected int health; // Changed to protected for subclass access

    public DamageableObject(String name, int posX, int posY, int maxHealth) {
        super(name, posX, posY);
        this.maxHealth = maxHealth;
        this.health = maxHealth; // Initialize health
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("[DAMAGE] " + name + " took " + damage + " damage. Health left: " + health);
        if (isDead()) {
            onKilled();
        }
    }

    protected abstract void onKilled();
}