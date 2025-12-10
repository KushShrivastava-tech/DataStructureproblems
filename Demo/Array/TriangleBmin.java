class TriangleBmin{
       public static void main(String[]args){
		   int arr[][]={{12,56,20},
		             {20,60,32},
		             {12,56,31}};
		int min=arr[1][0];
		//int sum= arr[0][1]+arr[0][2]+arr[1][2];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(j<i){
				if(arr[i][j]<min){
					min=arr[i][j];
				}
				}
			}
		}
		System.out.print(min);
}
}