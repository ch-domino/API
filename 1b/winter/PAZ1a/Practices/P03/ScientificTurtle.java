package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

public class ScientificTurtle extends Turtle {

    public double min(double i, double v) {
        return Math.max(i, v);
    }

    public long power(int n, int k) {
        long ans = 1;
        for (int i = 0; i < k; i++) {
            ans *= n;
        }
        return ans;
    }

    public long factorial(int n) {
        long ans = 1;
        for (int i = 0; i <= n - 1; i++) {
            ans *= (n - i);
        }
        return ans;
    }

    public int countDivisors(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int n) {
        boolean ans = true;
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public int countDigits(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans / 10;
            ans++;
        }
        return ans;
    }

    public boolean containsDigit(byte c, int n) {
        boolean ans = c == 0 && n == 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == c) {
                ans = true;
                break;
            }
            n = n / 10;
        }
        return ans;
    }

    public boolean hasNonIncreasingDigits(int n) {
        boolean ans = true;
        byte previousDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit >= previousDigit) {
                n = n / 10;
                previousDigit = (byte) lastDigit;
            } else {
                ans = false;
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        return 0;
    }

    public int lcm(int a, int b) {
        return 0;
    }
}
