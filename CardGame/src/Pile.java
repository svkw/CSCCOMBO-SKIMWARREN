
import java.util.List;
import java.util.ArrayList;

public class Pile {
	// DATA MEMBER
	private List<Card> pile;
	
	// INITIALIZATION
	public Pile() {
		pile = new ArrayList<>();
	}
	
	public void addDeck(Deck deck) {
		for (Card card : deck.getCards()) {
			this.addCard(card);
		}
	}
	
	public void addPile(Pile pile) {
		while(!pile.isEmpty()) {
			this.pile.add(pile.popCard());
		}
	}
	
	public void addCard(Card card) {
		pile.add(card);
	}
	
	public int size() {
		return pile.size();
		//return pile.size();
	}
	
	public Card popCard() {
		return pile.remove(0);
	}
	
	public boolean isEmpty() {
		return pile.isEmpty();
		//return pile.isEmpty();
	}
	

	@Override
	public String toString() {
		return pile.toString();
	}
	
	
//	public Pile() {
//		card = new List<Card>;
		// can't do this because it's not a class; it's behavior
//	}

	
}
