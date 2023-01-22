package HomeTask_06;

public class Deck {

    private int noOfCards = 52;

    private Card[] deck = new Card[noOfCards];
    private int inIndex = 0;
    private int outIndex = 0;

    public void addCard(Card card) {
        if (!(inIndex >= noOfCards)) {
            deck[inIndex++] = card;
        }
    }

    public Card getCard(int i) {
        return deck[i];
    }

    public void  setCard(int index, Card card) {
        deck[index] = card;
    }
}
