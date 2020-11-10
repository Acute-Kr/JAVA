
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	static <T> T take(T s[], int index)
	{
		if (index > s.length) {
			System.out.println(" 인덱스가 범위를 벗어났습니다");
			return null;
		}
		return s[index];
	}
}
