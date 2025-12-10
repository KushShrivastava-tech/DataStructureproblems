import java.util.Scanner;
class Palindrome{
	 static boolean ispalindrome(String s){
		 int n=s.length();
		int start=0;
		int end=n-1;
		while(start<end){
			if(s.charAt(start)!=s.charAt(end)){
				return false;
			}
				start++;
				end--;
	}
	return true;
}	

	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String :");
		String s= sc.nextLine();	
		
		if(ispalindrome(s)){
			System.out.println("Pakindrome String");
		}
		else{
			System.out.println("this is not a palindrome String");
		}
	}
}
	
		
