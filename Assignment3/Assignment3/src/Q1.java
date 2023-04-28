import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,0,1};
		int arr[] = {0,0,0,1,1,0,1,1,1};
		int j = arr.length-1;
		int i=0;
		int swap = 0;
		 while(i<=j){
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
				i++;
				swap++;
			}
			else if(arr[i]==arr[j] && arr[i]==1) {
				j--;
			}
			else if(arr[i]==arr[j] && arr[i]==0) {
				i++;
			}
			else {
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Swaps : "+swap);
	}
}