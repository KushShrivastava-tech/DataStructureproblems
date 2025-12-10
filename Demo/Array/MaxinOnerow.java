class MaxinOnerow{
      public static void main (String[]args){
	  int arr[][]={{23,12,56},
		           {56,52,20},
				   {20,30,98}};
	  
	  for(int i=0; i<arr.length; i++){
		  int sum=0;
		  for(int j=0; j<arr[i].length; j++){
			  if(arr[i][j]>sum){
			  sum=arr[i][j];
		  }
		  }
		  System.out.println("Max in one row is:"+sum);
	  }
	}
}