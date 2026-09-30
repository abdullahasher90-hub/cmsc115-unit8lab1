public class BuggyProgram {
// Fixed by Abdullah Asher
    Fix Task 2 (sumEvenNumbers)
    // Method 1: nested conditionals
    public static String getGrade(int score) {
        if (score >= 90) {
            return "Exceeds";
        } else if (score >= 80) {
            return "Meets";
        } else {
            return "Does Not Meet";
        }
    }

    // Method 2: Loop with array
    public static int sumEvenNumbers(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                sum += values[i];
            }
        }

        return sum;
    }

    // Method 3: Loop with bounds (no array)
    public static int sumRange(int start, int end) {
        int sum = 0;

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Test the program using the JUnit tests");
    }
}
