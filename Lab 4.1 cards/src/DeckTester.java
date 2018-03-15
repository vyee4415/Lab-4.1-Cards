
public class DeckTester {
	public static void main(String[] args) {
		String[] rank = {"Jack","queen","king"};
		String[] suit = {"Heart","Spade"};
		int[] pointValue = {1,2,3};
		
		Deck one = new Deck(rank,suit,pointValue);
		System.out.print(one);
	}
}
