import java.util.Scanner;
public class ExerciseRevertArray {

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

		for(int i = 0; i < n; i++) {
			System.out.print(sn[i] + " ");
		}
		
		//Revert the array.
		int j = sn.length - 1;
		for(int i = 0; i < n/2; i++) {
			int temp = sn[i];
			sn[i] = sn[j];
			sn[j] = temp;
			j--;
		}
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.print(sn[i] + " ");
		}
	}

}
