package assignment; // this is the package (named assignment) that contains the main class.

public class Weeks3And4Assignment {
	
	public static void main(String[] args) { 	// this is the main method.
		
		// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/* a. Programmatically subtract the value of the first element in the array from the value in the last element 
		 * 	  of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		 * */
		int lastMinusFirst = (ages[ages.length - 1]) - (ages[ages.length - ages.length]);
		System.out.println("The last age minus the first age of the original array is " + lastMinusFirst);
		
		// b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int newAge = 96;
		ages = addNewAge(ages.length, ages, newAge);
		lastMinusFirst = (ages[ages.length - 1]) - (ages[ages.length - ages.length]);
		System.out.println("The last age minus the first age of the new array is " + lastMinusFirst);
		
		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sumOfAllAges = 0;
		for (int age : ages) {
			sumOfAllAges += age;
		}
		double average = sumOfAllAges / ages.length;
		System.out.printf("The average age of the new array is " + "%.2f%n",average);
		
		
		// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double arrayNamesLength = 0;
		for (String name : names) {
			arrayNamesLength += name.length();
		}
		System.out.printf("The average number of letters per name is " + "%.2f%n", arrayNamesLength / names.length);
		
		// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String allNamesConcatenated = "";
		for (String name : names) {
			allNamesConcatenated += name + " ";
		}
		System.out.println(allNamesConcatenated);
		
		
		/* 3. How do you access the last element of any array?
		 * 	Call the parameter .length from any array and subtract 1 from it, since arrays start counting from 0.
		 * 	ex.: arrayName.length -1;
		 * 	You can use that in your "formula" / code or print it to the console as an argument to System.out.println() for example.
		 */
		
		
		/* 4. How do you access the first element of any array?
		 * 	Call the parameter .length from an array and subtract array.length from it. Since arrays start from 0, your result will always be zero,
		 * 	thus showing you the first element of any array.
		 * 	ex.: arrayName.length - arrayName.length;
		 * 	You can use that in your "formula" / code or print it to the console as an argument to System.out.println() for example.
		 */
		
		
		/* 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length
		 * 	  of each name to the nameLengths array.
		 */
		int[] nameLengths = new int [names.length];
	
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for (int x : nameLengths) {
			System.out.println(x);
		}
		
		
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOfElements = 0;
		for (int element : nameLengths) {
			sumOfElements += element;
		}
		System.out.println(sumOfElements);				
				
	} 	// !!!!!!!!!!MAIN METHOD CLOSING CURLY BRACKET!!!!!!!!!!!!!!!!!
	
	
	/* 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
	 * 	  (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */
	public static String repeatWord (String word, int n) {
		String longWord = "";
		for (int i = 0; n > 0; i++) {
		    longWord += word;
		    n--;
		}
		return longWord;
	}
	
	
	/* 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and
	 * 	  the last name as a String separated by a space).
	 */
	public static String createFullName (String firstName, String lastName) {
		String fullName = "";
		return fullName = firstName + " " + lastName;
	}
	
	
	// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 public static boolean isGreaterThan100 (int[] arr) {
		 int sum = 0;
		 for (int number : arr) {
			 sum += number;
		 }
		 if (sum > 100) {
			 return true;
		 }
		 return false;
	 }
	
	 
	 // 10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 public static double findAverage (double[] arr) {
		 double sum = 0;
		 for (double number : arr) {
			 sum += number;
		 }
		 return sum / arr.length;		 
	 }
	 
	 
	 /* 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than
	  * 	the average of the elements in the second array.
	  */
	 public static boolean isAverageGreater (double[] arr1, double[] arr2) {
		 double sum1 = 0;
		 for (double number : arr1) {
			 sum1 += number;
		 }
		 double average1 = sum1 / arr1.length;
		 
		 double sum2 = 0;
		 for (double number : arr2) {
			 sum2 += number;
		 }
		 double average2 = sum2 / arr2.length;
		 return average1 > average2;
		 }

	 
	 /* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is
	  * 	hot outside and if moneyInPocket is greater than 10.50.
	  */
	 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		 if (isHotOutside == true && moneyInPocket > 10.50) {
			 return true;
		 }
		 return false;
	 }
	 
	 
	 // 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 
	/* 	This is a method I created to add elements to the array "ages" using code, and not manually. It creates a new array by copying the previous
	 * 	array elements and adding one element to the last position each time it is called. I took the opportunity and called this method in the
	 * 	main method on question 1b to add a new age to my array.
	 */	
	public static int[] addNewAge (int arrayLength, int oldArray[], int newAge) { 
		 int[] newArray = new int[arrayLength + 1];
		 for (int i = 0; i < arrayLength; i++) {
			 newArray[i] = oldArray[i];
		 }
		 newArray[arrayLength] = newAge;
	     return newArray;
	 }
	
}
