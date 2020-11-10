import java.util.ArrayList;
import java.util.List;

public class Seat {

	private static List<String> S = new ArrayList<>();
	private static List<String> A = new ArrayList<>();
	private static List<String> B = new ArrayList<>();

	Seat() {
		for (int i = 0; i < 10; i++) {
			S.add("---");
			A.add("---");
			B.add("---");
		}
	}

	public static List<String> getS() {
		return S;
	}

	public static void setS(List<String> s) {
		S = s;
	}

	public static List<String> getA() {
		return A;
	}

	public static void setA(List<String> a) {
		A = a;
	}

	public static List<String> getB() {
		return B;
	}

	public static void setB(List<String> b) {
		B = b;
	}

}
