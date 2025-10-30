class Leapornot{
      public static void main (String[]args){
      System.out.println("Enter the year number :");
      int year=new java.util.Scanner(System.in).nextInt();;

      if((year%400==0 ) || (year%4 ==0 && year%100 != 0)){
      System.out.println("This is leap year :");
      }
      else{
      System.out.println("This is not leap year :");
      }
   }
}
      

             