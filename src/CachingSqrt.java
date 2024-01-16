import java.util.HashMap;
import java.util.Map;
public class CachingSqrt {
    public static Map<Integer, Integer> cache = new HashMap<>();
    public static int sqrt(int number) {
        int result = (int) Math.sqrt(number);
        cache.put(number, result);
        System.out.println("Calculating sqrt(" + number + ") and caching result:" );
        return result;
    }
    public static int cacheSqrt(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Using cached value for sqrt(" + number + ")");
            return cache.get(number);
        }
        System.out.println("No cached value found for sqrt(" + number + ")");
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(cacheSqrt(4));
        System.out.println(cacheSqrt(9));
    }
}
