class Assending{
      public static void main (String[]args){
      
      System.out.print(" Enter the first number :");
      int a= new java.util.Scanner(System.in).nextInt();

      System.out.print(" Enter the Second number :");
      int b= new java.util.Scanner(System.in).nextInt();

      System.out.print(" Enter the Third number :");
      int c= new java.util.Scanner(System.in).nextInt();

      if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Ascending Order: " + a + " " + b + " " + c);
            } else {
                System.out.println("Ascending Order: " + a + " " + c + " " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Ascending Order: " + b + " " + a + " " + c);
            } else {
                System.out.println("Ascending Order: " + b + " " + c + " " + a);
            }
        } else {
            if (a <= b) {
                System.out.println("Ascending Order: " + c + " " + a + " " + b);
            } else {
                System.out.println("Ascending Order: " + c + " " + b + " " + a);
            }
        }
      
}
}