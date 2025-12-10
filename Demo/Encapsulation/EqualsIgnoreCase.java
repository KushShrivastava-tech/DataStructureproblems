public class EqualsIgnoreCase
{
public static void main (String args[]){
String Str1=new String("This is really not immutable !!");
string Str2=Str1;
String Str3=new String("This is really not immutable!!");
String Str4=new String("This Is Really Not Immutable!! ");
boolean retVal;

retVal=Str1.equals(Str2);
System.out.println("Returned Value ="+ retVal);

retVal= Str1.equals(str3);
System.out.println("Returned Value="+retVal);

retVal= Str1.equalsIgnoreCase(str4);
System.out.println("Returned Value="+retVal);
}
}