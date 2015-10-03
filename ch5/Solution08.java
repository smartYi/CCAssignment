package solution;

/**
 * This class file is to drw a line from (x1, y) to (x2, y).
 * The main idea is to iterate from x1 to x2 and set each pixel along the path
 * but some special measures could be done to accelerate this operation.
 * @author qiuyi
 *
 */
public class Solution08 {
	public static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
		int start_offset = x1 % 8;
		int first_full_byte = x1 / 8;
		if(start_offset != 0) first_full_byte++;
		
		int end_offset = x2 % 8;
		int last_full_byte = x2 / 8;
		if(end_offset != 7) last_full_byte--;
		
		for(int i=0; i<first_full_byte;i++) {
			screen[(width/8)*y+i] = (byte)0xff;
		}
		
		byte start_mask = (byte) (0xff>>start_offset);
		byte end_mask = (byte) ~(0xff>>(end_offset+1));
		
		if((x1 / 8) == (x2 / 8)) {
			byte mask = (byte) (start_mask & end_mask);
			screen[(width/8)*y + (x1 / 8)] |= mask;
		}else {
			if(start_offset != 0) {
				int byte_number = (width/8)*y+first_full_byte-1;
				screen[byte_number] |= start_mask;
			}
			if(end_offset != 7) {
				int byte_number = (width/8)*y+last_full_byte+1;
				screen[byte_number] |= end_mask;
			}
		}
	}
}
