package solution;

/**
 * This class file is to transfer double number to its bit representation.
 * The main idea is to iteratively left shift the number that is multiply by 2,
 * and if the result is no less than 1, then this bit set to 1, if its less than 1,then 
 * this bit set to 0. Also if the bit length is larger than 32 and the remainder is not
 * 0, print error.
 * @author qiuyi
 *
 */
public class Solution02 {
	public static void print(double x) {
		b2s(x);
	}
	
	
	public static void b2s(double x) {
		String binary = "";
		int index = 0;
		while(x!=0) {
			x*=2;
			if( x >= 1) {
				binary+="1";
				x = x-1;
			}else {
				binary+="0";
			}
			index++;
			//If index equals to 32, break this loop
			if(index > 32) {
				System.out.println("Error");
				break;
			}
		}
		if(index > 32) {
			return;
		}else {
			System.out.println("The binary representation is 0."+ binary);
		}
	}
	
	public static void main(String[] args) {
		print(0.72);
	}
	
}
