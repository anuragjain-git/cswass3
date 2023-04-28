import java.util.HashMap;

public class Q5 {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int arr2[] = { 2, 1, 8, 3 };
		HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
		int value;

		// Count frequency

		for (int i = 0; i < arr.length; i++) {
			if (ht.containsKey(arr[i])) {
				value = ht.get(arr[i]);
				ht.put(arr[i], value + 1);
			} else {
				ht.put(arr[i], 1);
			}
		}

		// print according to arr2 and remove it

		for (int j = 0; j < arr2.length; j++) {
			if (ht.containsKey(arr2[j])) {
				value = ht.get(arr2[j]);
				for (int k = 0; k < value; k++) {
					System.out.print(arr2[j]);
				}
				ht.remove(arr2[j]);
			}
		}

		//print remaining element 
		
		for (int i = 0; i < arr.length; i++) {
			if (ht.containsKey(arr[i])) {
				value = ht.get(arr[i]);
				for (int k = 0; k < value; k++) {
					System.out.print(arr[i]);
				}
				ht.remove(arr[i]);
			}
		}

	}

}
