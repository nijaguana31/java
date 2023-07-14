package program;
import java.util.HashSet;
public class HashSetCompare.java {

	    public static void main(String[] args) {
	        
	        HashSet<Integer> set1 = new HashSet<>();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);

	        HashSet<Integer> set2 = new HashSet<>();
	        set2.add(3);
	        set2.add(2);
	        set2.add(1);

	        boolean equal = set1.equals(set2);
	        if (equal) {
	            System.out.println("The HashSets are equal");
	        } else {
	            System.out.println("The HashSets are not equal");
	        }
	    }
	}
	
	
