import java.util.*;

public class Bigtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,BankAccount> ht = new Hashtable<Integer,BankAccount>(54);

		BankAccount b1 = new BankAccount (123456, "Fred", 14456.53);
		ht.put (123456, b1);
		for (int i = 1; i < 10; i++) {
			int number = 1593*i+586291*i;
			ht.put (number, new BankAccount (number,"Fred"+i, 1000000.00));
		}
		
		int i = b1.hashCode();
		int a = "sahs".hashCode();
		for (Enumeration<BankAccount> e = ht.elements(); e.hasMoreElements();)
		       System.out.println(e.nextElement());
		
	}

}