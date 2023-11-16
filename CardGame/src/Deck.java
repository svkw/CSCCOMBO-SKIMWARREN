
import java.util.Arrays;
import java.util.Random;

public class Deck {
	// DATA MEMBER
	private final int STD_NUM_CARDS_IN_DECK = 52;
	private static Random rand = new Random();
	Card[] cards = new Card[STD_NUM_CARDS_IN_DECK];

	// CONSTRUCTORS
	public Deck () {
		// to create Cards
		int count = 0;	// walks through card array, index for the card array
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				cards [count] = new Card(j, i);
				count++;
			}
		}
	}
	
	//make Cards
	public Deck (int numCard) {
		cards = new Card[numCard];
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	// METHODS
	//erroring.....
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int randIndex = rand.nextInt(cards.length);
				swapCards (i, randIndex);
		}
	}
	
	private void swapCards (int index1, int index2) {
		Card temp = cards[index1];
		cards[index1] = cards[index2];
		cards[index2] = temp;
	}

	// using static METHODS
//	public static void shuffle(Deck deck) {
//		// Cards[] cards = deck.cards;
//		Cards[] cards = deck.getCards();
//
//		Random rand = new Random();
//		for (int i = 0; i < cards.length; i++) {
//			int randIndex = rand.nextInt(cards.length);
//			Cards temp = cards[i];
//			cards[i] = cards[randIndex];
//			cards[randIndex] = temp;
//		}
//	}

//	public void bubblesort() {
//	for (int i=0; i < cards.length-1; i++) {
//		for (int j=1; j < cards.length-i; j++) {
//			if (cards[j-1].compareTo(cards[j]) > 0) {
//				//			    	  System.out.println("what is j in bubble : " + j);
//				swapCards(j-1, j);
//			}
//		}
//	}
//}
	
	//	@Override
	//	public String toString() {
	//		return "Current order of deck :\n" + Arrays.toString(cards);
	//	}

	//	public String toString() {
	//		String str = "";
	//		for (int i = 0; i < cards.length; i++) {
	//			str = str + "," + cards[i].toString();
	//		}
	//		return str;
	//		
	//	}

	// using StringBuilder class

	public Deck subDeck(int start, int end) {
		Deck subDeck = new Deck(end - start);
		for (int i = start, j = 0; i < end; i++) {
			subDeck.cards[j] = cards [i];
			j++;
		}
		return subDeck;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// in order to return StringBuilder sb, needs toString()

		for (int i = 0; i < cards.length; i++) {
			sb.append(cards[i].toString());
			if (i != cards.length - 1) {
				sb.append(", ");
			}
			if (i % 7 == 0 && i != 0 ) {
				sb.append("\n");
			}
		}

		return sb.toString();

	}
}
