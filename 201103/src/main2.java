import java.util.*;

public class main2 {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("a", 10);
		h.put("b", 20);
		System.out.println(func(h));	


	}
	
	public static int func(HashMap<String, Integer> h) {
		// TODO Auto-generated method stub
		int a = h.size();
		
		return a;
	}

	
}