class VowelCount
{
	public static void main(String[]args){
		String s=new String("Kush Shrivastavaaaa");
		int count=0;
		char[] v={'a','e','i','o','u','A','E','I','O','U'};
		char[] v1=s.toCharArray();
		for(int i=0; i<v.length; i++){
			for(int j=0; j<v1.length; j++){
			if(v[i]==v1[j]){
				count++;
			}
			}
		}
		System.out.print(count);
	}
}