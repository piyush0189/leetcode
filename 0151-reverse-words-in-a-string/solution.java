class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        // Split words by one or more spaces
        String[] words = s.split("\\s+");
        // Use StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the sky is blue"));  // Output: "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  "));  // Output: "world hello"
        System.out.println(solution.reverseWords("a good   example")); // Output: "example good a"
    }
}

