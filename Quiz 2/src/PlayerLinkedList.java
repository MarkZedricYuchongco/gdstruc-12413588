public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode tail;
    private int listSize = 0;

    public  void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        if (head == null) {
            head = playerNode;
            tail = playerNode;
        } else {
            playerNode.setNextPlayer(head);
            head.setPrevPlayer(playerNode);
            head = playerNode;
        }
        listSize += 1;
    }

    public void addToBack(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        if (tail == null) {
            head = playerNode;
            tail = playerNode;
        } else {
            playerNode.setPrevPlayer(tail);
            tail.setNextPlayer(playerNode);
            tail = playerNode;
        }
        listSize += 1;
    }

    public void removeFront() {
        if (head == null)
        {
            System.out.println("List is already empty.");
            return;
        }

        PlayerNode removedNode = head;
        if (head.getNextPlayer() == null) {
            head = null;
            tail = null;
        } else {
            head = head.getNextPlayer();
            head.setPrevPlayer(null);
        }

        removedNode.setNextPlayer(null);
        listSize -= 1;
        System.out.println("Removed " + removedNode);
        }

    public void printListForward() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void printListBackward() {
        PlayerNode current = tail;
        System.out.print("TAIL -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getPrevPlayer();
        }
        System.out.println("null");
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer() == player)
            {
                return true;
            } else {
                current = current.getNextPlayer();
            }
        }
        return  false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int currentIndex = 0;
        while (current != null) {
            if (current.getPlayer() == player)
            {
                return currentIndex;
            } else {
                current = current.getNextPlayer();
            }
            currentIndex++;
        }
        System.out.println("Player does not exist");
        return -1;
    }
}
