import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
//		Vector vector = new Vector();
//		
//		for(int i = 0; i<11; i++){
//			vector.add(i, i+1);
//		}
//		
//		System.out.println(vector);
//		vector.remove(0);
//		System.out.println(vector);
//		vector.setSize(100);
//		System.out.println(vector);
//		System.out.println(vector.contains(0));
//		
//		Vector v2 = new Vector(vector);
//		
//		System.out.println(v2);
		
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(search(array, 1));
		System.out.println(search(array, 2));
		System.out.println(search(array, 3));
		System.out.println(search(array, 4));
		System.out.println(search(array, 5));
		
	}
	
	public static int search(int[] array, int n){
		
		if(array.length==0)
			return -1;
		return binarySearch(array, n, 0,array.length-1);
	}
	
	private static int linearSearch(int[] array, int number, int position ){
		if(position==array.length-1){
			if(number==array[position])
				return position;
			else
				return -1;
		}
		
		if(number==array[position]){
			return position;
		}
		else
			return linearSearch(array, number, position+1);
	}
	
	
	private static int binarySearch(int[] array, int number, int front, int end){
		if(front==end){
			if(number==array[front]){
				return front;
			}
			else
				return -1;
		}
		
			if(number<=array[(front+end)/2]){
				return binarySearch(array, number,front, (front+end)/2);
			}
			else
				return binarySearch(array, number, (front+end)/2+1, end);
	}
	
	
	

}
