import java.util.Scanner;
public class ExerciseRegexLoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] mssv;
		mssv = new String[5];
		System.out.print("Nhập vào 5 MSSV: ");
		for(int i = 1; i <= 5; i++) {
			System.out.print("Mssv " + i + ": ");
			mssv[i] = scan.nextLine();
			if(mssv[i].matches("00[2-5]L\\d{4}")) {
				System.out.print(": đúng định dạng.");
			}else {
				System.out.print(": không đúng định dạng.");
			}
		}
	}

}
