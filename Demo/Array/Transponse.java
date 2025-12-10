class Transponse{
      public static void main (String[]args)
	  {
	  int arr[][]={{12,23,56},{14,56,20}};
	  int arr2[][]=new int[3][2];
	  
	  
	  for(int i=0; i<arr.length; i++){
		  for(int j=0; j<arr[i].length; j++){
			  arr2[j][i]=arr[i][j];
		  }
		  for(int j=0; j<arr2[i].length; j++){
		      System.out.print(arr2[j][i]+" ");
		  }
	  }

	  
  }
}