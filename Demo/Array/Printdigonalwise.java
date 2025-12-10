class Printdigonalwise{
          public static void main (String[]args){
		  int sum=0;
		  int sum1=0;
		  int arr[][]={{23,12,56},
		               {56,52,20},
					   {20,30,98}};
		  for(int i=0; i<arr.length; i++){
		     for(int j=0; j<arr[i].length; j++){
		     if(j>i || j<i){
			    sum1=0;
			 }
			 else{
			 sum+=arr[i][j];
		 }
		}
	}
		System.out.print(sum);
  }
}