import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ExerciseNumberToWord {
	public static void main(String[] args) {
		ExerciseNumberToWord ex = new ExerciseNumberToWord();
		int option;
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("1. Sử dụng list");
		System.out.println("2. Sử dụng switch case");
		System.out.print("Chọn: ");
		
		option = scan.nextInt();
		switch(option) {
		case 1:
			n = ex.getInt();
			ex.ConvertByUseList(n);
			break;
		case 2:
			n = ex.getInt();
			ex.ConvertByUseSwitchCase(n);
			break;
		default: 
			System.out.println("Không có lựa chọn này.");
			break;
		}
		
	}
	
	public void ConvertByUseList(int n) {
		List<String> words = new ArrayList<String>(Arrays.asList("Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"));				
		String word = words.get(n);
		
		System.out.println("Số " + n + " đọc là: " + word);
	}
	
	public void ConvertByUseSwitchCase(int n) {		
		switch(n){
		case 0:
			System.out.println("Số 0 đọc là Không.");
			break;
		case 1:
			System.out.println("Số 1 đọc là Một.");
			break;
		case 2:
			System.out.println("Số 2 đọc là Hai.");
			break;
		case 3:
			System.out.println("Số 3 đọc là Ba.");
			break;
		case 4:
			System.out.println("Số 4 đọc là Bốn.");
			break;
		case 5:
			System.out.println("Số 5 đọc là Năm.");
			break;
		case 6:
			System.out.println("Số 6 đọc là Sáu.");
			break;
		case 7:
			System.out.println("Số 7 đọc là Bảy.");
			break;
		case 8:
			System.out.println("Số 8 đọc là Tám.");
			break;
		case 9:
			System.out.println("Số 9 đọc là Chín.");
			break;
		default:
			System.out.println("Giới hạn chỉ có từ 0 tới 9.");
			break;
		}
	}
	
	public int getInt() {
		int n;
		System.out.print("Nhập vào 1 số nguyên dương: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		return n;
	}
	
}



