class Trianglestring4{
	public static void main(String []args)
	{
		String s="appsquadz";
		char[]s1=s.toCharArray();
		int i,j;
		int n=s1.length;
	for( i=1; i<=6; i++){
		for( j=0; j<7-i; j++){
			System.out.print(s1[j]);
		}
		
		for( j=0; j<3+i; j++){
			System.out.print("  ");
		}
		
		for( j=2+i; j<9; j++){
			System.out.print(s1[j]);
		}
		
		System.out.println();
	}
  }
}