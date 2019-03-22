package MapFunc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */

// Make a map method that takes an ArrayList and a Function<T,R> object and returns an arraylist containing
// all of the elements of the first with the function applied to them.
public class MapFunc {
    public static <T, R> ArrayList<R> map(ArrayList<T> list, Function<T, R> function) {
        ArrayList<R> returnedList = (ArrayList<R>) list.stream()
                .map(function::apply)
                .collect(Collectors.toList());

        return returnedList;

    }
}