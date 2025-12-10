class Trianglestring3{
	public static void main(String[]args){

        String s = "appsquadz";
        char[] ch = s.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(ch[j]);
            }

            for (int space = 0; space < i * 2; space++) {
                System.out.print(" ");
            }

            for (int k = i; k < n; k++) {
                System.out.print(ch[k]);
            }

            System.out.println();
        }
    }
}
