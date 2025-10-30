import java.util.Scanner;
class Pattern6
{
	public static void main(String[]args){
	
	/*{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++){
				System.out.print("* ");
	    }
		System.out.println();
    }*/
	
	/* *****
	   *****
	   *****
	   *****
	   ***** */
	   
	   
	/*{
	   int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(" " +count);
				count++;
	        }
		count=1;
		System.out.println(); 
	    }
    }
  }  */
  
      /* 1 2 3 4 5 
	     1 2 3 4 5 
		 1 2 3 4 5 
		 1 2 3 4 5 
		 1 2 3 4 5 */
		 
		 
	
	/*{
	   int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(" " +count);
				
	        }
		count++;
		System.out.println(); 
	    }
    }
  } */
  
  
     /* 1 1 1 1 1 
	    2 2 2 2 2
		3 3 3 3 3
		4 4 4 4 4
		5 5 5 5 5
		*/
		
		
	/*{
	   int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(" " +count);
				count++;
	        }
		System.out.println(); 
	    }
    }
  }*/
  
  
    /* 12345
	   678910
	   1112131415
	   1617181920
	   2122232425 */
	   
	   
	/*{
		for(int i=1; i<=5; i++)
		{
			for (int j = 1; j <= 5; j++) {
            if (j % 2 == 1) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
		}
		System.out.println();
    }
  }
  }*/
  
    
	/* 10101
	   10101
	   10101
	   10101
	   10101 */
	   
	   
	   /* {
		   int count=1;
		for(int i=0; i<5; i++)
		{
			for (int j = 1; j <= 5; j++) {
            System.out.print(" "+count);
		}
		if (i % 2 == 1) {
                count=1;
            } else {
                count=0;
            }
		System.out.println();
    }
  }
  } */
  
       /* 11111
	      00000
		  11111
		  00000
		  11111  */
	   
	   
	   /*{
		int n=1;
		int count=1;
		for(int i=0; i<5; i++)
		{
			for (int j = 1; j <= 5; j++) {
            System.out.print(" "+count);
			count++;
		}
		count=1;
		count=count+n;
		n++;
		
		System.out.println();
    }
  }
  }*/
  
 /*
       {
		char alphabet='A';
		for(int i=1; i<=5; i++)
		{
			for (int j = 1; j <= 5; j++) {
            System.out.print(" "+alphabet);
			alphabet++;
			
		}
		alphabet= 'A';
		System.out.println();
    }
  }
 } 
 
   /* A B C D E
      A B C D E
      A B C D E
      A B C D E
      A B C D E
 
    */
		   
	  
	  
	/*{
	   int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i%2 == 1)
				{
				System.out.print("* ");
				}
				else{
				System.out.print(i+" ");	
				} 
	    }
		System.out.println();
    }
  }
}*/




   /* * * * * *
      2 2 2 2 2
      * * * * *
      4 4 4 4 4
      * * * * *  */
	
	
	/*{
	   int count=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				{
				System.out.print(count+" ");
				count--;
				} 
	    }
		System.out.println();
		count=5;
    }
  }
  }*/
  
  
    /*  5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1  */
		
		
		
	
	/* {
	   int count=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(count+" ");
	    }
		count--;
		System.out.println();
    }
  }
  } */
  
  
    /* 5 5 5 5 5
       4 4 4 4 4
       3 3 3 3 3
       2 2 2 2 2
       1 1 1 1 1  */
	   
	   
	   
	/* {   
	   int n=1;
	   int count=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(count+" ");
				count--;
	    }
		count=5;
		count= count+n;
		n++;
		System.out.println();
    }
  }
  }  */
  
  
  /*  5 4 3 2 1
      6 5 4 3 2
      7 6 5 4 3
      8 7 6 5 4
      9 8 7 6 5   */
	  
	  
	/* {   
	   int n=0;
	   int count=1;
		for(int i=1; i<=5; i++)
		{
			if(i%2 == 0){
				n=1;
				count=0;
			}
			
			else{
			n=0;
			count=1;
			}
			for(int j=1; j<=5; j++)
			{
				if(j%2==1){
				System.out.print(count+" ");
	        }
		        else{
		        System.out.print(n+" ");
		        }
			}
		System.out.println();
    }
  }
  } */
  
  
 /* 1 0 1 0 1
    0 1 0 1 0
    1 0 1 0 1
    0 1 0 1 0
    1 0 1 0 1  */
	
	
	
	/*{   
	   int n = 1; // row shift

        for (int i = 1; i <= 5; i++) {
            char value = (char) ('A' + n - 1); // starting character of row
            for (int j = 1; j <= 5; j++) {
                System.out.print(value + " ");
                value++; // move to next character
            }
            n++; // shift start for next row
            System.out.println();
    }
  }
  }*/
  
      /* A B C D E
         B C D E F
         C D E F G
         D E F G H
         E F G H I  */
		 
		 
		
		/*{   
	   int n = 1; // row shift

        for (int i = 1; i <= 5; i++) {
            char value = (char) ('E' + n - 1); 
            for (int j = 1; j <= 5; j++) {
                System.out.print(value + " ");
                value--;
            }
            n++; 
            System.out.println();
        }
    }
 }
 */
        /*E D C B A
          F E D C B
          G F E D C
          H G F E D
          I H G F E  */

       
      /* {   
	   int n = 1; // row shift

        for (int i = 1; i <= 5; i++) {
            char value = (char) ('E' + n - 1); 
            for (int j = 1; j <= 5; j++) {
                System.out.print(value + " ");
            }
            n++; 
            System.out.println();
        }
    }
 }       
 }      */
       

        /*E E E E E
          F F F F F
          G G G G G
          H H H H H
          I I I I I  */



          /*   {   
	   int n = 1; // row shift

        for (int i = 1; i <= 5; i++) {
            char value = (char) ('E' + n - 1); 
            for (int j = 1; j <= 5; j++) {
                System.out.print(value + " ");
                value--;
            }
             
            System.out.println();
        }
    }
 }
 }*/
 
 
        /*   E D C B A
             E D C B A
             E D C B A
             E D C B A
             E D C B A  */
			 
             
		/*	 {   
        for (int i = 1; i <= 5; i++) {
            char value = (char) ('A'); 
            for (int j = 1; j <= 5; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
 }
 } */
 /*
          A B C D E
          A B C D E
          A B C D E
          A B C D E
          A B C D E
 */
 
     /* for(int i=0; i<=4;i++){
		  System.out.println("*");
	  }
	  }
	  }*/
	  /*
	  
	  *
	  *
	  *
	  *  */
	  
	  
 
		/*for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("* ");
				
	        }
		System.out.println(); 
	    }
    }
  }*/
  
  
  
    /*
	   int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(" " +count);
				
	        }
		count++;
		System.out.println(); 
	    }
    }
  }*/
  
  
  
  /*{ 
int count=1;
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print(" " +count);
				count++;
	        }
		count++;
		System.out.println(); 
	    }
    }
  }
 }   */
  
  
      /*   1 2 3 4
           6 7 8 9
           11 12 13 14    */  
  
  /*
  {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
				
	        }
			for(int j=1; j<=5-i; j++)
			{
				System.out.print("*");
				
	        }
		System.out.println(); 
	    }
    }
  }
  }/*       
  
  /*
          ****
           ***
            **
             *         */
  
  
 /*      
 {
	 for(int i=5; i>=1; i--)
	       {
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
		System.out.println(); 
	    }
    }
  }  
  }
  /*     /*
            *****
            ****
            ***
            **
            *   */
  
  
       /* 
	   {
		 for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
				
	        }
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
	        }
		System.out.println(); 
	    }
    }
  }
  } */
  
          /* 
		   *
          **
         ***
        ****
      ****** */


/*
int rows=5;
for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" ");
				
	        }
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
				
	        }
		System.out.println(); 
	    }
    }
  }		   /*
  
            /*      *
                   * *
                  * * *
                 * * * *
                * * * * *    */
  
  /*
  
  int rows=5;
for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print(" ");
				
	        }
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
				
	        }
		System.out.println(); 
	    }
		
		int rows1=5;
        for(int i=1; i<=rows1; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
				
	        }
			for(int j=1; j<=rows1-i; j++)
			{
				System.out.print("* ");
				
	        }
			
		System.out.println(); 
	    }
    }
  }	*/
      
	  /*               *
                      * *
                     * * *
                    * * * *
                   * * * * *
                    * * * *
                     * * *
                      * *
                       *   */


/*
int rows=9;
for(int i=0; i<rows/2; i++)
		{
			for(int j=0; j<rows/2-i; j++)
			{
				System.out.print(" ");
				
	        }
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
				
	        }
		System.out.println(); 
	    }
		for(int i=rows/2; i>=0; i--){
			for(int j=0;j<rows/2-i; j++){
				System.out.print(" ");
    }
	for(int k=0; k<=i; k++){
		System.out.print("* ");
  }	
  System.out.println();
		}
		}
		}
		*/
		
		
		
		/* int rows=5;
		for(int i=0;i<rows; i++){
			for(int j=0; j<rows; j++){
				if(i==0 || i==rows-1 || j==0 || j==rows-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}
		} /*
		
		
		
	/*	*****
        *   *
        *   *
        *   *
        *****  */
		
		
	/*  {	
	for(int i=1; i<=5; i++){
			for(int j=1;j<=5-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				if(i==1 || i==5 || j==1 || j==i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
		}
}		/*  

        /*
                     *
                    * *
                   *   *
                  *     *
                 * * * * * */
		
		
		
		/*
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<n; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++){
				if(j==1 || j==(2*i-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			for(int i=n-1; i>0; i--){
				for(int j=n;j>i; j--){
					System.out.print(" ");
				}
				for(int j=1; j<=(2*i-1); j++){
					if(j==1 || j==(2*i-1)){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
		}
		}
		}
		} 
}		*/
		
	/*	{
		int n=4;
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
		for(int i=n-2; i>=0;i--){
			for(int j=0; j<=i; j++){
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
		}
		}
		} */
		
		
		/*
A
BB
CCC
DDDD
CCC
BB
A        */
		
		/*
		  int n = 5;

        // Upper half (inverted pyramid)
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }

        // Lower half (normal pyramid)
        for (int i = 2; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
*/

/*
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/

 /*
  {
	  char value='A';
	  char value1='a';
	  for(int i=1; i<=5; i++){
		  value='A';
		  value1='a';
		  if(i%2!=0)
		  {
		  for(int j=1; j<=5; j++){
			  System.out.print(" "+value);
		  value++;
		  }
		  }
		  else{
		  for(int k=1; k<=5; k++){
			  System.out.print(" "+value1);
			  value1++;
		  }
		  }
		  System.out.println();
	  }
	  
    }
 }
 }
 */
 
 /*
 A B C D E
 a b c d e
 A B C D E
 a b c d e
 A B C D E
 */
 
 /*
  {
	  int number=1;
	  char value1='A';
	  for(int i=1; i<=5; i++){
		  number=1;
		  value1='A';
		  if(i%2!=0)
		  {
		  for(int j=1; j<=5; j++){
			  System.out.print(" "+number);
		  number++;
		  }
		  }
		  else{
		  for(int k=1; k<=5; k++){
			  System.out.print(" "+value1);
			  value1++;
		  }
		  }
		  System.out.println();
	  }
	  
    }
 }
 }
 */
 
 /*
 
 1 2 3 4 5
 A B C D E
 1 2 3 4 5
 A B C D E
 1 2 3 4 5
 */
 
 /*
 {
	 int number=1;
	 for(int i=1; i<=5; i++){
		 for(int j=1; j<=i;j++){
			 System.out.print(" "+number);
		 }
		 number++;
		 System.out.println();
 }
 }
 }
 }
 */
 /*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 */
 
 /*
 {
	 int number=5;
	 for(int i=1; i<=5; i++){
		 for(int j=1; j<=i;j++){
			 System.out.print(" "+number);
		 }
		 number--;
		 System.out.println();
 }
 }
 }
 }
 */
 
 /*
 5
 4 4
 3 3 3
 2 2 2 2
 1 1 1 1 1
 */
 
 /*
 {
	 int number=1;
	 for(int i=1; i<=5; i++){
		 
		 for(int k=5;k>i;k--){
		    System.out.print("  ");
		 }
		 for(int j=1; j<=i;j++){
			 System.out.print(" "+number);
			 number++;
		 }
		 number=1;
		 number=number+i;
		 System.out.println();
 }
 }
 }
 }*/
 
 /*
         1
       2 3
     3 4 5
   4 5 6 7
 5 6 7 8 9
 */
 
 /*
 {
	 int number=1;
	 for(int i=1; i<=5; i++){
		 
		 for(int k=5;k>i;k--){
		    System.out.print("  ");
		 }
		 for(int j=1; j<=i;j++){
			 System.out.print(" "+number);
			 number--;
		 }
		 number=number+1;
		 number=number+i+1;
		 System.out.println();
 }
 }
 }
 }*/
 
 /*
         1
       3 2
     5 4 3
   7 6 5 4
 9 8 7 6 5
 */
 
 /*
 {
	 for(int i=1; i<=5; i++){
		 
		 for(int k=5;k>i;k--){
		    System.out.print("  ");
		 }
		 for(int j=1; j<=i;j++){
			 System.out.print("* ");
		 }
		 
		 System.out.println();
 }
 }
 }
 }*/
 
 /*
        *
      * *
    * * *
  * * * *
* * * * *
*/

/*{
	 for(int i=1; i<=5; i++){
		 
		 for(int k=5;k>i;k--){
		    System.out.print(" ");
		 }
		 for(int j=1; j<=i;j++){
			 System.out.print("* ");
		 }
		 
		 System.out.println();
 }
 }
 }
 }*/
 
 /*
    *
   * *
  * * *
 * * * *
* * * * *
*/

/*
{
for(int i=1; i<=5;i++){
	for(int j=1; j<=5; j++){
		if(i==1|| i==5|| j==1|| j==5){
		System.out.print("* ");
	}
	else{
		System.out.print("  ");
	}
}
System.out.println();
}
}
}
} */
/*
* * * * *
*       *
*       *
*       *
* * * * *
*/

/*
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=1;
for(int i=1;i<=n; i++){
   for(int j=1;j<=i;j++){
	   System.out.print(" Enter the number: "+count);
	   count++;
   }
 System.out.println();  
}
}
}
	   */



/*


int i,j,sp,n;

System.out.println("Enetr the number :");
n=new java.util.Scanner(System.in).nextInt();
sp=0;
for(i=0;i<2*n;i++)
{
	if(i<n)
	{
		System.out.printf("@");
		for(j=0;j<sp;j++)
		{
			System.out.printf(" ");
		}
		for(j=0;j<n;j++){
			System.out.printf("*");
		}
		sp=sp+n-1;
		if(i+1==n){
			System.out.printf("@");
			sp++;
		}
	}
	else if(i==n){
		System.out.printf("@");
	    for(j=0;j<sp;j++)
		{
			System.out.printf(" ");
		}
		System.out.printf("@");
	}
	else{
		for(j=0;j<sp+1;j++){
			System.out.printf(" ");
		}
		System.out.printf("@");
	}
		System.out.printf("\n");
	}
}
}
*/
/*
5
@*****
@    *****
@        *****
@            *****
@                *****@
@                     @
                      @
                      @
                      @
                      @
					  */
					  


/*			  
int i,j,n,sp=1;

System.out.println("Enetr the number :");
n=new java.util.Scanner(System.in).nextInt();
if(n>=2)
{
	for(i=0;i<n*3;i++)
	{
		if(i<n)
		{
			System.out.printf("@");
		}
		else if(i<n*2)
		{
			if(i==n)
			{
				System.out.printf("@");
			}
			if(i!=n){
				for(j=0;j<sp;j++)
				{
					System.out.printf(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				System.out.printf("*");
			}
			sp=sp+n-1;
			if((i+1)==(2*n))
			{
				sp++;
				System.out.printf("@");
			}
		}else{
			for(j=0; j<sp; j++){
				System.out.printf(" ");
			}
			System.out.print("@");
		}
		System.out.println();
	}
	
}else{
	System.out.println("Invalid Input");
}
}
}*/

/*
@
@
@
@
@
@*****
     *****
         *****
             *****
                 *****@
                      @
                      @
                      @
                      @
                      @
					  */
					  
/*				

int i,j,n,sp,x=1;

System.out.println("Enetr the size :");
n=new java.util.Scanner(System.in).nextInt();
sp=n/2;
if(n>=5 && n%2!=0)
{
	for(i=0;i<n/2+1;i++)
	{
		for(j=0;j<sp-i;j++)
		{
			System.out.printf(" ");
		}
		for(j=0;j<x;j++){
			System.out.printf("*");
		}
		x+=2;
		System.out.printf("\n");
	}
	sp=n-2;
	for(i=0;i<n/2+1;i++)
	{
		System.out.printf("@");
		for(j=0;j<sp;j++)
		{
			System.out.printf(" ");
		}
		System.out.printf("@");
		System.out.printf("\n");
	}
	x=1;
	sp=1;
	for(i=0;i<n/2; i++)
	{
		System.out.printf("@");
		for(j=0;j<n/2-sp;j++)
		{
			System.out.printf(" ");
		}
		for(j=0;j<x;j++)
		{
			System.out.printf("*");
		}
		for(j=0;j<n/2-sp;j++){
			System.out.printf(" ");
		}
		System.out.printf("@");
		System.out.printf("\n");
		x+=2;
		sp++;
	}
	for(i=0;i<x;i++)
	{
		System.out.printf("*");
	}
}
else{
	System.out.printf("\nInvalid Input");
}
}
}

*/



/*
int i,j,n,sp,x;

System.out.println("Enetr the size :");
n=new java.util.Scanner(System.in).nextInt();
sp=n/2;
x=n;
if(n>1 && n%2!=0)
{
	for(i=0;i<n/2+1;i++)
	{
		for(j=0;j<sp+i;j++){
			System.out.printf(" ");
		}
		for(j=0;j<x;j++)
		{
			System.out.printf("@");
		}
		System.out.printf("\n");
		x-=2;
	}
	sp=n-2;
	for(i=0;i<n;i++)
	{
		System.out.printf("*");
		for(j=0;j<sp;j++)
		{
			if(i==0)
			
				System.out.printf("*");
			
			else
				System.out.printf(" ");
			}
			System.out.printf("*");
			System.out.printf("\n");
		}
	}
	else{
		System.out.printf("\nInvalid");
	}		

	}
	}*/
	
/*
Enetr the size :
5
  @@@@@
   @@@
    @
*****
*   *
*   *
*   *
*   *
*/