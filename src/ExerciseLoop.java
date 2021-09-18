import java.util.Scanner;
public class ExerciseLoop {

	public static void main(String[] args) {
		int n;
		System.out.println("Nhập vào n: ");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		int total = 0;
		for(int i = 0; i <= n; i++) {
			total += i;
		}
		System.out.println("Tổng 0 -> " + n + " là: " + total);
	}

}
