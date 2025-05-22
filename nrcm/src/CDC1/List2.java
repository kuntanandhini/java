package CDC1;
import java.util.*;
public class List2 {
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(34);
		l1.add(35);
		l1.add(78);
		l1.add(45);
		l1.add(44);
		l1.add(67);
		l1.add(50);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(35);
		l1.remove(0);
		System.out.println(l1);
	}

}
