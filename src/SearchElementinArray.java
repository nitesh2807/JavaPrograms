
public class SearchElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50};
		int search_element =100;
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			if(search_element == a[i]) {
				System.out.println("Element find at "+i);
				flag=true;
				break;
			}
		}
if(flag==false) {
	System.out.println("Element not found");
}
	}

}
