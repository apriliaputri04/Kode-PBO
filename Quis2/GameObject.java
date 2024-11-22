package Quis2;

public class GameObject {
    protected String name;
    protected int posX, posY;

    public GameObject(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public void despawn() {
        System.out.println("[INFO] " + name + " has been removed from the game.");
    }
}