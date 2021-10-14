public class FizBuzz {
    public static  String (int number ){
        if(number % 5 == 0 && number % 3 == 0){
            return "FizzBuzz";
        }
        if (number % 3 == 0 ){
            return "Fizz";
        }
        if (number % 5 == 0 ){
            return "Buzz";
        }
    }
}

