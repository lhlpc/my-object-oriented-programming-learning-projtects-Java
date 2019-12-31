
public class StackTester {

	public static void main(String[] args) {
		
		LinkedStack s1 = new LinkedStack();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		
		while(!s1.isEmpty()){
			System.out.println(s1.pop());
		}
	}

}
