
public class PascalsTriangle {

	public static void main(String[] args) {
		
		pTriangle(10);
	}
	
	public static int[] pTriangle(int n){
		
		int[] array = new int[n+1];
		
		if(n==0){
			array[n] = 1;
			System.out.println(array[n]);
			return array;
		}
		
		int[] array2 = pTriangle(n-1);
		
		for(int i = 0; i < array.length; i++){
			if(i==0 || i==n)
				array[i] = 1;
			else
				array[i] = array2[i-1] + array2[i];
			System.out.print(array[i] + " ");
		}
		System.out.println();		            
		return array;
	}
	
	

}
