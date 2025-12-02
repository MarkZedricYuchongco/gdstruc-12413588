import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnd = false;
        CardStack cards = new CardStack(5);
        CardStack discards = new CardStack(5);
        int totalCards = 0;
        int gameCommand = -1;
        int x = 0;
        int turns = 0;
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < 30; i++)
        {
            int s = (int)(Math.random() * suits.length);
            int v = (int)(Math.random() * value.length);
            cards.add(new Card(totalCards + 1, suits[s], value[v]));
            totalCards++;
        }

        while (!gameEnd) {
            x = (int)(Math.random() * 5) + 1;
            gameCommand = (int)(Math.random() * 3);

            System.out.println("--- Turn " + turns + " | " + (totalCards + 1) + " cards drawn ---\n");

            switch (gameCommand)
            {
                case 0: // draw x cards
                    System.out.println("Game command: Draw " + x + " cards.\n");
                    for (int i = 0; i < x; i++)
                    {
                        int s = (int)(Math.random() * suits.length);
                        int v = (int)(Math.random() * value.length);
                        cards.add(new Card(totalCards + 1, suits[s], value[v]));
                        totalCards++;
                    }
                    break;
                case 1: //discard x cards
                    System.out.println("Game command: Discard " + x + " cards.\n");
                    for (int i = 0; i < x; i++)
                    {
                        Card cardToMove = cards.peek();
                        discards.add(cards.peek());
                        cards.remove();
                    }
                    break;
                case 2: //pick up x cards from discard pile
                    if (discards.size() <= 0)
                    {
                        System.out.println("Game command: Take " + x + " cards from discard pile");
                        System.out.println("Unfortunately, the discard pile is currently empty.\n");
                        break;
                    } else {
                        System.out.println("Game command: Take " + x + " cards from discard pile\n");
                    }
                    for (int i = 0; i < x; i++)
                    {
                        if (discards.size() > 0) {
                            cards.add(discards.peek());
                            discards.remove();
                        } else {
                            System.out.println("Game command required you to take more cards than the pile had. Turn ended early.");
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }

            System.out.println("These are your current cards:");
            cards.printStack();
            System.out.println("\n\nYou are currently holding " + cards.size() + " cards.");
            System.out.println("There are " + discards.size() + " cards in the discard pile.");

            if (cards.size() <= 0)
                gameEnd  = true;

            turns++;

            if (gameEnd)
                System.out.println("Deck is empty, game has ended. Took " + turns + " turns.");
            if (!gameEnd)
                scanner.nextLine();
        }
    }
}