class Length{
	public static void main(String[]args)
	{
		String s=new String("This is my java programme");
		int count=0;
		char[] arr=s.toCharArray();
		for(int i=0; i<arr.length; i++ ){
			count++;
			}
          	System.out.print("The length of the String is : "+count);	
	}
}