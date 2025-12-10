class Wordfrequencycount{
	public static void main(String[]args){
		String s="india usa india china usa";
	
		String[] s1=s.split(" ");
		boolean[] visited = new boolean[s1.length];

        for (int i = 0; i < s1.length; i++) {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(s1[i] + " Frequency is: " + count);
		}
	}
}