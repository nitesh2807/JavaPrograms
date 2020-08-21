
public class RemoveSpaces {

	public static void main(String[] args) {
	
		String str = "Java is a very good programming language ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
