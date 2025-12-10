import java.util.Scanner;
class Squeeze{
	public static void main(String[]args){
		String s=new String(" Hello World ");
		char []s1=s.toCharArray();
        for(int i=1; i>s1.length-2; i++){
            System.out.print(s1[i]);
		}
	}
}