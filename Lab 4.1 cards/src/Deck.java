import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(String[] rank, String[] suit, int[] value) {
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < suit.length; j++) {
				unDealt.add(new Card(rank[i],suit[j],value[i]));
			}
		}
	}
}
