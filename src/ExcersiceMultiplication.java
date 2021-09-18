import java.util.Scanner;
public class ExcersiceMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Nhập vào n: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
