package CollectionHashMap;

public class BankCustomer {
	private long accountNumber;
	private String name;
	private int age;
	private String bankName;
	private boolean isSavingsAccount;
	private String ifscCode;
	public void setaccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getaccountNumber() {
		return accountNumber;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
	this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setbankName(String bankName) {
		this.bankName = bankName;
	}
	public String getbankName() {
		return bankName;
	}
	public void setSavingsAccount(boolean isSavingsAccount) {
		this.isSavingsAccount = isSavingsAccount;
	}
	public boolean getisSavingsAccount() {
		return isSavingsAccount;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public BankCustomer(long accountNumber, String name, int age, String bankName, boolean isSavingsAccount,
			String ifscCode) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.age = age;
		this.bankName = bankName;
		this.isSavingsAccount = isSavingsAccount;
		this.ifscCode = ifscCode;
	}

	public String toString() {
		return  "AccountNumber ,"+"accountNumber=" + accountNumber + ", name=" + name + ", age=" + age + ", bankName="
				+ bankName + ", isSavingsAccount=" + isSavingsAccount + ", ifscCode=" + ifscCode ;
	}
	
		
	

}
