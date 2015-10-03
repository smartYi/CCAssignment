package solution;

/**
 * This class file is to determine how many flips could change one 
 * integer to another integer.
 * The idea is simple, we only need to know the number of different bits in 
 * the same position of two integers.
 * @author qiuyi
 *
 */
public class Solution06 {
	public static int convert(int x, int y) {
		int step = 0;
		while(x!=0 && y!=0) {
			int bit1 = x&1;
			int bit2 = y&1;
			if(bit1 != bit2) {
				step++;
			}
			x>>=1;
			y>>=1;
		}
		
		//If y is already 0 but x is not 0, continue to increase the step once encounter a 1 bit
		while(x!=0) {
			if((x&1) == 1) {
				step++;
			}
			x>>=1;
		}
		
		//If x is already 0 but y is not 0, continue to increase the step once encounter a 1 bit
		while(y!=0) {
			if((y&1) == 1) {
				step++;
			}
			y>>=1;
		}
		return step;
	}
	
	public static void main(String[] args) {
		System.out.println("Textbook test!");;
		System.out.println(convert(29, 15));
	}
}
