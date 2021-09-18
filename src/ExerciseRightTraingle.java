import java.util.Scanner;
public class ExerciseRightTraingle {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("Nhập vào chiều dài 3 cạnh tam giác: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		//c^2 = a^2 + b^2
		if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))
				|| Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2))
				|| Math.pow(c, 2) == (Math.pow(b, 2) + Math.pow(a, 2))
				) {
			System.out.println("Đây là tam giác vuông.");
		}else {
			System.out.println("Đây không là tam giác vuông.");
		}
	}

}
