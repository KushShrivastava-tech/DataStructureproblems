class FrequencyCount{
	public static void main(String[]args){
	int arr[]={2,3,2,4,3};
	int count=0;
	
	for(int i=0; i<arr.length; i++){
	    for(int j=0; j<arr.length; j++){
            if(arr[i]==arr[j]){
            count++;			
		}
		}
		System.out.println(arr[i]+" frquency is "+count);
		count=0;
	}
	}		
}