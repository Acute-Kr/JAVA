class Power{
	public int kick;
	public int punch;
	
	public void setkick(int kick) {
		this.kick = kick;
	}
	public void setpunch(int punch) {
		this.punch = punch;
	}
	
	
}


public class Example {

	public static void main(String[] args) {
		Power robot = new Power();
		robot.setkick(10);
		robot.setpunch(20);
	}
	

}
