package CDC1;
import java.util.*;
public class Test23 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(78);
		System.out.println(11);
		ListIterator i1=l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		

	}

}
