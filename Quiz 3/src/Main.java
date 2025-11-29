import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turnCount = 0;
        int gameCount = 0;
        int totalPlayers = 0;

        System.out.println("Queue start:");

        ArrayQueue queue = new ArrayQueue(5);
        while (gameCount < 10) {
            turnCount++;
            System.out.println("\n\n\n--- Turn " + (turnCount) + " | Game Count: " + gameCount + " ---");
            System.out.println("Press ENTER to continue");

            int x = (int)(Math.random() * 7) + 1; //randomize from 1 to 7

            for (int i = 0; i < x; i++) { //add player x times
                queue.add(new Player(totalPlayers + 1, "RealName_Online", 100));
                totalPlayers++;
            }



            if (queue.size() >= 5) {
                System.out.println("Before popping:");
                queue.printQueue();
                System.out.println("\nPop first 5 players:");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Removed " + queue.remove());
                }
                gameCount++;
                System.out.println("\nAfter popping:");
            } else {
                System.out.println("Current Queue:");
            }

            queue.printQueue();

            scanner.nextLine();

        }

        System.out.println("Completed queueing, games created: " + gameCount);
    }
}