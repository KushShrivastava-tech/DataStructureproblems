class Trianglestring2{
	public static void main(String[]args){
		String s="appsquadz";
		char[]s1=s.toCharArray();
		int n=s1.length;
		for(int i=n; i>0; i--){
			for(int j=0; j<i; j++){
			System.out.print(s1[j]);
		}
		System.out.println();
	}
}
}
