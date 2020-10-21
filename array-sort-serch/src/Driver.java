import java.util.Scanner;

public class Driver {
	
	public static int[] sort(int[] numArray) {
		for(int i = 1; i < numArray.length; i++) {
			for(int j = i; j > 0; j--) {
				if(numArray[j] < numArray[j-1]) {
					int d = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j] = d;
				}
			}

		}
		return numArray;
	}
	
	public static boolean search(int[] numArray, int num) {
		
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers wants to add?");
		
		int[] arraynum = new int[input.nextInt()];
		System.out.println("Enter the numbers");
		
		for(int i = 0; i < arraynum.length; i++) {
			arraynum[i] = input.nextInt();
		}
		System.out.println("Enter the number for searching in the array");
		int searchNum = input.nextInt();
		
		boolean found = search(arraynum, searchNum);
		
		if(found == true) {
			System.out.println(searchNum + "�@is in the list");
			
		} else {
			System.out.println(searchNum + "�@is not in the list");
		}
		System.out.println("---------------------------------------");
		System.out.println("Sorted Array");
		int[] sortedArray = new int[arraynum.length];
		sortedArray = sort(arraynum);
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}
	}

}
