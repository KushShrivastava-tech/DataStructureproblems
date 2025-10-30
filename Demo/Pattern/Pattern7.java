
class Pattern7{
	public static void main (String[]args)
	{
	
	
/*
	{   int count;
		for(int i=1; i<=10; i++){
			if(i%2!=0){
				count=0;
			}
				else{
					count=1;
				}
			for(int j=1; j<=i; j++){
				if(count%2==0){
					System.out.print("0 ");
					count++;
				}
				else{
					System.out.print("1 ");
					count++;
				}
			}
			System.out.println();
		}
		}
	}
*/


/*
0
1 0
0 1 0
1 0 1 0
0 1 0 1 0
1 0 1 0 1 0
0 1 0 1 0 1 0
1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0
1 0 1 0 1 0 1 0 1 0
*/


/*
for (int i = 1; i <= 5; i++) {
            for (int s = 0; s < 5 - i; s++){
				System.out.print("  ");
            
			}
            for (int j = 1; j <= i; j++){
				System.out.print("# ");
			}
            System.out.println();
}
}
}
*/


/*
        #
      # #
    # # #
  # # # #
# # # # #
*/


/*
for(int i=1; i<=7;i++)
{
	for(int j=1;j<=7;j++)
	{
		if(i==1|| i==4 || i==7)
		{
		System.out.print("* ");
		}
		else if(i==2 || i==3 || i==5|| i==6)
		{
			if(j==1 || j==4 || j==7)
			{
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
		}
	}
}
System.out.println();
}
}
}
*/

/*
* * * * * * *
*     *     *
*     *     *
* * * * * * *
*     *     *
*     *     *
* * * * * * *
*/


/*
for(int i=1; i<=7;i++)
{
	for(int j=1;j<=7;j++)
	{
		if(i==1 || i==7)
		{
		System.out.print("* ");
		}
		else if(i==2 || i==3 ||i==4|| i==5|| i==6)
		{
			if((j==2&&i==2) || (j==3&&i==3) || (j==4&&i==4) || (j==5&&i==5)|| (j==6&&i==6))
			{
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
		}
	}
}
System.out.println();
}
}
}
	*/
	

/*
* * * * * * *
  *
    *
      *
        *
          *
* * * * * * *
*/

/*
for(int i=1; i<=7;i++)
{
	for(int j=1;j<=7;j++)
	{
		if(i==1 || i==7)
		{
		System.out.print("* ");
		}
		else if(i==2 || i==3 ||i==4|| i==5|| i==6)
		{
			if((i==2&&j==1)||(j==2&&i==2) || (i==2&&j==6)||(i==2&&j==7)||(i==3&&j==1)||(j==3&&i==3) ||(j==5&&i==3)||(i==3&&j==7)||(i==4&&j==1)|| (j==4&&i==4)||(i==4&&j==7) ||(i==5&&j==1)||(i==5&&j==3)|| (j==5&&i==5)||(i==5&&j==7)||(i==6&&j==1)||(i==6&&j==2)|| (j==6&&i==6)||(i==6&&j==7))
			{
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
		}
	}
}
System.out.println();
}
}
}
*/


/*
* * * * * * *
* *       * *
*   *   *   *
*     *     *
*   *   *   *
* *       * *
* * * * * * *
*/

/*
for(int i=1; i<=7;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=7;k>=i;k--){
		System.out.print("* ");
	}
	System.out.println();
}
}
}
*/

/*
 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
*/


