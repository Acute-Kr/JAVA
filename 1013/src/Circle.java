import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}

class Line extends Shape {
	public Line() {
		super();
	}

	public void draw() {

		System.out.println("Line");

	}
}

class Rect extends Shape {
	public Rect() {
		super();
	}

	public void draw() {

		System.out.println("Rect");

	}

}

class Circle extends Shape {
	public Circle() {
		super();
	}

	public void draw() {
		System.out.println("Circle");

	}

}

class GrapghicEditor {

	static Scanner sc = new Scanner(System.in);
	static boolean run = true;
	static int size = 0;

	public static void main(String[] args) {
		System.out.println("rmforvldfjs");

		while (run) {
			System.out.println("삽입~~~~~");
			int a = sc.nextInt();

			process(a);
		}

	}

	private static void process(int a) {

		if(a==1 ) {
			System.out.println("Line(1), Rect(2), Circle(3)>>");
			int select = sc.nextInt();
			insert(select);
			if(size ==0) {
				insert(select);
			}
			else if (size >0) {
				insert(select, new Shape());
			}
		}
		
		if(a==2) {
			System.out.println("삭제할 도형의 위치 : ");
			int index = sc.nextInt();
			delete(index);
			
		}
		
		if() {
			watchAll();
		}

		if(a==4) {
			run = false;
		}
	}

	private static void insert(int select) {
		size++;
		Shape s = null;
		if (select == 1) {
			s = new Line();
		}
		if (select == 2) {
			s = new Rect();
		}
		if (select == 3) {
			s = new Circle();
		}

		return s;

	}

	private static void delete(int index) {
		// TODO Auto-generated method stub

	}

	private static void watchAll() {
		// TODO Auto-generated method stub

	}

}