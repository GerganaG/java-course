package cards;

import java.util.Random;
import java.util.TreeMap;

public class Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A"};
		
		TreeMap<String, Integer> hand = new TreeMap<String, Integer>();
		
		for(int i = 0; i < 5; i++){
			Random rand = new Random();
			int randCard = rand.nextInt(13);
			
			Integer count = hand.get(cards[randCard]);
			if (count == null) {
				count = 0; 
			}
			hand.put(cards[randCard], count + 1);
		}
		
		System.out.print("Your hand: ");
		System.out.print(hand + " ");
		System.out.println();
		
		for(int i = 0; i < 13; i++){
			
			Integer temp = hand.get(cards[i]);
			if(temp == null){
				continue;
			}
			
			if(temp == 2){
				System.out.println("You have pair!");
			} else if(temp == 3){
				System.out.println("You have set!");
			} else if(temp == 4){
				System.out.println("You have four of a kind!");
			} 
		}
	}

}
