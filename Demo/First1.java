class First1{
      public static void main(String[]args){
      System.out.print("Enter the Bikenumber :");
      int bikno=new java.util.Scanner(System.in).nextInt();

      System.out.print("Enter the Username Name :");
      String name=new java.util.Scanner(System.in).nextLine();

      
      System.out.print("Enter the Days :");
      int days=new java.util.Scanner(System.in).nextInt();
      
      int Charge=0;

      if (days>=1 && days<=5) {
       Charge=days*500;
      }

      else if (days>=6 && days<=10) {
      Charge=days*400+2500;
      }

      else if (days>10) {
      Charge= (days-10) * 200 + 4500;
      }

      else {
       System.out.print("This is not a valid day number :");
      }
    
      System.out.print("  "+bikno);
      System.out.print("  "+name);
      System.out.print("  "+days);
      System.out.print("  "+Charge);
}
}