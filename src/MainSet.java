import java.util.HashSet;
import java.util.Set;

public class MainSet {
	//SET use when you want to guarantee no duplicates entrances
	//SET has restriction of no duplicates on the set
	//The order are not relevant only cannot be duplicate
	//IMPLEMENTATIONS: HashSet, LinkedHashSet, TreeSet

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		
//		mySet.add("Stephany");
//		mySet.add("Alex");
//		mySet.add("ALINE");
//		mySet.add("Stephany");
//		mySet.add("Alex");
//		mySet.add("ALINE");
		System.out.println(		mySet.add("Stephany"));
		System.out.println(		mySet.add("Alex"));
		System.out.println(		mySet.add("ALINE"));
		
		System.out.println(		mySet.add("Stephany"));
		System.out.println(		mySet.add("Alex"));
		System.out.println(		mySet.add("ALINE"));



		System.out.println(mySet);//ORDER IN SET IS NOT RELEVANT LIKE THE EXAMPLE OF POTATO INTO THE BAG YOU PUT AND PUT AND THE ORDER IS NOT RELEVANT

	}

}
