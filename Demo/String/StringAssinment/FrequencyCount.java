class FrequencyCount {
    public static void main(String[] args) {

    String s="kkuuussssshhhh";
	char[] s1= s.toCharArray();
	int count=0;
	
	for(int i=0; i<s1.length; i++){
		count=0;
		boolean isRepeated = false;
		for(int k=0; k<i;k++){
	    if(s1[i]==s1[k]){
			isRepeated =true;
			break;
			}
		}
		
		if(isRepeated){
			continue;
		}
		
		for(int j=i; j<s1.length; j++){
			
			if(s1[i]==s1[j]){
				count++;
			}
		}
		System.out.println(s1[i] + " frequency = " + count);	
	}
	}
}