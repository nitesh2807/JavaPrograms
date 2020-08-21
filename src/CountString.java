
public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = " No of Digits is 22 "	;
int vowels=0,consonants=0,spaces=0,digits=0;
str=str.toLowerCase();

for(int i=0;i<str.length();++i) {
	char ch=str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		++vowels;}
	else if(ch>='a'&&ch<='z') {
		++consonants;
	}
	else if(ch>='0'&&ch<='9') {
		++digits;
	}else if(ch==' '){
		++spaces;
	}
	
}
System.out.println(vowels);
System.out.println(consonants);
System.out.println(digits);
System.out.println(spaces);

}
}
