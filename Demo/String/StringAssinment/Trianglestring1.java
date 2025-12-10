class Trianglestring1{
	public static void main(String[]args){
		String s="appsquadz";
		char[]s1=s.toCharArray();
		int n=s1.length;
		for(int i=0; i<s1.length; i++){
			for(int j=0; j<i; j++){
			System.out.print(" ");
		}
		
		   for(int k=i; k<n;k++){
		System.out.print(s1[k]);
	}
	System.out.println();
}
}
}