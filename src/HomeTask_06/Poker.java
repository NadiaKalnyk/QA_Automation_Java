package HomeTask_06;

public class Poker {
    public  static  void main(String[] args) {
        PokerMachine machine = new PokerMachine();
        Deck deck = machine.createDeck();

        machine.shuffleDeck(deck);
        machine.serveCardsToPlayer(5, deck);
    }
}
