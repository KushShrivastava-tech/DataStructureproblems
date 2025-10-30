class Status{
      public static void main(String[]args){
      System.out.println("Age :");
      int Age =new java.util.Scanner(System.in).nextInt();


      System.out.println("Sex :");
      String Sex =new java.util.Scanner(System.in).nextLine();

      System.out.println("Marital Status :");
      String Marital =new java.util.Scanner(System.in).nextLine();


      if((Sex.equalsIgnoreCase("Female"))){
            System.out.println("She will work only in urban areas ");
      }
      else if((Sex.equalsIgnoreCase("Male")) &&( Age>20 && Age<40)){
             System.out.println("He work anywhere");
      }
      else if((Sex.equalsIgnoreCase("Male")) &&(Age>40 && Age<60)){
             System.out.println("He work urban area only");
      }
      else{
             System.out.println("Error");
      }
}
}