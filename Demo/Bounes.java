class Bounes{
      public static void main(String[]args){
      
      int totalsalary=0;
      System.out.print("Enter the year :");
      int year=new java.util.Scanner(System.in).nextInt();

      System.out.print("Enter the salary :");
      int salary=new java.util.Scanner(System.in).nextInt();
      
      if(year>5)
      {
      totalsalary=(salary)+(salary*5)/100;
      }

      else
      totalsalary=salary;
      System.out.println("Total salary :"+totalsalary);
      
      
}
}