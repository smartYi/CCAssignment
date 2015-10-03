package solution;


/**
 * This class file is to swap odd and even bit in the bit representation.
 * The main idea is separately get the odd bits and even bits in the binary representation.
 * And the left shift the odd bits and right shift the even bits by 1.
 * Finally do OR.
 * @author qiuyi
 *
 */
public class Solution07 {
	public static int swap(int x) {
		int evenMask = 0xAAAAAAAA;
		int oddMask = 0x55555555;
		//Get odd bits
		int oddbits = x&oddMask;
		//Get even bits
		int evenbits = x&evenMask;
		//Odd left shift by 1 and even right shift by 1.
		return (oddbits<<1) | (evenbits>>1);
	}
	
	public static void main(String[] args) {
		System.out.println("Test!");
		int a = 17755;
		System.out.println("The origin bit representation is: " + Integer.toBinaryString(a));
		System.out.println("After swap: " + Integer.toBinaryString(swap(a)));
	}
}
