import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,2,0};
		int one = 0;
		int two = 0;
		int zero = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero++;
				arr[i]=0;
			}
			else if(arr[i]==1) {
				one++;
				arr[i]=0;
			}
			else {
				two++;
				arr[i]=0;
			}
		}
		for(int i=zero;i<arr.length-two;i++) {
			arr[i]=1;
		}
		for(int i=arr.length-zero+one;i<arr.length;i++) {
			arr[i]=2;
		}
		System.out.println(Arrays.toString(arr));
	}
}