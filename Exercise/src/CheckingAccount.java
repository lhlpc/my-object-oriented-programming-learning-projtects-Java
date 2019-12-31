
public class CheckingAccount extends Account{
	
	public CheckingAccount(String onwer, String number){
		super.setOwner(onwer);
		super.setNumber(number);
	}

	@Override
	public String toString() {
		return "Number: " + super.getNumber() + "\nType: Checking" + "\nOwner: " + super.getOwner() + "\n";
	}
}

