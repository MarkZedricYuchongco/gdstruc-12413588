import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Player> playerList = new ArrayList<>();
//
//        playerList.add(new Player(1, "Asuna", 100));
//        playerList.add(new Player(2, "LethalBacon", 205));
//        playerList.add(new Player(3, "HPDeskJet", 34));
//
////        System.out.println(playerList.get(1));
//
//        playerList.add(2, new Player(553, "Arctis", 55));;
//
//        playerList.remove(2);
//
////        System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));
//        System.out.println(playerList.indexOf(new Player(2, "LethalBacon", 205)));
////        //java 8 forEach
////        playerList.forEach(player -> System.out.println(player));
//
//        for (Player p : playerList)
//        {
//            System.out.println(p);
//        }

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskJet = new Player(3, "HPDeskJet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.removeFront(); // test empty list

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskJet);

        playerLinkedList.printListForward(); //print list starting from head
        playerLinkedList.printListBackward(); //print list starting from tail

        //check if asuna exists in the list and the index associated with
        System.out.println(playerLinkedList.contains(asuna));
        System.out.println(playerLinkedList.indexOf(asuna));

        playerLinkedList.removeFront(); //remove first element in the list

        playerLinkedList.printListForward(); //print list starting from head, after removing the first element
        playerLinkedList.printListBackward(); //print list starting from tail, after removing the first element

        //check if asuna exists in the list and the index associated with, after removing HPDeskJet (front)
        System.out.println(playerLinkedList.contains(asuna));
        System.out.println(playerLinkedList.indexOf(asuna));
    }
}