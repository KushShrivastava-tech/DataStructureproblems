class Factorial
{
	public static void main (String[]args)throws java.io.IOException{
		int fact=1;
		int n,i;
		System.out.printf("Enter an inteager:");
		n=new java.util.Scanner(System.in).nextInt();
		
		if(n<=0){
			System.out.printf("ERROR");
		}
		else{
			for(i=1;i<=n; i++){
				fact*=i;//fact=fact*i;
			}
			System.out.printf("factoraial of %d=%d",n,fact);
		}
	}
}