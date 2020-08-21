
public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum array is "+max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum array is : "+min);

	}

}
