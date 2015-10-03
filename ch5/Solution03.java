package solution;

import java.util.ArrayList;

/**
 * This class file is to flip one bit in a number to get the longest 1s in this new number.
 * The main idea is to separate the bit representation into severals parts, 
 * which is splitted by 0. So an array of number of continuous 1s will be saved.
 * And finally return the maximum of every adjacent two elements sum plus 1.
 * @author qiuyi
 *
 */
public class Solution03 {
	public static int flipWin(int x) {
		//First put the number of 1s into an arraylist 
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int length = 0;
		int maximum = 0;
		while(x != 0) {
			if((x&1) == 1) {
				length++;
			} else {
				arrayList.add(length);
				length = 0;
			}
			x = x>>1;
		}
		
		//Then add two adjacent elements and return the largest plus 1.
		for(int i=0;i<arrayList.size()-1;i++) {
			int temp = arrayList.get(i) + arrayList.get(i+1);
			if(temp > maximum) maximum = temp;
		}
		return maximum+1;
	} 
	
	public static void main(String[] args) {
		System.out.println("Textbook test!");
		System.out.println(flipWin(1775));
	}
}
