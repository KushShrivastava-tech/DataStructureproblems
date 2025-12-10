class BinaryToDecimal{
	public static void main (String[]aergs){
		
		int[]arr={1,0,1,1};
		int decimal=0;
		for(int i=0;i<arr.length;i++){
			decimal = decimal * 2 + arr[i];
        }

        System.out.println(decimal);
	}
}