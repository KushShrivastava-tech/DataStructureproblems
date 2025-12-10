class Intersection{
      public static void main (String[]args){
	  int arr[]={50,20,80,30,40};
	  int arr1[]={20,80,30,50,10};
	  int arr2[]=new int[arr.length];
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  for(int j=0;j<arr.length; j++)
		  {
			  if(arr[i]==arr1[j]){
				 arr2[i]= arr[i];
			  }
			  
		  }
	  }
	  for(int i=0; i<arr2.length; i++)
	     {
		 System.out.print(arr2[i]);
	  }
    }
}