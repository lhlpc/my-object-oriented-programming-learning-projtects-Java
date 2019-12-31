


public class Main {

	
	public static void main(String[] Args){
		
		int position = biggestSequenceSize(new int[]{5, 3, 4, 8, 6, 7, 4, 10, 2, 9});
	
		System.out.println(position);
	}
	
	
	public static int biggestSequenceSize(int[] sequence){
		
		int biggestSequence[] = new int[sequence.length]; 
		
		for(int i = 0; i < biggestSequence.length; i++){
			biggestSequence[i] = 1;
		}
		
		
		for(int i = 0; i < sequence.length; i++){
			for(int j = i-1; j >= 0; j--){
				
				if(sequence[j] <= sequence[i] && biggestSequence[j] + 1 > biggestSequence[i]){
					
					biggestSequence[i] = biggestSequence[j] + 1;
				}
			}
			
		}
		
		int positionOfBiggestSequenceEnd = 0;
		
		for(int i = 0; i < biggestSequence.length; i++){
			
			if(biggestSequence[i] > biggestSequence[positionOfBiggestSequenceEnd]){
				positionOfBiggestSequenceEnd = i;
			}
			
		}
		
		
		return positionOfBiggestSequenceEnd;
	}
}
