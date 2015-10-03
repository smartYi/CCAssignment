package solution;


/**
 * Given a positive integer, return the next largest and smallest integer with 
 * the same number of 1s in their bit representation.
 * The main idea to get the next largest number is to replace the highest 0 bit 
 * in the original bit representation with the highest 1 bit.
 * The main idea to get the smallest number is simple, just put the number of 1s 
 * from the lowest position to the highest position.
 * @author qiuyi
 *
 */
public class Solution04 {
	public static void nextNumber(int x) {
		int highest0 = 0;
		int highest1 = 0;
		int minimum = 0;
		int count1 = 0;
		int index = 0;
		int number = x;
		//First get the position of the highest 1 and the highest 0.
		while(x != 0) {
			index++;
			if((x&1) == 1) {
				highest1 = index;
				count1++;
			}else {
				highest0 = index;;
			}
			x>>=1;
		}
		
		//Then clear the highest1 and set the highest 0 to 1.
		System.out.println("The original bit representation is: " + Integer.toBinaryString(number));
		number = number&(~(1<<(highest1-1)));
		number = number | (1<<(highest0-1));
		System.out.println("The next largest number bit representation is: " + Integer.toBinaryString(number));
		
		//Now get the smallest one.
		minimum = (-1)>>>(32-count1);
		System.out.println("The next smallest number bit representation is: " + Integer.toBinaryString(minimum));
	}
	
	public static void main(String[] args) {
		System.out.println("Test!");
		nextNumber(1775);
	}
}
