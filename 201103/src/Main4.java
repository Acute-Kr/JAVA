import java.util.Scanner;
import java.io.File;

public class Main4 {


	public static void main(String[] args) {
		
		File f = new File("c:\\");
		File[] subfiles = f.listFiles();
	
		for(int i=0; i<10; i++) {
			System.out.print(subfiles[i].getName());
			System.out.println("\t파일크기 : " + subfiles[i].length());
			
		}
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		if(a=="..") {
			f.getParent();
		}
		
		
		
	}

}
