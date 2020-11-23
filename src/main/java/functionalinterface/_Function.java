package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main (String[] args) {

        //Function Example takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4)); //4+1= 5 *10 =50
        //addBy1AndThenMultiplyBy10.apply(1); //chained function

        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(
                incrementByOneAndMultiply(4, 100)); //4+1 = 5, 5*100 =500 //Normal function

     System.out.println(
    incrementByOneAndMultiplyBiFunction.apply(4, 100)); //4+1 = 5, 5*100 =500 //have to use static for the function to be applied //using BiFunction
}

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number +1; //functional style.. starting from here to up there

    static int incrementByOne (int number) { //the top is the same exact thing as this function right now. Lambda function
        return number +1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy; //this is the same exact thing as the bottom

    static int incrementByOneAndMultiply (int number, int numToMultiplyBy) { //BiFunction
        return (number +1) * numToMultiplyBy;
    }
}
