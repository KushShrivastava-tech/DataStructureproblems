public class Split
{
public static void main (String args[])
{
String str=new String("Welcome-to-Tutorial-of-String");
//String Str=new String("Welcome-to-Tutorial-of-String");

System.out.println("Return Value :");

String s[]=str.split("-",2);
for(int i=0; i<s.length; i++)
{
System.out.println(s[i]);
}
System.out.println("");
s=str.split("-",3);

System.out.println("Return Value :");
for(int i=0; i<s.length; i++)
{
System.out.println(s[i]);
}
System.out.println("");
s=str.split("-");
System.out.println("Return Value:");

for(int i=0;i<s.length; i++)
{
System.out.println(s[i]);
}
}
}