package Project.Euler;

public class LargestPrimeFactor {

    // The prime factors of 13195 are 5, 7, 13 and 29.
    //
    // What is the largest prime factor of the number 600851475143 ?
    public static long largestPrimeFactor(long num) {
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        long maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (num % 2 == 0) {
            maxPrime = 2;

            // equivalent to n /= 2
            num >>= 1;
        }

        // n must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                maxPrime = i;
                num = num / i;
            }
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (num > 2)
            maxPrime = num;

        return maxPrime;
    }
}
