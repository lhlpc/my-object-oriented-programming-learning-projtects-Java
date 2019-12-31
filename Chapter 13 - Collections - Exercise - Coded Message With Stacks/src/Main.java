import java.util.*;

public class Main {
	public static void main(String[] args){
		
		System.out.println(codeMessage("Luiz Henrique"));
		
	}
	
	//Code and decode the message
	public static String codeMessage(String message){
		Stack<Character> stack = new Stack<Character>();
		String result = "";
		
		//Pushing characters into the Stack
		for(int i = 0; i < message.length(); i++){
			stack.push(new Character(message.charAt(i)));
		}
		
		//Poping characters from the stack and adding them to the result string
		while(!stack.isEmpty()){
			result += stack.pop(); 
		}
		return result;
	}

}
