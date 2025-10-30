class Table{
     public static void main(String[]args){
     int i=1;
     int number;
     System.out.println("Enter the number :");
     number=new java.util.Scanner(System.in).nextInt();
     while(i<=10){
     System.out.println( number+ "*"+i+"=" +(number*i));

//System.out.println( "%d * %d= %d", number,i,number*i);
     i++;
    }     

}
}