import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			while(arr[i]%2==0) {
				i++;
			}
			while(arr[j]%2==1) {
				j--;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}