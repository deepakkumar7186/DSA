class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] parts1 = num1.split("\\+");
        String[] parts2 = num2.split("\\+");

        int a = Integer.parseInt(parts1[0]); // real part of num1
        int b = Integer.parseInt(parts1[1].replace("i", "")); // imaginary part of num1
        int c = Integer.parseInt(parts2[0]); // real part of num2
        int d = Integer.parseInt(parts2[1].replace("i", "")); // imaginary part of num2

        // Formula: (a + bi)(c + di) = (ac - bd) + (ad + bc)i
        int real = a * c - b * d;
        int imag = a * d + b * c;

        return real + "+" + imag + "i";
    }
}