class Mergesort{
      public static void main(String[]args){
      int arr[][]={{56,52,30},{10,50,20},{10,80,60}};
      for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
		System.out.println("Sorted rows:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
	}
}	