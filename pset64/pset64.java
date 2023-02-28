/* This is pset64. Follow each instruction to the letter. If you are not 
 * explicitly instructed to do something, then you don't need to do it, 
 * even if you were used to doing it in the past. 
 */
import java.util.*;

public class pset64{

	public static void main(String[] args)
    {
		//For 1)
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.println("The median value of the EVEN array is " + median(numbers1));
        
        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.println("\nThe median value of the ODD array is " + median(numbers2));
     
		//For 2)
		int[] numbers3 = {76, 75, 3, 17, 12, 22, 7};
        System.out.println("The last multiple of 3 is " + findMultipleOfThree(numbers3));   
   
		//For 3)
		Classroom c = new Classroom(2);
        
        Student ada = new Student("Ada", "Lovelace", 12);
        ada.addExamScore(44);
        ada.addExamScore(65);
        ada.addExamScore(77);

        Student alan = new Student("Alan", "Turing", 11);
        alan.addExamScore(38);
        alan.addExamScore(24);
        alan.addExamScore(31);

        // add students to classroom
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();
        
        System.out.println(ada.getStudentImprovement());
        System.out.println(alan.getStudentImprovement());
        
        Student mostImproved = c.getMostImprovedStudent();
        System.out.println("The most improved student is " + mostImproved.getName());

 }

	/* 1) Write a method called median that returns the median value in the array. 
	If the length of the array is odd, the median is the value in the center 
	of the array. If the length of the array is even, the median is the 
	average of the two numbers in the center. You may assume the array 
	passed into this method will never be empty. */
    
	public static double median(int[] arr)
    {
		if (arr.length % 2 == 0){
			int mid = arr.length / 2;
			return (arr[mid] + arr[mid - 1]) / 2.0;
		}
		else{
			int mid = arr.length / 2;
			return arr[mid];
		}
    }

	/* 2) Write a method called findMultipleOfThree that returns the last value 
	in the array that is a multiple of 3. If no multiple of 3 exists in the 
	array, return -1. For example, in the array [4, 7, 9, 7, 12] the last 
	multiple of three is 12 */

	public static int findMultipleOfThree(int[] arr)
    {
		for (int i = arr.length - 1; i >= 0; i--){
			if (arr[i] % 3 == 0){
				return arr[i];
			}
		}
        return -1;
    }

	/* 3) Complete the getStudentImprovement method in the Student class.
	
	To do this, 

		1. Find the difference between a given student's successive exams.
		2. Sum the differences.
	
	For example, if a student's exam scores were 90, 75, and 84, in that order,
	you would compute the improvement by calculating the following:

		1. 75 - 90 = -15
		2. 84 - 75 = 9
		3. -15 + 9 = -6
	
	The negative result indicates that this student did not improve as the 
	term went on. You will want to keep a running total of the differences 
	rather than sum them at the end. Think carefully about what the bounds 
	of your loop should be to prevent your loop from running off the end 
	of your exams array.

	4) Then, complete the getMostImprovedStudent method in the Classroom 
	class. Call the getStudentImprovement method to help you.

	HINT: To be able to view these instructions and work in a separate file
	at the same time, try opening multiple tabs in your terminal (if it
	supports multiple tabs -- Windows Terminal does, Mac Terminal doesn't
	I don't think). If your terminal doesn't support multiple tabs, just
	open multiple terminals -- one for each file.

	*/

}
