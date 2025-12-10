class EqualsString{
	      public static void main(String[]args){
		 String s1 = "INdia";
         String s2 = "India";
		
		boolean equal=true;
		 if(s1.length()!=s2.length()){
			 equal=false;
		 }else{
			 for(int i=0; i<s1.length(); i++){
				 if(s1.charAt(i)!=s2.charAt(i)){
					 equal=false;
					 break;
	         }
           }
		 }
		 if (equal) {
            System.out.println("Strings are Equal : "+equal);
        } else {
            System.out.println("Strings are NOT Equal :"+equal);
        }
    }
}