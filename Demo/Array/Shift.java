class Shift{
	public static void main(String[] args){
		int arr[]={1,2,3,4};
		int []arr1=new int[4];
		int j=1;
		for(int i=0; i<arr.length-1; i++){
		arr1[i]=arr[j];
		j++;
		}
		arr1[3]=arr[0];
		for(int i=0; i<arr1.length; i++){
		System.out.print(arr1[i]+" ");
		}
	}
}