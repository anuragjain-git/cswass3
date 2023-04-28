import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,1,1,2,3,5};
		Arrays.sort(arr); // 1,1,1,2,3,5,5
		int size=arr.length;
		int min = arr[0];
		int count = 1;
		for(int i=0;i<size;i++) {
			if(arr[i]-min>0) {
				System.out.println(size - i);
				min = arr[i];
				count += 1;
			}
		}
		System.out.println("Total number of reductions " + count);
	}

}
