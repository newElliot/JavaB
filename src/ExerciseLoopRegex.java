import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ExerciseLoopRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mssv1, mssv2, mssv3, mssv4, mssv5;
		Scanner scan = new Scanner(System.in);
		List<String> MSSVs = new ArrayList<String>();
		System.out.print("Nhập 5 MSSV: ");
		mssv1 = scan.nextLine();
		mssv2 = scan.nextLine();
		mssv3 = scan.nextLine();
		mssv4 = scan.nextLine();
		mssv5 = scan.nextLine();
		
		MSSVs.add(mssv1);
		MSSVs.add(mssv2);
		MSSVs.add(mssv3);
		MSSVs.add(mssv4);
		MSSVs.add(mssv5);
		
		for(int i = 0; i < 5; i++) {
			if(MSSVs.get(i).matches("B170\\d{4}")) {
				System.out.println(MSSVs.get(i) + " hợp lệ.");
			}else {
				System.out.println(MSSVs.get(i) + " không hợp lệ.");
			}
		}
	}

}
