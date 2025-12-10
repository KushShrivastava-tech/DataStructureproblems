class Printtriangularwise{
	public static void main(String[]args){
		int arr[][]={{23,12,56},
		           {56,52,20},
				   {20,30,98}};
				   
				   for(int i=0; i<arr.length; i++){
					   for(int j=0; j<arr[i].length; j++){
						   if(j<i){
							   System.out.print("   ");
						   }
						   else {
							   System.out.print(arr[i][j]+" ");
	                    }
					   }
					   System.out.println();
}
                      for(int i=0; i<arr.length; i++){
					   for(int j=0; j<arr[i].length; j++){
						   if(j>i){
							   System.out.print("   ");
						   }
						   else {
							   System.out.print(arr[i][j]+" ");
	                    }
					   }
					   System.out.println();
}
	}
}