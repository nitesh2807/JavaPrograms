
public class CountCharOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is a programming language";
		int total_count = str.length();
		int Remove_Char = str.replaceAll("a", "").length();
		int count = total_count -Remove_Char;
		System.out.println(count);
		
	}

}
