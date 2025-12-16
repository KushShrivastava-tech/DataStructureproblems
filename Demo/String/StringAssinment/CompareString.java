class CompareString{
	public static void main(String[]args){
		String s1="SHRIVASTAVA";
        String s2="SHRYVASTAVA";
		
		char[]s3=s1.toCharArray();
		char[]s4=s2.toCharArray();
		int i=0;
		int j=0;
		
		int n1=s3.length;
		int n2=s4.length;
		
		boolean isSame = true;
		if(n1==n2){
			
			for(i=0;i<n1;i++){
		    if (s3[i] != s4[i]) {
            isSame = false;
             break;
		}
	}
	     if (isSame) {
                System.out.println("The String is same");
            } else {
                System.out.println("The String is not same");
            }
		}
		else{
		     System.out.print("The String is not same :");
		}
}
}