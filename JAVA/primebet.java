import java.util.*;

public class primebet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("Primes between " + a + " and " + b + " are: ");
        for (int i = 0; i < b; i++) {
            if (isPrime(i))
                System.out.println(i + "\t");
        }
        s.close();
    }
    
    public static boolean isPrime(int n )
    {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for( int i =5; i*i<=n; i+=6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
