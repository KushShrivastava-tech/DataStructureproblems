class Prime{
      public static void main(String[]args){
      int count=0;
      System.out.println(" Enter the number :");
      int number=new java.util.Scanner(System.in).nextInt();

      for(int i=1; i<=number; i++){
      int z=number%i;

      if(z==0)
{
count++;
}
}
if(count==2){
System.out.println( "it is prime ");
}
else{
System.out.println("Not prime");

}
}