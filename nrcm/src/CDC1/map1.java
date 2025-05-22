package CDC1;
import java.util.*;
public class map1 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(1, "cse");
		m1.put(2, "ece");
		m1.put(3, "eee");
		m1.put(6, "ds");
		m1.put(5, "civil");
		m1.put(4, "aiml");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet());
		m1.put(null,null);
		m1.put(null,null);
		m1.put(6, "ds");
	}
		

}
