class CharCount{
	public static void main(String[]args){
		  String s=new String("This is my first programme");
		  int count=0;
		  char[]s1=s.toCharArray();
		  for(int i=0; i<s1.length; i++){
			  if(s1[i]!=' '){
				  count++;
			  }
		  }
		  System.out.print("The Char count is:"+count);
	  }
}