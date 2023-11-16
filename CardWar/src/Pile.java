import java.util.List;
import java.util.ArrayList;


public class Pile {
	private List<Card> pile;
	
	public Pile () {
		pile = new ArrayList<>();
	}
	
	public void addDeck (Deck deck) {
		for (Card card : deck.getCards()) {
			this.addCard(card);
		}
	}

	public void addCard(Card card) {
		pile.add(card);
	}
	
	public void addPile (Pile pile) {
		while (!pile.isEmpty()) {
			this.pile.add(pile.popCard());
		}
	}
	
	public Card popCard() {
		return pile.remove(0);
	}

	public boolean isEmpty() {
		return pile.isEmpty();
	}

	public int size() {
		return pile.size();
	}

	@Override
	public String toString() {
		return "Pile : " + pile;
	}
	
}
