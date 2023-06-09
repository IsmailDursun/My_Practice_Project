package day29_tasks;

public class RemoveLongStrings {
    /*IMPORTANT!

	-Do NOT create these tasks on Java_Programming_B1 project.
	-Use the one you created for practicing. If you have not created one. You can create a new project and name it Practice_Programming

    -Add a package called day29_tasks in src folder

------------------------------------------

Tasks 1 - ReverseAll

    Create a class called ReverseAll in your Practice_Programming project and inside the day29_tasks package



        Task:
		Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words

		@param words - Given ArrayList of Strings
		@return - ArrayList of Strings


		Ex:
			Input:
				{"ted", "talk", "learn"}


			Output:
				{"det", "klat", "nrael"}


------------------------------------------

Task 2 - NumbersToSum

    Create a class called NumbersToSum in your Practice_Programming project and inside the day29_tasks package


        Task:
    	 	Create a method that will accept an ArrayList of numbers in String format,
		add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers



		Ex:
			Input:
				“123”, “34”, “513”

			Output:
				[ 6, 7, 9 ]



------------------------------------------

Task #3 - RemoveBadPairs

    Create a class called RemoveBadPairs in your Practice_Programming project and inside the day29_tasks package

        Task:

		Create a method that will accept an Integer ArrayList and check for bad pairs. A pair is an element and the element next to it.

		A bad pair is whenever the first number in the pair is bigger then the second number.
		Remove any bad pairs for the ArrayList and return the ArrayList with no bad pairs

		Note: The given ArrayList will always be an even number of elements, so each number always has one pair


		@param nums - Given ArrayList of numbers
		@return - ArrayList of numbers




		Ex:
			Input:
				{3, 4, 6, 1, 1, 10, 8, 7};
			Output:
				{3, 4, 1, 10};



			Bad pairs that were removed:

                		6, 1
                		8, 7


------------------------------------------

Task #4 - CountLetters

    Create a class called CountLetters in your Practice_Programming project and inside the day29_tasks package

        Task:
		Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements

		Ex:
			Input:
				”java”, ”html”, “css”, “java”, “javascript”, “selenium”

			letter:
				‘a’

			Output:
				6



------------------------------------------

Task #5 - AllPalindrome

    Create a class called AllPalindrome in your Practice_Programming project and inside the day29_tasks package

        Task:

		Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings Ignore case sensitivity

		Ex:

			Input:
				Anna", "Java", "Python", "Racecar", "Level", "Cydeo”, "Eye"


			Output:
				Anna, Racecar, Level, Eye



------------------------------------------

Task #6 - RemoveLongStrings

    Create a class called RemoveLongStrings in your Practice_Programming project and inside the day29_tasks package

        Task:

		Create a method that will accept an ArrayList of Strings and an int.
		Remove any String elements that have less characters than the given number.
		Return the modified ArrayList of Strings


		@param list - Given ArrayList of Strings
		@param int - max number of characters
		@return - ArrayList of Strings


		Ex:

			Input:
				”{“one,”, “two”, “three, “four”, “five”, “six”}

			number:
				4

			Output:
				{“three, “four”, “five”}


			Hint: User the removeIf method from Collections class

     */
}
