package stream_parts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CountDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        Stream<Integer> s = a.stream();
        long count = s.count();
        System.out.println("Count : " + count);
    }
}

========================||==============================
package stream_parts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class MapFunctionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        Function<Integer, Integer> f = (t) -> t * t;
        a.stream().map(f).forEach(x -> System.out.println(x));
    }
}


======================||================================
package stream_parts;
import java.util.ArrayList;
import java.util.Arrays;

public class FilterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        a.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
    }
}


=======================||=====================================
package stream_parts;
import java.util.ArrayList;
import java.util.Arrays;

public class SortedDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        a.stream().sorted().forEach(x -> System.out.println(x));
    }
}


=============================||==================================
package stream_parts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceBinaryDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        BinaryOperator<Integer> b = (x, y) -> x + y;
        int result = a.stream().reduce(b).get();

        System.out.println("Sum using reduce: " + result);
    }
}





