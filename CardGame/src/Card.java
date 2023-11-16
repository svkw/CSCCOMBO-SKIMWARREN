import java.util.Arrays;

public class Card {

	// DATA MEMBERS
	private int rank;
	private int suit;
	
	private final String[] SUITS = {
			"Clubs", "Diamons", "Hearts", "Spades"
	};	// constant values

	private final String[] RANKS = {
			null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
	};	// constant values
	
	// CONSTRUCTORS
	public Card () {
		super();
	}

	public Card (int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void setSuit(int suit) {
		this.suit = suit;
	}

// returns array
//	public String[] getRANKS() {
//		return RANKS;
//	}
//  returns array
//	public String[] getSUITS() {
//		return SUITS;
//	}
	
	
	// Comparable
	public int compareTo(Card oCard) {
//		comparing suit
//		if (suit > oCard.suit) {
//			return 5;
//		}
//		else if (suit < oCard.suit) {
//			return -5;
//		}	
//		upto this point, same suit
		if(rank > oCard.rank) {
			return 5;
		}
		else if (rank < oCard.rank) {
			return -5;
		}
		// at this point, both of them are the same suit and rank... not sure if any can be duplicated
		return 0;
	}

	
	@Override
	public String toString() {
//		String str = "rank : " + RANKS[rank] + " of suit : " + SUITS[suit];
//		return "Cards [rank=" + rank + ", suit=" + suit + ", RANKS=" + Arrays.toString(RANKS) + ", SUITS="
//				+ Arrays.toString(SUITS) + "]"; // another way of reading array
		return RANKS[rank] + " of " + SUITS[suit];
	}
	
}
