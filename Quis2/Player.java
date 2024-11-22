package Quis2;

public class Player extends DamageableObject {
    private int score;
    private int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = livesRemaining;
    }

    public void increaseScore(int points) {
        score += points;
        System.out.println("[SCORE] " + name + " earned " + points + " points. Total score: " + score);
    }

    @Override
    protected void onKilled() {
        livesRemaining--;
        System.out.println("[DEATH] " + name + " was killed. Lives remaining: " + livesRemaining);
        if (livesRemaining <= 0) {
            System.out.println("[GAME OVER] " + name + " is out of the game!");
            despawn();
        } else {
            health = maxHealth; // Revive the player
            System.out.println("[RESPAWN] " + name + " has respawned with full health.");
        }
    }
}