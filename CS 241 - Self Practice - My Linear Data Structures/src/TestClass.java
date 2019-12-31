
public class TestClass {

	public static void main(String[] args) {
		LStack<Integer> stack = new LStack<Integer>();
		int i;
		
		stack.push(8);
		stack.push(1);
		stack.push(5);
		stack.push(9);
		stack.push(2);
		
		sortStack(stack);
		
		//print stack
		
		while(stack.length()!=0){
			i = stack.pop();
			
			System.out.println(i);
		}
		
		
		System.out.println(factorial(4));
	}
	
/**Sort the stack passed as parameters*/
	public static void sortStack(LStack<Integer> stack){
		LList<Integer> list = new LList<Integer>();
		
		//Transfer items to a linked list and sort them
		while(stack.length() != 0){
			int item  = stack.pop();
			
			if(list.length()==0){
				list.insert(item);
				continue;
			}
			
			list.moveToStart();
			for(int i=0; i<=list.length(); i++){
				
				if(i==list.length()){
					list.append(item);
					break;
				}
				if (item >= list.getValue()){
					list.insert(item);
					break;
				}
				else
					list.next();
			}
			
		}
		
		//Transfer items of the list back to the stack
		list.moveToStart();
		while(list.length()!=0){
			stack.push(list.remove());
		}
	}
	
	public static long factorial(long number){
		LStack<Long> stack = new LStack<Long>();
		long fact = 1;
		for(long i = number; i>0; i--){
			stack.push(i);
		}
		
		while(stack.length()!=0)
			fact *= stack.pop();
			
		return fact;
		
	}
	
}
