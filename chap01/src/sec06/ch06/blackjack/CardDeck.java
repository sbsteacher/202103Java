package sec06.ch06.blackjack;

public class CardDeck {
	public static final String[] CARD_PATTERNS = {"Spades", "Hearts", "Diamonds", "Clubs"};
	public static final String[] CARD_SYMBOLS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	private final int EACH_CARD_LEN = 13;	
	private final Card[] CARD_ARR;
	public CardDeck() {
		CARD_ARR = new Card[CARD_PATTERNS.length * EACH_CARD_LEN];
		System.out.println(CARD_PATTERNS.length);		
		init2();
	}
	
	private void init2() {
		int idx = 0;
		for(String pattern : CARD_PATTERNS) {			
			for(String symbol : CARD_SYMBOLS) {				
				CARD_ARR[idx++] = new Card(pattern, symbol);
			}
		}
	}
	
	private void init() {
		int idx = 0;
		for(int i=0; i<CARD_PATTERNS.length; i++) {
			for(int z=1; z<=EACH_CARD_LEN; z++) {
				String symbol = null;
				switch(z) {
				case 1: symbol = "A"; break;
				case 11: symbol = "J"; break;
				case 12: symbol = "Q"; break;
				case 13: symbol = "K"; break;
				//default: symbol = Integer.toString(z);					
				default: symbol = String.valueOf(z);
				//default: symbol = z + "";
				}
				CARD_ARR[idx++] = new Card(CARD_PATTERNS[i], symbol);
				//CARD_ARR[(i * EACH_CARD_LEN) + (z-1)] = new Card(CARD_PATTERNS[i], symbol);
			}
		}		
	}
}





