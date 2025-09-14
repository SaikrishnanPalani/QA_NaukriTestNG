package account.com;

public class BankAccount {

	public void Info() {
		
		String Name = "Sai Krishnan Palani";
		long Accno= 934577788;
		
		
		System.out.println("Account holder Name:"+ Name);
		System.out.println("Account number::"+ Accno);
		System.out.println("Hello");
		
	}
	
	public void Deposit() {
		
		int a = 20000;
		
		System.out.println("Deposit Amount is:"+ a);
		
	}
	
	public void Withdraw() {
		
		int b = 10000;

		System.out.println("Withdraw Amount is:"+ b);
				
	}

	public void Balance() {
		
		int a = 20000;
		int b = 10000;
		int c = a-b;
		System.out.println("Balance Amount is:"+ c);
		
	}
	public static void main(String args[]) {
		BankAccount bank = new BankAccount();
		bank.Info();
		bank.Deposit();
		bank.Withdraw();
		bank.Balance();
		
	}
		
		
		


}






