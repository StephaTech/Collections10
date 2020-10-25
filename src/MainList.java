import java.util.ArrayList;
import java.util.List;

public class MainList {
	//List DO NOT ALLOW GAPS IN THE MIDDLE OF YOUR COLLECTION
	//So if you remove something from your list the next will be brought together
	//A list is an ordered collection data and IS ORDERED BY THE USER
	//Elements can be accessed by their index(where they are in the list) I understood was exemple :by ID or name 
	//DUPILCATE ENTRIES ARE ALLOWED
	//IMPLEMENTATIONS: ArrayList, LinkedList, Stack, Vector
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("Aline");
		myList.add("Steph");
		myList.add("Marcia");
		myList.add("Sandra");
		
		System.out.println(myList);// full list, output is order exactly same as my code BECAUSE THE ORDER IS RELEVANT
		System.out.println(myList.get(2));//choosing specified index from the list[]
		myList.remove(2);//removing name who is in index 2
		System.out.println(myList);//full list after the remo index 2
		myList.remove(0);
		System.out.println(myList);
		System.out.println(myList.get(1));
		System.out.println(myList);
		
	


	}

}
