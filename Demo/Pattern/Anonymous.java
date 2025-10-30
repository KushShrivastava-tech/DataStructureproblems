class Anonymous
{
int salary;
Anonymous()
{
salary=15000;
}
void show()
{
System.out.println(salary);
}
public static void main(String... s)
{
System.out.println(new Anonymous().salary);
new Anonymous().show();
System.out.println(new Anonymous());
}
}