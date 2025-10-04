class Solution {
    static final int MOD = 1000000007;

    // Function to reverse digits of n
    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    // Modular exponentiation
    private long power(long base, long exp) {
        long res = 1;
        base = base % MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) { // if odd
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1; // divide exp by 2
        }
        return res;
    }

    public int reverseExponentiation(int n) {
        int rev = reverse(n);
        return (int) power(n, rev);
    }
}
