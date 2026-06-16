class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Append normal characters
                result.append(c);
            } else if (c == '#') {
                // Duplicate the current result
                result.append(result.toString());
            } else if (c == '%') {
                // Reverse the current result
                result.reverse();
            } else if (c == '*') {
                // Remove the last character (if any)
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }
        }

        return result.toString();
    }
}