import java.util.Scanner;
public class ExerciseAverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] sn;
		System.out.print("Nhập số lượng phần tử của mảng: ");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		sn = new int[n];
//		System.out.print("Size of sn: " + sn.length);
		for(int i = 0; i < n; i++) {
			sn[i] = scan.nextInt();
		}
		
		int result = 0;
		for(int i = 0; i <  n; i++) {
			result += sn[i];
		}
		
		float average = result / n;
		System.out.print("Trung bình của mảng: " + average);
	}

}
