
public class DeckTest {

	public static void main(String[] args) {
		DeckOfCards myDeck = new DeckOfCards();
		myDeck.shuffle();
		myDeck.printHand(myDeck.getPokerHand());

	}

}
