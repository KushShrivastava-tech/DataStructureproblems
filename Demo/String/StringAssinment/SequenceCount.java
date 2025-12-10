class SequenceCount{
	public static void main(String[]args){
		String s=new String("kkkuuuusssshhhhh");
		char[] s1=s.toCharArray();
		
		int count = 1;
		for(int i=0; i<s1.length; i++){
			count=1;
			while (i + 1 < s1.length && s1[i] == s1[i + 1]) {
                count++;

                i++;
            }
			 System.out.println(s1 [i]+"The Sequence is :"+count);					 
		}
		
	}
}