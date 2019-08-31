package recursive;

public class Factorial {


    public long  factorial(int index) {


        long  accumulator = 1;
        for (int i = 1; i <= index; i++) {
            accumulator *= i;

        }

        return accumulator;
    }

    public long recursive(int index) {
       // if (index == 0) return 1;
        if (index == 0) return 1;

        return recursive(index - 1) *index;
    }

}
