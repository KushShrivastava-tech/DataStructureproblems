import java.util.Scanner;
class Union{
      public static void main (String[]args)
	  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the length of array :");
	  int n=sc.nextInt();
	  System.out.println("the length of array is:"+n); 
	  int[]arr=new int[n];
	  int[]arr1=new int[n];
	  int[]arr2=new int[2*n];
	  n=arr.length;
	  int k=0;
	  System.out.println("Enter the number of elements arr :");
	  for(int i=0; i<arr.length; i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println("Enter the number of elements arr1 :");
	  for(int j=0; j<arr1.length; j++)
	  {
		  arr1[j]=sc.nextInt();
	  }	  
	  
	  for(int i=0; i<arr.length; i++)
	  {
		System.out.print(arr[i]+" ");
	  }	 
	  System.out.println();
	  for(int j=0; j<arr1.length; j++)
	  {
		System.out.print(arr1[j]+" ");
	  }	
	 
	  System.out.println();
	  
		 for(int i=0; i<n; i++)
		 {
			 arr2[k++]=arr[i];
		 }
		 
		 for(int i=0; i<n; i++){
			 boolean found=false;
			 for(int j=0; j<k; j++){
				 if(arr1[i]==arr2[j]){
					 found=true;
					 break;
				 }
			 }
			 if(!found){
				 arr2[k++]=arr1[i];
			 }
		 }
			 

        System.out.println("Union of two arrays: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr2[i] + " ");
	}
  }
}

