class Fibonacci
{
	public static void main(String[]args)
	{
		int i,n;
		int t1=0,t2=1;
		int nextTerm = t1+t2;
		
		System.out.printf("Enter the number of terms:");
		n=new java.util.Scanner(System.in).nextInt();
		
		System.out.printf("Fibonacci Series: %d ,%d, ",t1,t2);
		
		for(i=3;i<=n;++i)
		{
			System.out.printf("%d,",nextTerm);
			t1=t2;
			t2=nextTerm;
			nextTerm = t1+t2;
		}
		
	}
}
