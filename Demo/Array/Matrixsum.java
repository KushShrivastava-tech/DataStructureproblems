class Matrixsum{
      public static void main (String[]args)
	  {
	  int arr[][]={{12,23,56},{14,56,20}};
	  int sum=0;
	  
	  for(int i=0; i<arr.length; i++){
		  for(int j=0; j<arr[i].length; j++){
			  sum+=arr[i][j];
		  }		  
	  }	  
	  System.out.print(sum+" ");
  }
}