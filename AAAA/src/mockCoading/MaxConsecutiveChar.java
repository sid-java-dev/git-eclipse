package mockCoading;

public class MaxConsecutiveChar {
    public static void main(String[] args) {
        String str = "aa bbbb aaa cab";
        
        char maxChar = str.charAt(0);
        int maxCount = 1;

        char currentChar = str.charAt(0);
        int currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChar = currentChar;
                }
                currentChar = str.charAt(i);
                currentCount = 1;
            }
        }

        // Check the last character sequence
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = currentChar;
        }

        System.out.println("Character with maximum consecutive occurrences: " + maxChar);
        System.out.println("Number of consecutive occurrences: " + maxCount);
    }
}

