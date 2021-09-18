import java.util.Scanner;
public class ExerciseCharNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String s;
		char[] sTemp;
		boolean hasNum = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		s = scan.nextLine();
		sTemp = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			sTemp[i] = s.charAt(i);
			for(int j = 0; j < number.length; j++) {
				if(sTemp[i] == number[j]) {
					hasNum = true;
				}
			}
		}
		
		if(hasNum) {
			System.out.print("Chuỗi có ký tự là số.");
		}else {
			System.out.print("Chuỗi không có ký tự là số.");
		}
		
	}

}
