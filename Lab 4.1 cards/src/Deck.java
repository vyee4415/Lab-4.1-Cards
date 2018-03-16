import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(String[] rank, String[] suit, int[] value) {
		this.Dealt = new ArrayList<Card>();
		this.unDealt = new ArrayList<Card>();
		
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < suit.length; j++) {
				unDealt.add(new Card(rank[i],suit[j],value[i]));
			}
		}
	}
	
	public boolean isEmpty() {
		if(unDealt.size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		return unDealt.size();
	}
	
	public Card deal(Card wa) {
		if(unDealt.size() == 0) {
			return null;
		}else {
			unDealt.remove(wa);
			Dealt.add(wa);
			return wa;
		}
	}
	
	public void shuffle() {
		int x = Dealt.size();
		for(int i = 0; i < x; i++) {
			unDealt.add(Dealt.get(0));
			Dealt.remove(0);
		}
		x = unDealt.size();
		for(int k = unDealt.size(); k > x; k++) {
			
		}
		unDealt.get((int) Math.random());
	}
}
