class Min{
public static void main (String[]args){
int arr[]={10,40,30,80};
int minelement=arr[0];
for(int i=0;i<arr.length; i++){
if(arr[i]< minelement){
	minelement=arr[i];
}
}
System.out.print("the max arr is="+minelement);
}
}