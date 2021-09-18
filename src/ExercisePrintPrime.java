import java.util.Scanner;
public class ExercisePrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Nhập vào n: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		if(n < 1000) {
			System.out.print("Số nguyên tố: 2 ");
			for(int i = 3; i <= n; i++) {
				int count = 0;
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						count++;
					}
				}
				if(count == 2) {
					// i là số nguyên tố
					System.out.print(i + " ");
				}
				count = 0;
			}
		}else {
			System.out.print("n phải < 1000.");
		}
	}

}
