package b2b.test;

public class DuplicateNumber {
	
	public static void main(String args[]) {
		
		int arr[] = {10,20,30,10}; 
		int [] arr1 = new int[10] ;
		for(int j=1;j<arr.length;j++)
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[j]);	
			{
			arr1[i]=arr[i];
				}
			System.out.println("Resulted array"+arr1);
		}
		
		
	}

}


