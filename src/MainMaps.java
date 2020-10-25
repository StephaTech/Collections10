import java.util.HashMap;
import java.util.Map;

public class MainMaps {
//	Maps are not quite part of the Collections Framework but make use of some of the structures
//	A map maps keys to values, so rather than be stuck with our array-like ndexes to access data, we can use a pre-defined key
//	 For example rather than say Student[0] to get the name data stored in the first element we could say Student[name] to get the data
//	 We cannot have duplicate keys BECAUSE KEYS ARE UNIQUE
//	 We need to be careful if we allow mutable elements
//	Implementations:
//	HashMap, TreeMap, HashTable

	public static void main(String[] args) {
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		
		myMap.put("My Sister the Serial Killer", 2018);//Oyinkan Braithwaite 
		//myMap.put("With the Fire on High", 2019);//Elizabeth Acevedo
		myMap.put("Girl, Woman, Other", 2019);//Bernardine Evaristo
		myMap.put("Figues Hidden", 2016);//Margot Lee Shetterly
		//myMap.put("Quennie", 2019);//Candice Carty-Williams
		myMap.put("Invisible Women: Data Bias in a World Designed for Men", 2020);//Caroline Criado Perez
		myMap.put("Hello World", 2018);//Hanna Fry
		myMap.put("Algorithms to Live By:The Computer Science of Human Decisions ", 2017);
		myMap.put("Sparkling Cyanide", 1983);//Agatha Christie
		myMap.put("The Little Prince ", 2011);//Antoine de Saint-Exupery's
		
		System.out.println(myMap);
		
		myMap.put("Girl, Woman, Other", 2029);//chanh=ging value int and getting an otput below updated
		System.out.println(myMap);//updating
		myMap.remove("Hello World");//removing
		System.out.println(myMap);//
		//HEYYYYYYYYYYYYYY THE ORDER HERE ARE NOT RELEVANT
		
	}

}
