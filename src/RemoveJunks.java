
public class RemoveJunks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " @#$% length 023 @#$    ";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
