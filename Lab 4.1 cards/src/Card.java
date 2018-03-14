
public class Card {
	
	private static String rank;
	private static String suit;
	private static int pointValue;
	
	public Card(String rank, String suit, int pointValue){
		this.setRank(rank);
		this.setSuit(suit);
		this.setPointValue(pointValue);
	}
	public static void main(String args[]) {
		Card obj = new Card(rank, suit, pointValue);
	}
	
	public boolean equals(Card otherCard) {
		
	}
	
	public String toString() {
	
	}
	public int getPointValue() {
		return pointValue;
	}
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}
