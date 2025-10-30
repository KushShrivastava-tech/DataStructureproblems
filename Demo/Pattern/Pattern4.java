class Pattern4
{
	public static void main(String[]args)
	{
		int i,space,rows,k=0,count=0,count1=0;
		
		System.out.printf("Enter an inteager:");
		rows=new java.util.Scanner(System.in).nextInt();
		for(i=1;i<=rows; ++i)
		{
			for(space=1;space<=rows-i; ++space){
				System.out.printf("  ");
				++count;
			}
			while(k!=2*i-1)
			{
				if(count<=rows-1)
				{
					System.out.printf("%d ",i+k);
					++count;
			}
			else
			{
				++count1;
				System.out.printf("%d ",(i+k-2*count1));
		}
		++k;
			}
			count1=count=k=0;
			System.out.printf("\n");
	}
}
}