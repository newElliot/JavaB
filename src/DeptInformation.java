
public class DeptInformation {
	public String bankName;
	public float salary;
	public int loanTerm;
	public int monthsPay;
	public float interestedRate;
	public int borrowingLimit;
	
	public DeptInformation() {
		
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public int getLoanTerm() {
		return this.loanTerm;
	}
	
	public int getMonthsPay() {
		return this.monthsPay;
	}
	
	public float getInterestedRate() {
		return this.interestedRate;
	}
	
	public int getBorrowingLimit() {
		return this.borrowingLimit;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	public void setMonthsPay(int monthsPay) {
		this.monthsPay = monthsPay;
	}
	
	public void setInterestedRate(float interestedRate) {
		this.interestedRate = interestedRate;
	}
	
	public void setBorrowingLimit(int borrowingLimit) {
		this.borrowingLimit = borrowingLimit;
	}
}
