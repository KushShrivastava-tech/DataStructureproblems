class Infinitedo{
     public static void main(String[]args){
     int i=1;
     double number , sum=0.0;
     do{
     System.out.println("Enter the number :");
     number=new java.util.Scanner(System.in).nextInt();

     if(number<0.0){
     break;
     }

     sum+=number;
}while(true);
    System.out.println( " "+sum);

}
}