import java.util.Arrays;
import java.util.Random;

public class Deck {
	private final int NUM_TOTAL_CARDS = 52;
	private static Random rand = new Random();

	Card[] cards = new Card[NUM_TOTAL_CARDS];

	public Deck() {
		// populate cards array with Card (rank, suit) object
		// count : walks through cards
		// i : walks through suit
		// j : walks through rank
		int count = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 13; j++) {
				cards[count] = new Card(j, i);
				count++;
			}
		}
	}

	public Deck(int numCards) {
		super();
		cards = new Card[numCards];
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public Deck subDeck (int start, int end) {
		Deck subDeck = new Deck(end - start);
		
		for (int i = start, j = 0; i < end; i++) {
			// subset of cards
			subDeck.cards [j] = cards [i];
			j++;
		}
		return subDeck;
	}

	public void shuffCards() {
		for (int i = 0; i < cards.length; i++) {
			int randex = rand.nextInt(cards.length - 1);
			swapCard(i, randex);
		}
	}

	private void swapCard(int index1, int index2) {
		Card tmp = cards[index1];
		cards[index1] = cards[index2];
		cards[index2] = tmp;
	}
	
	// still need to write bubble sort

	@Override
	public String toString() {
//		return "Deck [NUM_TOTAL_CARDS=" + NUM_TOTAL_CARDS + ", cards=" + Arrays.toString(cards) + ", getCards()="
//				+ Arrays.toString(getCards()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			sb.append(cards[i].toString());
			sb.append(", ");
			if ((i % 6  == 0) && (i != 0 )) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

}
