package Project2;
import java.util.Arrays;
import java.util.Scanner;
public class Binarysearch {
	

	//public class BinarySearchDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Create an array of the specified size
	        int[] arr = new int[size];

	        // Ask the user to enter elements for the array
	        System.out.println("Enter " + size + " integers for the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Sort the array (binary search requires a sorted array)
	       Arrays.sort(arr);

	        // Display the unsorted array
	        System.out.println("Unsorted array: " + Arrays.toString(arr));

	        // Ask the user to enter a value to search for
	        System.out.print("Enter a value to search for: ");
	        int target = scanner.nextInt();

	        // Perform binary search
	        int index = binarySearch(arr, target);

	        // Display the result of the binary search
	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found in the array.");
	        }

	        scanner.close();
	    }

	    // Binary search implementation
	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid; // Element found, return its index
	            } else if (arr[mid] < target) {
	                left = mid + 1; // Search the right half
	            } else {
	                right = mid - 1; // Search the left half
	            }
	        }

	        return -1; // Element not found
	    }
	}




