
public class BankAccount {

	Integer acct;
	String owner;
	double balance;
	
	public BankAccount (int a, String o, double b) {
		acct = a; owner = o; balance = b;
	}
	
	public String getOwner () { return owner; }
	
	public String toString () {
		String result = owner + "(" + acct + ") $"+ balance + "\n";
		return result;
	}
		
	public boolean equals (BankAccount b2) {
		return acct.equals(b2.acct);
	}
	
	public int hashCode () {
		int result = 0;
		result = acct * owner.hashCode();
		return result;
	}
	/*
	public boolean equals (Bank b2) {
		return acct == b2.acct;
	}
	/*
	public boolean equals (Bank b2) {
		if (acct == b2.acct)
			return true;
		else
			return false;
	}
	*/
}