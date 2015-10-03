package solution;

/**
 * This class file is to insert a 32-bit number M into another 32-bit number N.
 * Assume the bumber N has enough space for number M bit representation.
 * The main idea is firstly to clear all bits in number N that number M will occupy,
 * and then do bit manipulation OR.
 * @author qiuyi
 *
 */
public class Solution01 {
	/**
	 * This method is to do the above function description.
	 * Four arguments, N, M, tail and head.
	 * Attention: tail represents the lower bit and head represents higher bit. 
	 * @param N
	 * @param M
	 * @param tail
	 * @param head
	 */
	public static int insert(int N, int M, int tail, int head) {
		//First clear bits in number N.
		int mask1 = (-1>>>(32-tail));
		int mask2 = ((-1>>(32-head)))<<(head+1);
		int mask = mask1 + mask2;
		return (N & mask) | (M << tail);
	}
	
	public static void main(String[] args) {
		System.out.println("Textbook test!");
		System.out.println("Ans = " + Integer.toBinaryString(insert(1<<10, (1<<4)+3, 2, 6)));
		
	}
}
