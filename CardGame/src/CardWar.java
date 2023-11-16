import java.lang.Math;

public class CardWar {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 26));
		
		System.out.println(p1);
		System.out.println(p1.toString());

		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(27, 52));
		System.out.println(p2);
		System.out.println(p2.toString());


		Pile midPile = new Pile();
		Pile winP1 = new Pile();
		Pile winP2 = new Pile();

//		Cards card1 =  new Cards(2, 3);
//		System.out.println(card1);
//		System.out.println(deck);

//		deck.bubblesort();

//		System.out.println(deck);

		while ( !p1.isEmpty() && !p2.isEmpty() ) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			midPile.addCard(c1);
			midPile.addCard(c2);

//			System.out.println(c1 + " -vs- " + c2);
			int result = c1.compareTo(c2);
			
			if (result > 0) {
				System.out.println("p1 took it");
				winP1.addPile(midPile);

			} else if (result < 0) {
				System.out.println("p2 took it");
				winP2.addPile(midPile);
			} else {
				System.out.println("p1 & p2 tied");
			}
		}
		
		if (winP1.size() > winP2.size()) {
			System.out.println("player1 wins");
		}
		else if (winP1.size() < winP2.size()) {
			System.out.println("player2 wins");
		}
		else System.out.println("tied");
	}

}
