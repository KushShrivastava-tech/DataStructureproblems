import java.util.Arrays;  // import this pakage for sort method.

class Sortedorder{
	public static void main(String[]args){
		String s="manish";
		char[]s1=s.toCharArray();
		Arrays.sort(s1);
		
		String s2=new String(s1);
		System.out.print(s2);
	}
}