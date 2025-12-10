class FindString{
	public static void main(String[]args){
		String s1="Hello World";
        String s2="World WelcomeSS";
		
	    String []s3=s1.split(" ");
		String []s4=s2.split(" ");
		
		for(int i=0; i<s3.length; i++){
			boolean find=false;
			for(int j=0; j<s4.length; j++){
		    if(s3[i].equals(s4[j])){
				find =true;
				break;
			}
			}
			if(find){
				System.out.print(s3[i]);
			}
		}
	}
}