class LTrim{
	static String lTrim(String s) {
    int i = 0;

    while (i < s.length() && s.charAt(i) == ' ') {
        i++;
    }

    // Return substring from first non-space character
    return s.substring(i);
}

	
	
	public static void main(String[] args) {
    String input = "    Hello Java";

    String result = lTrim(input);

    System.out.println("Before: '" + input + "'");
    System.out.println("After : '" + result + "'");
}

}