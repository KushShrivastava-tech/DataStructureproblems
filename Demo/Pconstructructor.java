class Pconstructor
{
int x;
int y;
Pconstructor(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String[]args)
{
Pconstructor d1=new Pconstructor(10,20);
d1.show();
Pconstructor d2=new Pconstructor(100,200);
d2.show();
}
}

