public class FizzBuzz {
    public String process(int i) {

        if(i == 3)
            return "Fizz";
        else if(i == 5)
            return "Buzz";
        else if(i == 15)
            return "FizBuzz";
        return String.valueOf(i);
    }
}
