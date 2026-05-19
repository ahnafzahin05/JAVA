package Class_09_Strings;

public class SumofAllSubstringsM2 {
    // Main method to test the function
    public static void main(String[] args) {
        // Input numeric string
        String s = "6759";

        // Output the sum of all substrings
        System.out.println(sumSubstrings(s));
    }
    // Function to calculate the sum of all substrings of a numeric string
    static int sumSubstrings(String s) {
        // Final answer to store the sum of all substrings
        int ans = 0;

        // Length of the input string
        int n = s.length();

        // Iterate through each starting index of substring
        for (int i = 0; i < n; i++) {
            // Temporary variable to hold current substring value
            int temp = 0;

            // Generate all substrings starting from index i
            for (int j = i; j < n; j++) {
                // Shift the previous value by one digit to the left
                temp *= 10;
                // Add current digit to form the number
                temp += (s.charAt(j) - '0');
                // Add the current substring number to the answer
                ans += temp;
            }
        }

        // Return the final result
        return ans;
    }
}