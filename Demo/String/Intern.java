public class Intern {
public static void main(String args[]){
String Str1= new String("Welcome to Tutorials");
String Str2=new String("Welcome to tutorials of String");

System.out.print("Canonical representation:");
System.out.println(Str1.intern());

System.out.print("Canonical representation:");
System.out.println(Str2.intern());
}
}