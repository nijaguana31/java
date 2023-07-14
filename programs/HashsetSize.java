package program;
import java.util.HashSet;
public class HashsetSize {

	
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Grapes");
	        set.add("Mango");

	        int size = set.size();
	        System.out.println("Number of elements in the HashSet: " + size);
	    }
	}
