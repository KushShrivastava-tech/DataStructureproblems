class WordCount{
	public static void main(String[]args){
		int count=1;
	String s=new String ("This is my first String question");
	char[]s1=s.toCharArray();
	for(int i=0; i<s1.length; i++){
		if(s1[i]==' '){
		count++;
		}
	}
	System.out.print("in the sentence the words are :" +count);
}
}