import java .util.Arrays;

class Sortedword{
	public static void main(String[]args){
		String s="india aus china japan";
		
		String[] words = s.split(" ");   //this line important

        // Sort words alphabetically
        Arrays.sort(words);      //this line important

        for (String word : words) {
            System.out.print(word + " ");
        }
	}
}