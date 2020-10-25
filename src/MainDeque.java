import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {
	/* A Deque stands for a double-ended-queue FIFO
	This means that it is a linear structure that allows addition and removal
	from both ends of the structure
	We can add to front, or end, remove from front or end, or examine front
	or end...CANNOT HAVE GAPS AND CANNOT BE REMOVAL OR ADD FROM THE MIDDLE
	There is no indexed access, unlike with the list
	Implementations:
	ArrayDeque, LinkedList*/


	public static void main(String[] args) {
		
		Deque<String> myDeque = new ArrayDeque<String>();
		
		myDeque.add("Mother"); //FRONT
		myDeque.add("Father");
		myDeque.add("Sister");
		myDeque.add("Brother");
		myDeque.add("Granny");//BACK
	
		System.out.println(myDeque);
		
		myDeque.removeFirst();
		myDeque.removeLast();
		System.out.println(myDeque);
	}

}
