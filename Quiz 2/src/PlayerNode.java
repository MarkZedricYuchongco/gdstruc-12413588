public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;

    public PlayerNode(Player player) {
        this.player = player;
    }

    private PlayerNode prevPlayer;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public PlayerNode getPrevPlayer() {
        return prevPlayer;
    }

    public void setPrevPlayer(PlayerNode prevPlayer) {
        this.prevPlayer = prevPlayer;
    }

    @Override
    public String toString() {
        return player.toString();
    }

}
