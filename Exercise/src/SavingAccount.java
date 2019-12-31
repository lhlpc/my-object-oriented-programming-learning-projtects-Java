
public class SavingAccount extends Account {
	
	public SavingAccount(String owner, String number){
		super.setOwner(owner);
		super.setNumber(number);
	}
	
	@Override
	public String toString() {
		return "Number: " + super.getNumber() + "\nType: Saving" + "\nOwner: " + super.getOwner() + "\n";
	}	
}
