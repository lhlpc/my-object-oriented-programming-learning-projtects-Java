//***********************************************************
// TestQueue
// A driver to test the methods of the QueueADT implementations.
//**********************************************************
public class TestQueue {
	public static void main(String[] args) {
		QueueADT q = new LinkedQueue();
		System.out.println("\nEnqueuing chocolate, cake, pie, truffles:");
		q.enqueue("chocolate");
		q.enqueue("cake");
		q.enqueue("pie");
		q.enqueue("truffles");
		System.out.println("\nHere's the queue: " + q);
		System.out.println("It contains " + q.size() + " items.");
		System.out.println("\nDequeuing two...");
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println("\nEnqueuing cookies, profiteroles, mousse, cheesecake, ice cream:");
		q.enqueue("cookies");
		q.enqueue("profiteroles");
		q.enqueue("mousse");
		q.enqueue("cheesecake");
		q.enqueue("ice cream");
		System.out.println("\nHere's the queue again: " + q);
		System.out.println("Now it contains " + q.size() + " items.");
		System.out.println("\nDequeuing everything in queue");
		while (!q.isEmpty())
			System.out.println(q.dequeue());
		
		System.out.println("\nNow it contains " + q.size() + " items.");
		if (q.isEmpty())
			System.out.println("Queue is empty!");
		else
			System.out.println("Queue is not empty -- why not??!!");
	}
}