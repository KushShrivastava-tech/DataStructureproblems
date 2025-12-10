class Rtrim{
	static String rtrim(String s){
		int i=s.length()-1;
		
		while(i<0 && s.charAt(i)==' '){
		i++;
		}
		
		return s.substring(i);
	}
	
	
	public static void main(String[]args){
		String input=new String("Hello World  ");
		
		String result=rTrim(input);
		
		System.out.println("Before: '" + input + "'");
        System.out.println("After : '" + result + "'");
	}
}
