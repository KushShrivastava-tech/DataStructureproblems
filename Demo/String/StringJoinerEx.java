import java.util.StringJoiner;
class StringJoinerEx{
public static void main(String args[])
{
	//StringJoiner sj=new StringJoiner(",");//seprated the elements with a common in between
	
	StringJoiner sj=new StringJoiner(",","(",")");//adding prefix and suffix
	sj.add("Lalu");
	sj.add("Kumar");
	sj.add("Yadav");
	System.out.println(sj);
}
}