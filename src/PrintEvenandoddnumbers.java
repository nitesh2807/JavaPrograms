
public class PrintEvenandoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		System.out.println(" Even numbers in array.....");
		/*for(int i =0;i<a.length;i++ ) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}*/
		for(int values:a) {
			if(values%2==0) {
				System.out.println(values);
			}
		}
			System.out.println("Odd numbers in array.....");
			/*for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}*/
			for(int values:a) {
				if(values%2==0) {
					System.out.println(values);
				}
			}

	}

}
