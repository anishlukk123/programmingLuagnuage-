import java.util.Stack;

public class BalancedExpressions {

	public static void main(String[] args) {

		String str = "{}";
	boolean result	= balancedexpressions(str);
	System.out.println(result);

	}

	private static boolean balancedexpressions(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i) == '{')
			{
				stack.push('{');
			}
			else
			{
				if(str.charAt(i) == '}'&&stack.isEmpty())
				{
					return false;
				}
				else
				{
					stack.pop();
				}
				
			}
					
		}
		return stack.isEmpty();
		
		
		
		
	}

}
