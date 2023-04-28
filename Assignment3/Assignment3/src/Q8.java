import java.util.Arrays;

public class Q8 {

	public static void main(String[] args) {
		int arr1[] = {1,2,6,8,90};
		int arr2[] = {3,4,5,6,70};
		int i = 0;
		while(i < arr1.length) {
			if(arr1[i] <= arr2[0])
				i+=1;
			else {
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
				i+=1;
				for(int k=0;k<arr2.length-1;k++) {
					if (arr2[k] < arr2[k + 1])
						break;
					else {
						int swap = arr2[k];
						arr2[k] = arr2[k+1];
						arr2[k+1] = swap;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
