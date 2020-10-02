
public class Main {

	public static void main(String[] args) {
		
		int[] a = new int[45]; 
		
		for(int i =0 ; i < a.length; i++) {
			a[i] = i+1;
		}
		
		shuffle(a);
		int[] b = new int[7];
		
		for(int i = 0;i < 7;i++ ) {
			b[i] = a[i];
		}
				
		for(int i=0 ; i<7 ; i++) {
			for(int j=0 ; j<7 ; j++) {
				if(b[i]<b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					
				}
			}
		}
		
		for (int i=0; i < b.length ; i++ ) {
			System.out.print(b[i] + ";");
		}
	}

	private static int[] shuffle(int[] a) {
		
		for(int i =0; i < 10000; i++) {
			
			int r = (int) (Math.random() * 45);
			
			int temp = a[0];
			
			a[0] = a[r];
			
			a[r] = temp;			
			
		}
		
		return  a;
	}

	
}
