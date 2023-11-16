
public class CardWar {

	public static void main(String[] args) {
		Card cards = new Card ();
		Deck deck = new Deck ();
		Deck subDeck = new Deck ();
		
		Pile p1 = new Pile ();
		Pile p2 = new Pile ();
		
		Pile midPile = new Pile ();
		Pile p1Win = new Pile ();
		Pile p2Win = new Pile ();
		

		// TEST
//		cards = new Card (11, 3);
//		System.out.println(cards);
		System.out.println(deck);
//		System.out.println(deck.cards.length);	// at this point, cards.length is 52
		deck.shuffCards();
//		System.out.println(deck);		
		deck.shuffCards();
//		System.out.println(deck);
//		System.out.println(deck.getCards()[0] + " : " + deck.getCards()[51]);
		
		p1.addDeck(deck.subDeck(0, 25));
//		System.out.println(p1.size() + " p1 " + p1.toString());
		
		p2.addDeck(deck.subDeck(26, 51));
//		System.out.println(p2.size() + " p2 " + p2.toString());

		
		// LOGIC FOR WAR GAME
		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			midPile.addCard(c1);
			midPile.addCard(c2);
			
			System.out.println(c1 + " -vs- " + c2);
			int compResult = c1.compareTo(c2);

			if (compResult > 0) {
				p1Win.addPile(midPile);
				System.out.println("player 1 wins " + p1Win.size());
			}
			else if (compResult < 0) {
				p2Win.addPile(midPile);
				System.out.println("player 2 wins " + p2Win.size());
			}
			else System.out.println("tied" + p1Win.size() + " -vs- " + p2Win.size());
		}
		if (p1Win.size() > p2Win.size()) {
			System.out.println("player 1 wins");
		}
		else if (p1Win.size() < p2Win.size()) {
			System.out.println("player 2 wins");
		}
		else System.out.println("tied");
	}

}
