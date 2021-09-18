import java.util.Scanner;
import java.io.IOException;
import java.util.*;
public class ExerciseStartIndexChar {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s;
		char c = 0;
		String tempC;
		Scanner scan = new Scanner(System.in);
		char[] tempChar;
		System.out.print("Nhập vào chuỗi: ");
		s = scan.nextLine();
		try {
			System.out.print("Nhập kí tự: ");
			c = (char) System.in.read();
			tempC = Character.toString(c);
			
			tempChar = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				tempChar[i] = s.charAt(i);
			}
			int count = 0;
			for(int i = 0; i < tempChar.length; i++) {
				if(Character.toString(c).equals(Character.toString(tempChar[i]))) {
					count ++;
					System.out.print("Ký tự '" + c + "' có xuất hiện trong chuỗi, nằm ở vị trí thứ " + (i+1));
				}
			}

			if(count == 0) {
				System.out.print("Ký tự '" + c + "' không xuất hiện trong chuỗi.");
			}
		}catch(IOException e) {
			
		}
	}
}
