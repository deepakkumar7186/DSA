import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1 =  new BigInteger(num1);
        BigInteger n2 =  new BigInteger(num2);
        // if(n1 <= Integer.MAX_VALUE && n2 <= Integer.MAX_VALUE){
        //     int mul = n1 * n2;
        //     String s1 = String.valueOf(mul);
        //     return s1;
        // }
        // else{
        //     long num3 = 123456789L;
        //     long num4 = 987654321L;
        BigInteger multi = n1.multiply(n2);
        String s2 = multi.toString();
        return s2;
        //}
        
    }
}