import java.util.ArrayList;

public class Lab00
{
   public static void main(String[] args)
   {
		//Declaring and initializing some variables.
		int x = 5;
		String y = "hello";
		double z = 9.8;
		
		// Printing the variables.
		System.out.println("x: " + x + " y: " + y + " z: " + z);
		
		// Making an array list in Java.
		ArrayList<Integer> nums = new ArrayList<>();
		{	// Adding the integers into the array list.
			nums.add(3);
			nums.add(6);
			nums.add(-1);
			nums.add(2);
		}
		
		// Printing out all the integers in the 'nums' array list.
		for (int num: nums)
			System.out.println(num);
		
		// Calls a function, in this case the 'char_count' function.
		char_count(y, 'l');
		
		// A counting for loop. Begins counting at 1 and counts until 10.
		for (int i=1; i<11; i++)
		{	// Prints all the integers from 1-10 on one line.
			System.out.print(i + " ");
		}
		
		// Prints an empty new line to match the 'lab00.py' python output.
		System.out.println();
   }
   // Declaring char_count function. Takes in a string, 's', and a character, 'c'.
   // Counts how many instances the character 'c' occurs in the string 's'.
   public static void char_count(String s, char c)
   {	// Declares the count variable.
		int count = 0;
		
		// The loop will iterate until all characters in String 's' are checked.
		for (int i=0; i<s.length(); i++)
		{	// If the current character in the string matches the character 'c' parameter, the count variable is increased.
			if (s.charAt(i) == c)
			{	// Increment the count variable.
				count++;
			}
		}
		// Prints the number of instances the character 'c' occurs in string 's'.
		System.out.println("Found: " + count);
   }
}