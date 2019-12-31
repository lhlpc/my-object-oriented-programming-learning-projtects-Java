public class ListTest {

	public static void main(String[] args) {

		CircularList list = new CircularList(1);


		list.insertInTheFront(2);
		list.insertInTheFront(3);
		list.insertInTheFront(4);
		list.insertInTheFront(5);
		
		list.print();

		System.out.println(list + "\nLength: " + list.getLength());
		/*int position;
		try {
			position = list.linearSearch(0);
			System.out.println("Position of 0: " + position);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			list.deleteLastOne();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);*/
		/*Integer[] array = { 1, 2, 3, 4, 5 };

		System.out.println(binarySearch(array, 2, 0, array.length - 1));
*/
	}

	public static int binarySearch(Integer[] array, int number, int front,
			int end) {
		if (array.length == 0)
			return -1;
		/*
		 * if(array.length==1){ if(number==array[front]) return front; else
		 * return -1; }
		 */

		if (front == end) {
			if (number == array[front])
				return front;
			else
				return -1;
		}

		if (number <= array[(front + end) / 2])
			return binarySearch(array, number, front, (front + end) / 2);
		else
			return binarySearch(array, number, (front + end) / 2 + 1, end);
		// the +1 is added for the method to be possible to look in the right
		// positions and have an end.
	}

}
