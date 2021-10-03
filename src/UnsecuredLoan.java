import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class UnsecuredLoan {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(UnsecuredLoan.class.getName());
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
		logger.info("-----------------------------------------");
		logger.info("-----------------------------------------");
		logger.info("Ngân hàng " + bank.toUpperCase());
		logger.info("Lãi suất 1 năm: " + interestedRate + "%");
		logger.info("Tiền vay được: " + numFormat.format(totalBorrow));
		logger.info("Trả trong: " + monthsPay + " tháng");
		logger.info("Tiền lời 1 năm: " + numFormat.format(aYearInterestedMoney));
		logger.info("Tiền lời 1 tháng: " + numFormat.format(aMonthInterestedMoney));
		logger.info("Tiền phải trả 1 tháng: " + numFormat.format(monthlyPayment));
		logger.info("Tiền còn lại mỗi tháng: " + numFormat.format(income - monthlyPayment));
	}

}
