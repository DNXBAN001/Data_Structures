import java.util.*;

public class Question2
{
	static Stack<Character> stack1 = new Stack<>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = "";
		System.out.println("Enter a string to test: ");
		str = input.nextLine();
		
		//Go through all the characters in the string (brackets)
		for(int i = 0; i < str.length(); i++)
		{
			if(isOpeningBracket(str.charAt(i)))
				stack1.push(str.charAt(i));

			//If the last element of the stack and the current character in the string correspond
			//Then remove the opening bracket from the stack
			if(stack1.size() > 0)
    		{
			    if(correspondingBracket(stack1.get(stack1.size()-1)) == str.charAt(i))
				    stack1.pop();
    		}
		}
		if(stack1.empty())
			System.out.println("The string is correct! There are no mismatched brackets.");
		
		else
		{
			System.out.print("Error: The following have no corresponding match(s) ");
			if(stack1.size() > 0)
    		{
    			for(int i = 0; i < stack1.size(); i++)
    				System.out.print(stack1.get(i)+", ");
    		}
		}
			
		
	}
	static boolean isOpeningBracket(char character)
	{
		switch(character)
		{
			case '<':
			case '[':
			case '(':
			case '{':
			    return true;
		}
		return false;
	}
	static boolean isClosingBracket(char character)
	{
		switch(character)
		{
			case '>':
			case ']':
			case ')':
		    case '}':
			    return true;
		}
		return false;
	}
	static char correspondingBracket(char character)
	{
		switch(character)
		{
			case '<':
				return '>';
			case '{':
				return '}';
			case '[':
				return ']';
			case '(':
				return ')';
		}
		return ' ';
	}
}