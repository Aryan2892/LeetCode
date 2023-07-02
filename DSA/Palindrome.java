package KunalKushwaha;

//reverse using recursion
public class Palindrome {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(palin(n));
    }

    static int rev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits - 1) + helper(n/10,digits -1);
    }

    static boolean palin(int n){
            return n == rev2(n);
    }
}
