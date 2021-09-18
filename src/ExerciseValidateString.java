import java.util.Scanner;
public class ExerciseValidateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner scan = new Scanner(System.in);
		int err = 0;
		final String EMPTY = "";
		char[] sTemp;
		char firstChar = '0';
		char lastChar = '0';
		
		System.out.print("Nhập vào 1 chuỗi: ");
		s = scan.nextLine();
		sTemp = new char[s.length()];
		
		//Validate
		if(s.length() > 20) {
			err++;
		}
		
		for(int i = 0; i < sTemp.length; i++) {
			firstChar = s.charAt(0);
			lastChar = s.charAt(sTemp.length - 1);
			sTemp[i] = s.charAt(i);
		}
		
		for(int i = 0; i < sTemp.length; i++) {
			if(Character.toString(sTemp[i]).equals(EMPTY)) {
				err++;
			}
		}
		
		//Kí tự đầu tiên phải là A-Z
		if(!Character.toString(firstChar).matches("[A-Z]")) {
			err++;
		}
		
		//Kí tự cuối cùng phải là 0-9
		if(!Character.toString(lastChar).matches("\\d")) {
			err++;
		}
		
		if(err > 0) {
			System.out.print("Không duyệt");
		}else {
			System.out.print("Duyệt!!!");
		}
	}

}
