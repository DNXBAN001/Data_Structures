import java.util.*;
/**
 *@author: Bandile Danxa
 */
public class Question1
{
	private static Queue<String> queue = new LinkedList<>();
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean continueStatus = true;
        String line = "";
        String firstChar = "";

        while(continueStatus)
		{
            line = input.nextLine();
            firstChar = String.valueOf(line.charAt(0)).toUpperCase();

            if(firstChar.equals("O"))
                System.out.println(displayOutput());
            
			else if(firstChar.equals("X"))
                continueStatus = false;
            
			else
                queue.add(line);
        }
        System.out.println("Program exited");
    }

	static String displayOutput()
	{
		return queue.size() == 0 ? "Buffer empty": "Data: " + queue.remove();
	}