import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		int arr1[] = {12,32,34,30,5,8,33};
		int arr2[] = {12,40,2,60,45};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int f = 0; int s = 0;
		int Uarr[] = new int[arr1.length+arr2.length-1];
		int Iarr[] = new int[Math.min(arr1.length, arr2.length)];
		int Uindex = 0; int Iindex = 0;
		
		while(f<arr1.length && f<arr2.length) {
			if(arr1[f]==arr2[s]) {
				Uarr[Uindex++]=arr1[f];
				Iarr[Iindex++]=arr1[f];
				f += 1;
				s += 1;
			}
			else if(arr1[f]<arr2[s]) {
				Uarr[Uindex++]=arr1[f];
				f+=1;
			}
			else {
				Uarr[Uindex++]=arr2[s];
				s+=1;
			}
		}
		while(f<arr1.length) {
			Uarr[Uindex++] = arr1[f];
			f+=1;
		}
		while(s<arr2.length) {
			Uarr[Uindex++] = arr2[s];
			s+=1;
		}
		System.out.println(Arrays.toString(Uarr));
		System.out.println(Arrays.toString(Iarr));
	}
	
}
