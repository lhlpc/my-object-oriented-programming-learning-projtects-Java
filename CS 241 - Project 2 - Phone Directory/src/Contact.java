/**
 * @author Luiz Henrique Leite Paes da Costa
 * 
 * CS 241 - Data Structures and ALgorithms
 * 
 * This class represents a contact, which has a name and a phone number.
 * 
 * */
public class Contact {
	
	private String number;
	private String name;
	
	public Contact(String name, String number){
		this.name = name;
		this.number = number;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
