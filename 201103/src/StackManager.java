import java.util.ArrayList;

public class StackManager {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i = 0; i < 10; i++)
			stack.push(i);
		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.println(n + " ");
		}
	}

}

class MyStack<T> implements IStack<T> {
	ArrayList<T> a = null;

	public MyStack() {
		a = new ArrayList<T>();
	}

	@Override
	public T pop() {

		if (a.size() == 0)
			return null;
		else
			return a.remove(0);
	}

	@Override
	public boolean push(T ob) {

		a.add(0, ob);
		return true;
	}

}