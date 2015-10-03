package solution;

/**
 * This class file is to explain what the code ((n&(n-1)) == 0) for.
 * The main idea is that we already know each time we do n&(n-1)
 * we eliminate the rightmost 1 bit. So in this way, if n&(n-1) == 0,
 * it means that there is only one 1 bit in the binary representation. 
 * So this code is to check whether n is the power of 2.
 * But also there is a special case that if n==0, n-1 would be 32 1s, 
 * and the result n&(n-1) also is 0. So another case is n=0.
 * And I will do test here.
 * @author qiuyi
 *
 */
public class Solution05 {
	public static boolean isPowerOf2(int x) {
		return ((x&(x-1)) == 0);
	}
	public static void main(String[] args) {
		System.out.println("Test!");
		System.out.println(isPowerOf2(2));
		System.out.println(isPowerOf2(3));
		System.out.println(isPowerOf2(1024));
		System.out.println(isPowerOf2(1023));
	}
}
