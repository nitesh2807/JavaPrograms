import java.util.Arrays;

public class Equalityoftwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		int b[] = {1,2,3,5,5};
		boolean status =Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}

}
