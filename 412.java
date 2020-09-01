class Solution {
    public List<String> fizzBuzz(int n) {
        // List<String> str = Arrays.asList(new String[n]);
        List<String> str = new ArrayList();
        str.add(Integer.toString(1));
        int fizzer = 3;
        int buzzer = 5;
        for (int i = 2; i < n + 1; i++) {
            if (i % fizzer == 0 && i % buzzer == 0)
                str.add("FizzBuzz");
            else if (i % fizzer == 0)
                str.add("Fizz");
            else if (i % buzzer == 0)
                str.add("Buzz");
            else
                str.add(Integer.toString(i));
        }

        return str;
    }
}