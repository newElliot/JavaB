import java.util.Scanner;
public class ExerciseRegex {

	public static void main(String[] args) {
		String MSSV;

		System.out.print("Nhập vào MSSV: ");
		Scanner scan = new Scanner(System.in);
		MSSV = scan.nextLine();
		
		//Bxxxxxxx => x là số từ 0 -> 9
		//B\\d[7]
		if(MSSV.matches("B\\d{7}")) {
			System.out.println("Mã số sinh viên đúng định dạng.");
		}else {
			System.out.println("Mã số sinh viên không đúng định dạng.");
		}
	}

}
