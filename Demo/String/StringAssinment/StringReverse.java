class StringReverse{
	public static void main(String[]args){
	String s=new String("This is first programme");
	char[] s1=s.toCharArray();
	int n=s1.length;
	for(int i=n-1;i>=0;i--){
		if (s1[i] != ' ') {
                System.out.print(s1[i]);
            }
	}
	}
}