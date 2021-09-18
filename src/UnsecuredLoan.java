import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class UnsecuredLoan {

	public static void main(String[] args) {
		String bank;
		int loanTerm, borrowingLimit;
		float interestedRate, income;
		Scanner scan = new Scanner(System.in);
		Locale locale = new Locale("vi", "VN");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(locale);
		
		System.out.print("Vay ngân hàng: ");
		bank = scan.nextLine();
		
		System.out.print("Nhập mức lương: ");
		income = scan.nextFloat();
		
		System.out.print("Nhập thời hạn vay(năm): ");
		loanTerm = scan.nextInt();
		
		System.out.print("Nhập lãi suất ngân hàng(%/năm): ");
		interestedRate = scan.nextFloat();
		
		System.out.print("Nhập mức vay(bao nhiêu lần lương): ");
		borrowingLimit = scan.nextInt();
		
		int monthsPay = loanTerm * 12;
		float totalBorrow = income * borrowingLimit;
		
		float aYearInterestedMoney = (totalBorrow * interestedRate) / 100;
		float aMonthInterestedMoney = aYearInterestedMoney / 12;
		float monthlyPayment = totalBorrow / monthsPay + aMonthInterestedMoney;
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("Ngân hàng " + bank.toUpperCase());
		System.out.println("Lãi suất 1 năm: " + interestedRate + "%");
		System.out.println("Tiền vay được: " + numFormat.format(totalBorrow));
		System.out.println("Trả trong: " + monthsPay + " tháng");
		System.out.println("Tiền lời 1 năm: " + numFormat.format(aYearInterestedMoney));
		System.out.println("Tiền lời 1 tháng: " + numFormat.format(aMonthInterestedMoney));
		System.out.println("Tiền phải trả 1 tháng: " + numFormat.format(monthlyPayment));
		System.out.println("Tiền còn lại mỗi tháng: " + numFormat.format(income - monthlyPayment));
	}

}
