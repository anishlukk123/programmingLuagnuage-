import java.util.Stack;

public class ReverseString {
	
	public static void main(String[] args) {
		
	
		String rev =reverseString("ghem");
		System.out.print(rev);
		
		
	}

	public static  String reverseString(String str)
	
	{     String revString = "";
		Stack<Character>s = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i));
		}
		for(int i =0;i<str.length();i++)
		{
			revString+=s.pop();
		}
		
return revString;
	}

}
