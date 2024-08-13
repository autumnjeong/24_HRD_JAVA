package day06;

class Account{
	
	private long balance;
	
	public Account() {
	}
	
	public long getBalance() {
		return balance;
	}
	
	//예금하기
	public void depositint (int money) {
		balance += money;
	}
	
	//출금하기
	public void withdraw (int money) throws InsufficientException {
		if(balance<money) {
			throw new InsufficientException("잔고 부족: "+(money-balance)+"모자람");
		}
		balance -= money;
	}
}

public class AccountExam {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.depositint(10000);
		System.out.println("예금액: "+account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch(InsufficientException e ) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}

}
