class TV {
	private int size;
	public TV(int size) { this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV {

	private int Color;
	protected int getcolor() {return Color;}
	public IPTV(int size, int color) {
		super(size);
		Color = color;
	}
	
	
	public void printProperty() {
		
		System.out.println(this.Color);
		System.out.println(this.getSize());
	}
}	
class IPTV extends ColorTV{

	private String index;
	
	public IPTV(String index, int size, int color) {
		super(size, color);
		this.index = index;
	}
	
	public void printProperty() {
		
		System.out.println("나의 IPTV는 " + this.index + "주소의 " + this.getSize() + "인치"  + this.getcolor() +"컬러");
	}
	
	


public static void main(String [] args) {
	IPTV iptv = new IPTV("192.1.2.2", 32, 2048);
	iptv.printProperty();
}
}