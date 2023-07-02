package KunalKushwaha;

//complexity = no. of digits
public class DigitProd {
    public static void main(String[] args) {
         int n = 560;
        System.out.println(prod(n));
    }

    static int prod(int n){
        if( n%10 == n ) //if last digit is remaining return that digit only
            return n;
        return n%10 * prod(n/10);
    }
}
