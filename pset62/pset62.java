/* This is pset62. Follow each instruction to the letter. If you are not 
 * explicitly instructed to do something, then you don't need to do it, 
 * even if you were used to doing it in the past. 
 */

 public class pset62{
    public static void main(String[] args){
		/* 1) Declare and initialize a String array to contain the 
		 * values "I", "love", and "git", in that order. You 
		 * MUST call this array strArr.
		*/
		String[] strArr = {"I","love","git"};
		/* 2) Declare and initialize an int array of length 50. Then set its 
		 * first and second values to 1. This array MUST be called fibArr. 
		 * Don't change any of the other 48 values.
		*/
		int[] fibArr = new int[50];
		fibArr[0] = 1;
		fibArr[1] = 1;
		/* 3) Declare and initialize a double array to contain the values 
		 * 50.7, 302.23, 1.0, and 1245.134, in that order. You MUST call your 
		 * array fibArr.
		*/
		double[] dbArr = {50.7,302.23,1.0,1245.134};
		/* 7) Call your printStringArray method on strArr.*/
		printStringArray(strArr);
		/* 8) Call your sumDoubleArray method on dbArr.*/
		sumDoubleArray(dbArr);
		/* 9) Call your fibFifty method on intArr */
		fibFifty(fibArr);
	}

	/* 4) Write a public static method called printStringArray that 
	 * prints out the contents of strArr, each on their own line.
	*/
	public static void printStringArray(String[] arr){
		for(String e:arr){
			System.out.println(e);
	}}
	/* 5) Write a public static method called sumDoubleArray that sums up 
	 * all of the values in a double array and returns the sum.
	*/
	public static double sumDoubleArray(double[] arr){
		double sum = 0;
		for(double e:arr){
			sum += e;
		}
		return sum;
	}

	/* 6) Write a public static method called fibFifty that takes an int array 
	 * as its sole parameter and edits the 3rd through 50th spots in it to 
	 * contain the 3rd-50th fibonacci numbers. You can assume that the array 
	 * it takes will always have values of 1 in their first two spots 
	 * (which are the first two fibonacci numbers) and 0s in the 3rd through 
	 * 50th spots. fibFifty must return an int array with the first 50 
	 * fibonacci numbers.*/
	public static int[] fibFifty(int[] arr){
		for(int i = 2; i < arr.length; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr;
	}
}
