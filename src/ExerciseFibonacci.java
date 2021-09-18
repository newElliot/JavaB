import java.util.Scanner;
public class ExerciseFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Nhập vào n: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		ExerciseFibonacci ex = new ExerciseFibonacci();
		
		//F[0] = 0	F[1] = 1
		//F[2] = F[0] + F[1] = 3
		//F[n] = ??
		int Fibonacci = 0;
		Fibonacci = ex.Fibonacci(n);
		System.out.print("Số fibonacci của " + n + " là: " + Fibonacci);
	}
	
	public int Fibonacci(int i) {
		if(i == 1 || i == 0) {
			return 1;
		}
		return Fibonacci(i - 1) + Fibonacci(i - 2);
	}

}
