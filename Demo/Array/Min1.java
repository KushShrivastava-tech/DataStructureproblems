class Min1{
public static void main(String[]args)
{
int arr[][]={{10,20,50,},{50,20,60},{80,60,50}};
int min=arr[0][0];
for(int i=0; i<arr.length;i++)
{
for(int j=0;j<arr.length; j++){
if(arr[i][j]<min){
min=arr[i][j];
}
	}
}
	System.out.print(" max arr is"+min);
}
}