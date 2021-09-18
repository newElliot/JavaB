import java.util.Scanner;
public class ExerciseAverageMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] sn;
		System.out.print("Nhập vào n: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		sn = new int[n];
		for(int i = 0; i < n; i++) {
			sn[i] = scan.nextInt();
		}
		
		int min = sn[1];
		for(int i = 0; i < n; i++) {
			if(sn[i] < min) {
				min = sn[i];
			}
		}
		
		System.out.print("Số nhỏ nhất trong mảng: " + min);
	}
}
