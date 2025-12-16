import java.io.*;
class Car implements Externalizable
{
static int age;;
String name;
int year;

/*
mandatory public no-arg constructor
*/
public Car(){
	System.out.println("default")
}

Car(String n, int y){
	name=n;
	year=y;
	age=10;
}
/*
Mandatory writeExernal method
*/
public void writeExernal(ObjectOutput out) throws IOException{
	System.out.println("writeExernal");
	out.writeObject(name);
	out.writeInt(year);
	out.writeInt(age);
}

/*
Mandatory writeExernal method
*/
public void writeExernal(ObjectOutput out) throws ClassNotFoundException{
	System.out.println("readExernal");
	name=(String) in.readObject();
	year=in.readInt();
	age=in.readInt();
}

public String toString(){
	return ("Name: "+name+"\n"+"Year:"+year+"\n"+"age:"+age);
}

public class ExternExample{
	public static void main(String args[])
	{
		//create a car object
		Car car=new Car("MG Hector",2019);
		Car newCar=null;
		
		//serialize the car
		try{
			FileOutputStream fo=new FileOutputStream("tmp");
			ObjectOutputStream so=new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
		}catch(Exception e){
			System.out.println(e);
		}
		
		//de-serialize the Car
		try{
			FileInputStream fi=new FileInputStream("tmp");
			ObjectInputStream si=new ObjectInputStream(fi);
			newCar=(Car)si.readObject();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("The original car is");
		System.out.println(car);
		System.out.println("The new car is ");
		System.out.println(newCar);
	}
}
			
			
			