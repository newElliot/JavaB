import java.util.Scanner;

public class ExerciseCheckInteger {

	public static void main(String[] args) {
		int n;
		System.out.print("Nhập vào số nguyên: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if(n >= 0) {
			System.out.println("Số vừa nhập: " + n + " là số nguyên dương");
		}else {
			System.out.println("Số vừa nhập: " + n + " là số nguyên âm");
		}
		
	}

}
