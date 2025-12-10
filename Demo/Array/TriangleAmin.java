class TriangleAmin{
	public static void main(String[]args){
				int arr[][]={{12,56,20},
		                     {20,60,32},
		                     {12,56,31}};
		int min = arr[0][1];
		int arr1[][]=new int [1][3];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(j>i){
				if(arr[i][j]<min){
				 min=arr[i][j];
				}
			}
		}
		}
		System.out.print(min);
	}
}