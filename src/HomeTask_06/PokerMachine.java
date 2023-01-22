package HomeTask_06;

import java.util.Random;

public class PokerMachine {
    public Deck createDeck() {
        String[] suites = {"Heards", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Deck deck = new Deck();
        for (String suit: suites) {
            for (String value: values) {
                Card card = new Card (value, suit);
                deck.addCard(card);
            }
        }
        return deck;
    }
     public void shuffleDeck (Deck deck) {
         Random random = new Random();
         for (int i = 0; i < 100; i++) {
             int in = random.nextInt(52);
             int out = random.nextInt(52);

             Card tmpCard = deck.getCard(in);
             deck.setCard(in, deck.getCard(out));
             deck.setCard(out, tmpCard);
         }
     }
     public void serveCardsToPlayer (int noOfPlayers, Deck deck) {
         int index = 0;
         for (int round = 1; round <= 5; round++) {
             System.out.println("Round " + round);
             for (int player = 1; player <= noOfPlayers; player++) {
                 System.out.println(String.format("Player %d gets card %s%n", player, deck.getCard(index++)));
             }
             System.out.println("");
         }
     }
}
