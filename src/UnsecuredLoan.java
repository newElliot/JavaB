import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import org.apache.log4j.Logger;

import Utilities.BasePage;
public class UnsecuredLoan extends BasePage{
	
	private static Logger logger;
	public UnsecuredLoan() {
		logger = Logger.getLogger(this.getClass().getName());
	}

	public static void main(String[] args) {
		UnsecuredLoan a = new UnsecuredLoan();
		Scanner scan = new Scanner(System.in);
		DeptInformation deptInfo = new DeptInformation();
		DeptResult deptResult = new DeptResult();
		
		//Input data
		deptInfo = a.getDeptInformation(scan);
		
		//Option & Process data
		int option = 0;
		System.out.println("1. Tính theo dư nợ cố định.");
		System.out.println("2. Tính theo lãi suất phẳng.");

		option = scan.nextInt();
		switch (option) {
		case 1: {
			deptResult = a.fixedBalance(deptInfo);
			break;
		}
		case 2: {
			System.out.print("Chưa làm.");
			break;
		}
		default:{
			break;
		}
		}
		
		//Show result
		a.showResult(deptInfo, deptResult);
	}
	
	public DeptResult fixedBalance(DeptInformation deptInfo) {
		DeptResult deptResult = new DeptResult();
		
		int monthsPay = deptInfo.getLoanTerm() * 12;
		deptInfo.setMonthsPay(monthsPay);
		float totalBorrow = deptInfo.getSalary() * deptInfo.getBorrowingLimit();
		
		float aYearInterestedMoney = (totalBorrow * deptInfo.getInterestedRate()) / 100;
		float aMonthInterestedMoney = aYearInterestedMoney / 12;
		float monthlyPayment = totalBorrow / monthsPay + aMonthInterestedMoney;
		deptResult.setAYearInterestedMoney(aYearInterestedMoney);
		deptResult.setAMonthInterestedMoney(aMonthInterestedMoney);
		deptResult.setMonthlyPayment(monthlyPayment);
		deptResult.setTotalBorrow(totalBorrow);
		
		return deptResult;
	}
	
	public DeptResult decreasingBalance(DeptInformation deptInfo) {
		DeptResult result = new DeptResult();
		
		
		
		return result;
	}
	
	public DeptInformation getDeptInformation(Scanner scan) {
		DeptInformation deptInfor = new DeptInformation();
		
		System.out.print("Vay ngân hàng: ");
		deptInfor.setBankName(scan.nextLine());
		
		System.out.print("Nhập mức lương: ");
		deptInfor.setSalary(scan.nextFloat());
		
		System.out.print("Nhập thời hạn vay(năm): ");
		deptInfor.setLoanTerm(scan.nextInt());
		
		System.out.print("Nhập lãi suất ngân hàng(%/năm): ");
		deptInfor.setInterestedRate(scan.nextFloat());
		
		System.out.print("Nhập mức vay(bao nhiêu lần lương): ");
		deptInfor.setBorrowingLimit(scan.nextInt());
		
		return deptInfor;
	}

	public void showResult(DeptInformation info, DeptResult result) {
		Locale locale = new Locale("vi", "VN");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(locale);
		
		logger.info("-----------------------------------------");
		logger.info("-----------------------------------------");
		logger.info("Ngan Hang " + info.getBankName().toUpperCase());
		logger.info("Han muc: " + info.getBorrowingLimit() + " lần");
		logger.info("Lai suat 1 nam: " + info.getInterestedRate() + "%");
		logger.info("Tien vay duoc: " + numFormat.format(result.getTotalBorrow()));
		logger.info("Tra trong: " + info.getMonthsPay() + " tháng");
		logger.info("Tien loi 1 nam: " + numFormat.format(result.getAYearInterestedMoney()));
		logger.info("Tien loi 1 thang: " + numFormat.format(result.getAMonthInterestedMoney()));
		logger.info("Tien phai tra 1 thang: " + numFormat.format(result.getMonthlyPayment()));
	}
}


