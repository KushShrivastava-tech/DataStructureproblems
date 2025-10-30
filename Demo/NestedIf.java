class NestedIf
{
public static void main(String[]args)
{
       System.out.println("Enter the first number :");
       int number1=new java.util.Scanner(System.in).nextInt();
       System.out.println("Enter the second number:");
       int number2=new java.util.Scanner(System.in).nextInt();

           if(number1>=number2){
             if(number1==number2){
              System.out.printf("Result: %d=%d", number1,number2);
             }
            else{
             System.out.printf("Result: %d>%d", number1,number2);
            }
          }
            else{
             System.out.printf("Result: %d<%d", number1,number2);
            }

}
}