public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUsername(), ploo);
        hashtable.put(wardell.getUsername(), wardell);
        hashtable.put(deadlyJimmy.getUsername(), deadlyJimmy);
        hashtable.put(subroza.getUsername(), subroza);
        hashtable.put(annieDro.getUsername(), annieDro);

        hashtable.printHashtable();
        System.out.println(hashtable.get("Subroza"));

        hashtable.remove("Subroza");
        hashtable.printHashtable();
    }
}