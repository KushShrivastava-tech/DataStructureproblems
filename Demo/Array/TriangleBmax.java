class TriangleBmax{
      public static void main(String[]args){
	  int arr[][]={{12,56,20},
		           {20,60,32},
		           {12,56,31}};
		int sum=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(j<i){
				if(arr[i][j]>sum){
				sum=arr[i][j];
				}
			}
		}
		}
		System.out.print(sum);
	}
}