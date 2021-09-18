import java.util.Scanner;
public class ExerciseCheckIsTriangle {

	public static void main(String[] args) {
		double a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhập vào a: ");
		a = scan.nextDouble();
		System.out.print("Nhập vào b: ");
		b = scan.nextDouble();
		System.out.print("Nhập vào c: ");
		c = scan.nextDouble();

		if(a != b && b != c && c != a) {
			System.out.println("3 điểm này CÓ THỂ tạo thành 1 tam giác.");
		}else {
			System.out.println("3 điểm này KHÔNG THỂ tạo thành 1 tam giác.");
		}
	}

}
