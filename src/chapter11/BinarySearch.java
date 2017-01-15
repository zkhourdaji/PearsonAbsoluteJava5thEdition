package chapter11;

public class BinarySearch {

	/**
	 * Searches the array a for a key. If key is not in the array segment,
	 * then -1 is returned. Otherwise returns an index in the segment such
	 * that key == a[index].
	 * Precondition: a[first] <= [first+1] <= ... <= a[last]
	 */
	
	public static int search(int[]a, int first, int last, int key){
		
		int result = 0; // to keep the compiler happy.
		
		if (first > last) // stopping case
			result = -1;
		else{
			int mid = (first + last) / 2;
			
			if (key == a[mid]) // stopping case
				result = mid;
			else if (key < a[mid])
				result = search(a, first, mid - 1, key);
			else if (key > a[mid])
				result = search(a, mid + 1, last, key);
		}
		return result;
		
	}
}
