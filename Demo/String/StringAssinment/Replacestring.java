class Replacestring{
      public static void main(String[]args){
		 String s1 = "Welcome India";
         String s2 = "India";
         String s3 = "Bharat";
		 
		 String[] s4=s1.split(" ");
		 String[] s5=s2.split(" ");
		 String[] s6=s3.split(" ");
		  
		  for(int i=0;i<s4.length; i++){
			  for(int j=0;j<s5.length; j++){
		      if(s4[i].equals (s5[j])){
				 s1=s1.replace(s4[i],s6[j]);
			  }
		  }
		  }
		  System.out.print(s1);
	  }
}