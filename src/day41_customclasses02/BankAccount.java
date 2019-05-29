package day41_customclasses02;

public class BankAccount {
double balance;
String accountHolder;
int accountNumber;

		public void deposit(double amount) {
			System.out.println("depositing $"+amount+" to "+accountNumber);
			balance+=amount;
		}
		
		public void withdraw(int amount) {
			System.out.println("withdrawing $"+amount+" from "+accountNumber);
			balance-=amount;
			if (balance<0) {
				balance-=35;
			}
		}
		
		public void showBalance() {
			System.out.println("======================================");
			System.out.println("Account holder: "+accountHolder);
			System.out.println("Account number: "+accountNumber);
			System.out.println("Balance: "+balance);
		}
		
		public void charge(double price, String item) {
			if (balance>=price) {
				System.out.println("buying "+item+" for $"+price+" from "+accountNumber);
				balance-=price;
			}
			else {
				System.out.println("Insufficient funds to purchase "+item+" from "+accountNumber);
			}
		}
		
		
		
}
