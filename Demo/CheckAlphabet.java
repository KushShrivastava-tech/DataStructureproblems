class CheckAlphabet{
public static void main(String s[]) throws java.io.IOException
{
System.out.println("Enter the character");
int x=System.in.read();

char ch=(char)x;
if(ch=='M'  || ch=='m')
System.out.println("Male");
else
System.out.println("Female");
System.out.println(x);
System.out.println(ch);
}
}



class CheckAlphabet1{
public static void main(String s[]) throws java.io.IOException
{
System.out.println("Enter the character");
int x=System.in.read();

char ch=(char)x;
if(ch=='A'  || ch=='a'  || ch=='e' ||ch=='E'  || ch=='i' ||ch=='I'  || ch=='o' ||ch=='O'  || ch=='u' ||ch=='U')
System.out.println("Vowel");
else
System.out.println("Consonent");
System.out.println(x);
System.out.println(ch);
}
}



