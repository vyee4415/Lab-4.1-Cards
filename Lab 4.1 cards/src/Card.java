
public class Card {
	
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue){
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}

	public boolean equals(Card otherCard) {
		if(pointValue == otherCard.getPointValue()) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return(rank + "of" + suit + "with value of" + pointValue);
	}
	
	public int getPointValue() {
		return pointValue;
	}
	public String getSuit() {
		return suit;
	}
	public String getRank() {
		return rank;
	}
}
