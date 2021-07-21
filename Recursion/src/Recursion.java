public class Recursion {

    public static void main(String[] args) {

        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial(5));

    }

    //two types of Recursion
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }


    //n!=n*(n-1)!
    //1!=1*(1-1)!=1*0=1
    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        } else {

            return num * recursiveFactorial(num - 1);

        }

    }


}
