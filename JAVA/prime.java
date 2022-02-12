class prime{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        if (n == 2 || n == 3)
            return true;
        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        int n = 77;
        if (isPrime(n))
            System.out.println("Prime");
        else System.out.println("Not Prime");
        
    }
}