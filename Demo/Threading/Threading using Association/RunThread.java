class Thread1 implements Runnable
{
int x=10;
public void run()
{
System.out.print(Thread.currentThread().getName() +x);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
}
}

class RunThread
{
	public static void main(String[]args){
		Thread1 t1=new Thread1();
		Thread tt1=new Thread(t1,"Thread");
		tt1.start();
		
	}
}