package Project.Euler;

public class MultiplesOf3And5 {

    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    // Find the sum of all the multiples of 3 or 5 below 1000.

    // Multiples of 3: 3    6   9   12  15
    // Multiples of 5: 5    10  10  15  15
    public static int multiplesOf3And5(int num) {
        int answer = 0;
        int multiplesOf3 = 1;
        int multiplesOf5 = 1;
        int numMultiplesOf3 = 3;
        int numMultiplesOf5 = 5;

        while (numMultiplesOf3 < num || numMultiplesOf5 < num) {

            if (numMultiplesOf3 < numMultiplesOf5) {
                answer += numMultiplesOf3;
                multiplesOf3++;
                numMultiplesOf3 = 3 * multiplesOf3;
            } else if (numMultiplesOf5 < numMultiplesOf3) {
                answer += numMultiplesOf5;
                multiplesOf5++;
                numMultiplesOf5 = 5 * multiplesOf5;
            } else {
                answer += numMultiplesOf3;
                multiplesOf3++;
                multiplesOf5++;
                numMultiplesOf3 = 3 * multiplesOf3;
                numMultiplesOf5 = 5 * multiplesOf5;
            }
        }

        return answer;
    }

    // Time complexity is O(m) where m is the number of multiples of 3 and 5
    // Space complexity is O(1)
}
