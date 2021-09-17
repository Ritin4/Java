class Palindrome {
    public boolean isPalindrome(int x) {
        String palin = new StringBuilder().append(x).reverse().toString();
        try{
           return (x == (Integer.parseInt(palin))) ? true : false;
        }
        catch (Exception e){
            return false;
        }
        // if(x<0) return false;
        // int reversed =  0, remainder, original =x;
        // while(x != 0){
        //     remainder = x % 10;
        //     reversed = reversed * 10 + remainder;
        //     x /= 10;
        // }
        // return original == reversed;
    }
}