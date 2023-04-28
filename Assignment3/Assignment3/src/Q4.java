
public class Q4 {

	public static void main(String[] args) {
		int arr[] = {9,10,6,8,5};
		int i = 0;
		int j=arr.length-1;
		int key = 10 ;  
		int swap =0;
		while(i<=j) {
			while(arr[i]<key)
				i++;
			if(arr[i]>=key && arr[j]<key) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				swap++;
			}
			else 
				j--;
		}
		System.out.println(swap);
	}	
}