
public class SumofElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,2,3,4,5};
		int sum=0;
		
		/*for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}*/
		for(int value : a) {
			sum=sum+value;
		}
		System.out.println("sum of elements in array : " +sum);
	}

}
