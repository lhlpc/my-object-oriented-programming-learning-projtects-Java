
public class BSTException extends Exception{
	private String message;
	
	public BSTException(){
		this.message = "Operation not valid";
	}
	public BSTException(String message){
		this.message = message;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
