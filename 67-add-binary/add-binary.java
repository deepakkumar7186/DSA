import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // int num1 = Integer.parseInt(a); 
        // String binary1 = Integer.toBinaryString(num1);

        // int num2 = Integer.parseInt(b); 
        // String binary2 = Integer.toBinaryString(num2);

        // String sum = binary1 + binary2;
        BigInteger num1 = new BigInteger(a, 2); 
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num1.add(num2);
        String result = sum.toString(2);

        return result;
    }
}