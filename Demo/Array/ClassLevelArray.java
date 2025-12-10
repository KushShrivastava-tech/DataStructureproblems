import java.util.Scanner;
public class ClassLevelArray
{
//int z[]=new int [10];
//int z[]={10,20,30};
int z[];
public static void main(String[]args)
{
System.out.println("Enter the size of array");
int x1=new Scanner(System.in).nextInt();
ClassLevelArray ol=new ClassLevelArray();
for(int i=0;i<ol.z.length;i++)
{
ol.z[i]=new Scanner(System.in).nextInt();
}
for(int i=0;i<ol.z.length;i++)
{
System.out.print(ol.z[i]);
System.out.print("  ");
}
System.out.println("  ");
for(int x:ol.z)
{
System.out.print(x);
System.out.print("  ");
}
}
}