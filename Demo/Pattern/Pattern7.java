
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


/*
for(int i=0; i<11;i++){
	System.out.print("# ");
}
System.out.println();
for(int i=1; i<=5; i++){
	for(int k=5-i; k>0; k--){
		System.out.print("  ");
	}
	
	for(int j=1; j<(3+i); j++){
		System.out.print("@  ");
	}
	System.out.println();
	
}
for(int i=1; i<5; i++){
	for(int k=0; k<i; k++){
		System.out.print("  ");
	}
	for(int l=0; l<7-i; l++){
		System.out.print("@  ");
	}
	System.out.println();
}
for(int i=0; i<11; i++){
	System.out.print("# ");
}
}
}
*/

/*

# # # # # # # # # # #
        @  @  @
      @  @  @  @
    @  @  @  @  @
  @  @  @  @  @  @
@  @  @  @  @  @  @
  @  @  @  @  @  @
    @  @  @  @  @
      @  @  @  @
        @  @  @
# # # # # # # # # # #
*/


for(int i=0; i<10; i++){
		if(i==0){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("A ");
			}
			if(j==11){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==1){
		for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("L ");
			}
			if(j==1){
				System.out.print("* ");
			}
			if(j==10){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==2){
		for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("T ");
			}
			if(j==2){
				System.out.print("* ");
			}
			if(j==9){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==3){
		for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("M ");
			}
			if(j==3){
				System.out.print("* ");
			}
			if(j==8){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==4){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("E ");
			}
			if(j==4){
				System.out.print("* ");
			}
			if(j==7){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==5){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("T ");
			}
			if(j==5){
				System.out.print("* ");
			}
			if(j==6){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==6){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("R ");
			}
			if(j==6){
				System.out.print("* ");
			}
			if(j==5){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==7){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("I ");
			}
			if(j==7){
				System.out.print("* ");
			}
			if(j==4){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==8){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("C ");
			}
			if(j==8){
				System.out.print("* ");
			}
			if(j==3){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==9){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("S ");
			}
			if(j==9){
				System.out.print("* ");
			}
			if(j==2){
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
		}
		
		if(i==10){
			for(int j=0;j<=11; j++){
			if(j==0){
				System.out.print("A ");
			}
			if(j==10){
				System.out.print("A ");
			}
			if(j==1){
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


				
			