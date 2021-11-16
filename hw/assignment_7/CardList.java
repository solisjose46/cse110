//***********************************************************  
// Name: Jose Solis Salazar
// Title: CardList
// Description: Coding excersies and List of cards
// Time spent: approx. 4 hours
// Date: 11/16/21
//********************************************************** 

// public int[] swapEnds(int[] nums) {
//   int temp = nums[0];
//   nums[0] = nums[nums.length - 1];
//   nums[nums.length - 1] = temp;
//   return nums;
// }
// 
// public boolean commonEnd(int[] a, int[] b) {
//   if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]){
//     return true;
//   }
//   return false;
// }
// 
// public int countEvens(int[] nums) {
//   int count = 0;
//   
//   for(int i = 0; i < nums.length; i++){
//     if(nums[i] % 2 == 0){
//       count++;
//     }
//   }
//   return count;
// }
// 
// public int sum13(int[] nums) {
//   int sum = 0;
//   final int bad = 13;
//   boolean add = false;
//   
//   if(nums.length > 0){
//     
//     for(int i = 0; i < nums.length; i++){
//       
//       if(nums[i] != bad){
//         if(i != 0){
//           if(nums[i-1] != bad){
//             add = true;
//           }
//         }
//         else{
//           add = true;
//         }
//       }
//       
//       if(add){
//         sum+=nums[i];
//         add = false;
//       }
//     }
//     
//   }
//   return sum;
// }
// 
// public int[] fix34(int[] nums) {
//   final int THREE = 3;
//   final int FOUR = 4;
//   final int EMPTY = -1;
//   
//   int four = EMPTY;
//   int afterThree = EMPTY;
//   int iter = 0;
//   
//   while(iter < nums.length){
//     if(nums[iter] == THREE && nums[iter + 1] != FOUR && afterThree == EMPTY){
//       iter++;
//       afterThree = iter;
//     }
//     if(iter != 0){
//       if(nums[iter] == FOUR && nums[iter - 1] != THREE && four == EMPTY){
//       four = iter;
//       }
//     }
//     else if(nums[iter] == FOUR && four == EMPTY){
//       four = iter;
//     }
//     
//     if(afterThree != EMPTY && four != EMPTY ){
//       int temp = nums[afterThree];
//       nums[afterThree] = nums[four];
//       nums[four] = temp;
//       if(afterThree < four){
//         iter = afterThree;
//       }
//       else{
//         iter = four;
//       }
//       afterThree = EMPTY;
//       four = EMPTY;
//     }
//     iter++;
//   }
//   return nums;
// }



import java.lang.Math;
import java.util.Arrays;

public class CardList{
	private char[] cards;
	private String history;

	public CardList(int numberOfCards){
		String deck = "A234567890JQK";
		this.cards = new char[numberOfCards];

		for(int i = 0; i < cards.length; i++){
			char newCard = deck.charAt((int)(Math.random() * deck.length()));
			this.cards[i] = newCard;
		}

		this.history = Arrays.toString(cards);

	}
	public void flip(){
		char[] flipped = new char[this.cards.length];
		int j = 0;
		for(int i = (this.cards.length - 1); i >= 0; i--){
			flipped[j] = cards[i];
			j++;
		}
		this.cards = flipped;

		String append = "\n" + Arrays.toString(cards) + ": Flip";
		this.history+=append;
	}
	public void shift(){
		char[] shifted = new char[cards.length];
		char tail = cards[0];
		shifted[shifted.length - 1] = tail;
		for(int i = (cards.length - 1); i > 0; i--){
			shifted[i - 1] = cards[i];
		}
		cards = shifted;
		String append = "\n" + Arrays.toString(cards) + ": Shift";
		this.history+=append;
	}
	public void shuffle(){
		int[] positions = shuffleIndex();
		char[] shuffled = new char[cards.length];
		for(int i = 0; i < shuffled.length; i++){
			shuffled[i] = cards[positions[i]];
		}
		cards = shuffled;
		String append = "\n" + Arrays.toString(cards) + ": Shuffle";
		this.history+=append;
	}
	public void change(int num){
		if(num > 0 && num <= cards.length){
			String deck = "A234567890JQK";
			for(int i = 0; i < (num - 1); i++){
				char newCard = deck.charAt((int)(Math.random() * deck.length()));
				cards[i] = newCard;
			}
			String append = "\n" + Arrays.toString(cards) + ": Change";
			this.history+=append;
		}
	}
	private int[] shuffleIndex(){
		int[] randomized = new int [cards.length];
		for(int i = 0; i < randomized.length; i++){
			int random = i;
			boolean seen = false;
			while(random == i || seen){
				seen = false;
				random = ((int)(Math.random() * cards.length));
				for(int j = 0; j < i; j++){
					if(randomized[j] == random){
						seen = true;
					}
				}
			}
			randomized[i] = random;
		}
		return randomized;
	}
	public String getHistory(){
		return this.history;
	}
}
