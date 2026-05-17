class Solution {
    public List<String> fizzBuzz(int n) {
        String num = "Fizz";
        String num2 = "Buzz";
        List<String> names = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(i%3 == 0 && i%5 == 0){
                names.add("FizzBuzz");
            }
            else if(i%3 == 0){
                names.add("Fizz");
            }
            else if(i%5 == 0){
                names.add("Buzz");
            }
            else{
                String str = String.valueOf(i);
                names.add(str);
            }
        }
        return names;
    }
}