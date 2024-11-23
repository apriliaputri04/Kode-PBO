package Quis2;

public class Demo {
    public static void main(String[] args) {
        // Create a Player and a Monster
        Player player = new Player("Hero", 10, 20, 100, 3);
        Monster monster = new Monster("Goblin", 15, 25, 50, 5, "Green");

        // Start the game scenario
        System.out.println("==============================================");
        System.out.println("[SCENARIO] " + player.name + " encounters " + monster.name + "!");
        System.out.println(monster.makeNoise());
        System.out.println("=============================================");

        // Combat simulation
        System.out.println("[ACTION] Player attacks the monster.");
        monster.takeDamage(30); // Player attacks the monster
        monster.takeDamage(25); // Player attacks again, killing the monster

        System.out.println("============================================");
        System.out.println("[ACTION] Monster attacks the player.");
        player.takeDamage(50);  // Monster attacks the player
        player.takeDamage(60);  // Player gets killed

        System.out.println("============================================");
        System.out.println("[ACTION] Player takes critical damage.");
        player.takeDamage(100); // Player loses all lives

        System.out.println("============================================");
        System.out.println("[GAME END]");
    }
}