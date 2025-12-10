class Solvestring{

    public static int expression(String s) {
        String[] arr = s.split("\\+");   // split by '+'
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + Integer.parseInt(arr[i]);   // convert string to int
        }

        return sum;
    }

    public static void main(String[] args) {
        String exp = "10+20+20+20";
        int result = expression(exp);
        System.out.println("Result = " + result);
    }
}
