import java.util.Scanner;
import java.io.*;
public class ExerciseCheckChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s;
		char c = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		s = scan.nextLine();
		System.out.print("Nhập ký tự: ");
		try {
			c = (char) System.in.read();
			System.out.println("Ký tự vừa nhập: " + c);
			String temp = Character.toString(c);
			if(s.contains(temp)) {
				System.out.println("Ký tự '" + c + "' có xuất hiện trong chuỗi.");
			}else {
				System.out.println("Ký tự '" + c + "' không có xuất hiện trong chuỗi.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
