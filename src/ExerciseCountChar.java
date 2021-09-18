import java.util.Scanner;
public class ExerciseCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner scan = new Scanner(System.in);
		String a = "a";
		char[] sTemp;
		
		System.out.print("Nhập chuỗi: ");
		s = scan.nextLine();
		sTemp = new char[s.length()];
		
		int count = 0;
		for(int i = 0 ; i < s.length(); i++) {
			sTemp[i] = s.charAt(i);
		}
		
		for(int i = 0; i < sTemp.length; i++) {
			if(Character.toString(sTemp[i]).equals(a)) {
				count++;
			}
		}
		
		System.out.print("Ký tự a xuất hiện " + count + " lần trong chuỗi.");
	}

}
